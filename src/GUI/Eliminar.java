package GUI;

import Entidades.Arbol;
import Entidades.Utilidades;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Eliminar extends javax.swing.JPanel {

    private Arbol objArbol;
    JPanel JP_TREE;
    JInternalFrame FR_ARBOL;
    private ArrayList<Object> listaInterfaz = new ArrayList<>();

    public Eliminar(JPanel jP_Tree, JInternalFrame fr_Arbol, Arbol obj_Arbol) {
        initComponents();
        objArbol = obj_Arbol;
        JP_TREE = jP_Tree;
        FR_ARBOL = fr_Arbol;
        listaInterfaz.add(txt_InsertarLetra);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Opcion1 = new javax.swing.JPanel();
        btn_Delete = new javax.swing.JPanel();
        lbl_Delete = new javax.swing.JLabel();
        txt_InsertarLetra = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 255));
        setForeground(new java.awt.Color(51, 153, 255));
        setMaximumSize(new java.awt.Dimension(231, 65));
        setMinimumSize(new java.awt.Dimension(231, 65));
        setPreferredSize(new java.awt.Dimension(231, 65));

        jP_Opcion1.setBackground(new java.awt.Color(211, 236, 250));
        jP_Opcion1.setForeground(new java.awt.Color(51, 204, 255));

        btn_Delete.setBackground(new java.awt.Color(102, 204, 255));

        lbl_Delete.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lbl_Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Delete.setText("Eliminar");
        lbl_Delete.setToolTipText("");
        lbl_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_DeleteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_DeleteLayout = new javax.swing.GroupLayout(btn_Delete);
        btn_Delete.setLayout(btn_DeleteLayout);
        btn_DeleteLayout.setHorizontalGroup(
            btn_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btn_DeleteLayout.setVerticalGroup(
            btn_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txt_InsertarLetra.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        txt_InsertarLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_InsertarLetraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jP_Opcion1Layout = new javax.swing.GroupLayout(jP_Opcion1);
        jP_Opcion1.setLayout(jP_Opcion1Layout);
        jP_Opcion1Layout.setHorizontalGroup(
            jP_Opcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Opcion1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_InsertarLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jP_Opcion1Layout.setVerticalGroup(
            jP_Opcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Opcion1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jP_Opcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_InsertarLetra)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Opcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Opcion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DeleteMouseClicked

        try {
            if (!"".equals(txt_InsertarLetra.getText())) {
                char dato = txt_InsertarLetra.getText().charAt(0);
                if (objArbol.getRaiz() != null) {

                    if (objArbol.Delete(dato)) {
                        Utilidades.limpiar(listaInterfaz);
                        Utilidades.repintarArbol(JP_TREE, FR_ARBOL, objArbol);
                        JOptionPane.showMessageDialog(null, "El dato fue eliminado correctamente.", " ...", 1);
                    } else {

                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el dato.", "Intenta de nuevo...", 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un dato válido.", "Intenta de nuevo...", 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e.getMessage(), "Intenta de nuevo...", 0);

        }
    }//GEN-LAST:event_lbl_DeleteMouseClicked

    private void lbl_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DeleteMouseEntered
        btn_Delete.setBackground(new Color(0, 156, 223));
        lbl_Delete.setForeground(Color.white);
    }//GEN-LAST:event_lbl_DeleteMouseEntered

    private void lbl_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DeleteMouseExited
        btn_Delete.setBackground(new Color(102, 204, 255));
        lbl_Delete.setForeground(Color.black);
    }//GEN-LAST:event_lbl_DeleteMouseExited

    private void txt_InsertarLetraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_InsertarLetraKeyTyped
        Utilidades.soloLetras(evt);
    }//GEN-LAST:event_txt_InsertarLetraKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_Delete;
    private javax.swing.JPanel jP_Opcion1;
    private javax.swing.JLabel lbl_Delete;
    private javax.swing.JTextField txt_InsertarLetra;
    // End of variables declaration//GEN-END:variables
}
