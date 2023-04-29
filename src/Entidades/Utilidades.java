package Entidades;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Utilidades {

    public static boolean Paint;

    public static void soloLetras(java.awt.event.KeyEvent evt) {
        try {
            char key = evt.getKeyChar();
            if ((key >= 32 && key <= 64) || (key >= 91 && key <= 96) || (key >= 123 && key <= 255)) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Error! Ingrese unicamente letras!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error!" + e.getMessage());
        }
    }

    public static void limpiar(ArrayList<Object> lista) {
        for (int x = 0; x < lista.size(); x++) {
            if (lista.get(x).toString().contains("JTextField")) {
                ((JTextField) lista.get(x)).setText("");
            }
        }
    }

    public static void repintarArbol(JPanel jP_Tree, JInternalFrame fr_Arbol, Arbol obj_Arbol) {
        jP_Tree.removeAll();
        Rectangle tamaño = fr_Arbol.getBounds();
        fr_Arbol = null;

        fr_Arbol = new JInternalFrame("", true);
        jP_Tree.add(fr_Arbol, JLayeredPane.DEFAULT_LAYER);
        fr_Arbol.setVisible(true);
        fr_Arbol.setBounds(tamaño);
        fr_Arbol.setEnabled(false);
        fr_Arbol.add(obj_Arbol.getGrafico(), BorderLayout.CENTER);
        fr_Arbol.setUI(null);

    }

}
