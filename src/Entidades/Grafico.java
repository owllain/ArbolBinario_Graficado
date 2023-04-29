package Entidades;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Grafico extends JPanel {

    private Arbol miArbol;
    private HashMap posicionNodos = null;
    private HashMap subtreeSizes = null;
    private boolean dirty = true;
    private int parent2child = 20, child2child = 30;
    private Dimension empty = new Dimension(0, 0);
    private FontMetrics fm = null;

    public Grafico(Arbol miArbol) {
        this.miArbol = miArbol;
        this.setBackground(Color.WHITE);
        posicionNodos = new HashMap();
        subtreeSizes = new HashMap();
        dirty = true;
        repaint();
    }

    private void calcularPosiciones() {
        posicionNodos.clear();
        subtreeSizes.clear();
        Nodo root = this.miArbol.getRaiz();
        if (root != null) {
            calcularTamañoSubarbol(root);
            calcularPosicion(root, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        }
    }

    private Dimension calcularTamañoSubarbol(Nodo nodo) {
        if (nodo == null) {
            return new Dimension(0, 0);
        }

        Dimension ld = calcularTamañoSubarbol(nodo.getLeft());
        Dimension rd = calcularTamañoSubarbol(nodo.getRight());

        int h = fm.getHeight() + parent2child + Math.max(ld.height, rd.height);
        int w = ld.width + child2child + rd.width;

        Dimension d = new Dimension(w, h);
        subtreeSizes.put(nodo, d);

        return d;
    }

    private void calcularPosicion(Nodo nodo, int izquierda, int derecha, int arriba) {
        if (nodo == null) {
            return;
        }

        Dimension ld = (Dimension) subtreeSizes.get(nodo.getLeft());
        if (ld == null) {
            ld = empty;
        }

        Dimension rd = (Dimension) subtreeSizes.get(nodo.getRight());
        if (rd == null) {
            rd = empty;
        }

        int center = 0;

        if (derecha != Integer.MAX_VALUE) {
            center = derecha - rd.width - child2child / 2;
        } else if (izquierda != Integer.MAX_VALUE) {
            center = izquierda + ld.width + child2child / 2;
        }
        int width = fm.stringWidth(nodo.getValue() + "");

        posicionNodos.put(nodo, new Rectangle(center - width / 2 - 3, arriba, width + 6, fm.getHeight()));

        calcularPosicion(nodo.getLeft(), Integer.MAX_VALUE, center - child2child / 2, arriba + fm.getHeight() + parent2child);
        calcularPosicion(nodo.getRight(), center + child2child / 2, Integer.MAX_VALUE, arriba + fm.getHeight() + parent2child);
    }

    private void dibujarArbol(Graphics2D grafico, Nodo nodo, int puntox, int puntoy, int yoffs) {
        if (nodo == null) {
            return;
        }

        Rectangle fondo = (Rectangle) posicionNodos.get(nodo);
        grafico.draw(fondo);
        grafico.drawString(nodo.getValue() + "", fondo.x + 3, fondo.y + yoffs);

        if (puntox != Integer.MAX_VALUE) {
            grafico.drawLine(puntox, puntoy, (int) (fondo.x + fondo.width / 2), fondo.y);
        }

        dibujarArbol(grafico, nodo.getLeft(), (int) (fondo.x + fondo.width / 2), fondo.y + fondo.height, yoffs);
        dibujarArbol(grafico, nodo.getRight(), (int) (fondo.x + fondo.width / 2), fondo.y + fondo.height, yoffs);

    }

    public void paint(Graphics grafico) {
        super.paint(grafico);
        fm = grafico.getFontMetrics();

        if (dirty) {
            calcularPosiciones();
            dirty = false;
        }

        Graphics2D g2d = (Graphics2D) grafico;
        g2d.translate(getWidth() / 2, parent2child);
        dibujarArbol(g2d, this.miArbol.getRaiz(), Integer.MAX_VALUE, Integer.MAX_VALUE,
                fm.getLeading() + fm.getAscent());
        fm = null;
    }

}
