package Entidades;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void Add(char dato) {

        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
            JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
        } else {
            this.addNodo(this.raiz, dato);
        }

    }

    private void addNodo(Nodo padre, char dato) {

        if (padre.getValue() != dato) {
            if (padre.getValue() > dato) {
                if (padre.getLeft() == null) {
                    padre.setLeft(new Nodo(dato));
                    JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                } else {
                    this.addNodo(padre.getLeft(), dato);
                }
            } else {
                if (padre.getRight() == null) {
                    padre.setRight(new Nodo(dato));
                    JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                } else {
                    this.addNodo(padre.getRight(), dato);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El dato ya existe en el árbol.", "Intenta de nuevo...", 0);

        }

    }

    public boolean Delete(char value) {
        Nodo auxiliar = raiz;
        Nodo padre = raiz;

        boolean Hijo_Izquierdo = true;

        while (auxiliar.getValue() != value) {
            padre = auxiliar;
            if (value < auxiliar.getValue()) {
                Hijo_Izquierdo = true;
                auxiliar = auxiliar.getLeft();
            } else {
                Hijo_Izquierdo = false;
                auxiliar = auxiliar.getRight();
            }
            if (auxiliar == null) {
                return false;
            }
        }

        if (auxiliar.getLeft() == null && auxiliar.getRight() == null) {
            if (auxiliar == raiz) {
                raiz = null;
            } else if (Hijo_Izquierdo) {
                padre.setLeft(null);
            } else {
                padre.setRight(null);
            }
        } else if (auxiliar.getRight() == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.getLeft();
            } else if (Hijo_Izquierdo) {
                padre.setLeft(auxiliar.getLeft());
            } else {
                padre.setRight(auxiliar.getLeft());
            }
        } else if (auxiliar.getLeft() == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.getRight();
            } else if (Hijo_Izquierdo) {
                padre.setRight(auxiliar.getRight());
            } else {
                padre.setLeft(auxiliar.getRight());
            }
        } else {
            Nodo reemplazo = Search(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (Hijo_Izquierdo) {
                padre.setLeft(reemplazo);
            } else {
                padre.setRight(reemplazo);
            }
            reemplazo.setLeft(auxiliar.getLeft());
        }
        return true;
    }

    public Nodo Search(Nodo nodoReemplazable) {
        Nodo reemplazarPadre = nodoReemplazable;
        Nodo reemplazo = nodoReemplazable;
        Nodo auxiliar = nodoReemplazable.getRight();

        while (auxiliar != null) {
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.getLeft();
        }
        if (reemplazo != nodoReemplazable.getRight()) {
            reemplazarPadre.setLeft(reemplazo.getRight());
            reemplazo.setRight(nodoReemplazable.getRight());
        }

        return reemplazo;
    }

    public JPanel getGrafico() {
        return new Grafico(this);
    }

 

}
