package GUI;

import Entidades.Arbol;
import Entidades.Utilidades;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Insertar extends javax.swing.JPanel {

    private Arbol objArbol;
    JPanel JP_TREE;
    JInternalFrame FR_ARBOL;
    private ArrayList<Object> listaInterfaz = new ArrayList<>();

    public Insertar(JPanel jP_Tree, JInternalFrame fr_Arbol, Arbol obj_Arbol) {
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
        btn_Save = new javax.swing.JPanel();
        lbl_Save = new javax.swing.JLabel();
        txt_InsertarLetra = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 255));
        setForeground(new java.awt.Color(51, 153, 255));
        setMaximumSize(new java.awt.Dimension(231, 65));
        setMinimumSize(new java.awt.Dimension(231, 65));
        setPreferredSize(new java.awt.Dimension(231, 65));
        setRequestFocusEnabled(false);

        jP_Opcion1.setBackground(new java.awt.Color(211, 236, 250));
        jP_Opcion1.setForeground(new java.awt.Color(51, 204, 255));

        btn_Save.setBackground(new java.awt.Color(102, 204, 255));

        lbl_Save.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lbl_Save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Save.setText("Agregar");
        lbl_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_SaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_SaveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_SaveLayout = new javax.swing.GroupLayout(btn_Save);
        btn_Save.setLayout(btn_SaveLayout);
        btn_SaveLayout.setHorizontalGroup(
            btn_SaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Save, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btn_SaveLayout.setVerticalGroup(
            btn_SaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
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
                .addGap(22, 22, 22)
                .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_InsertarLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jP_Opcion1Layout.setVerticalGroup(
            jP_Opcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Opcion1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jP_Opcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_InsertarLetra)
                    .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

    private void lbl_SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SaveMouseClicked

        try {
            if (!"".equals(txt_InsertarLetra.getText())) {
                char dato = txt_InsertarLetra.getText().charAt(0);
                this.objArbol.Add(dato);
                Utilidades.limpiar(listaInterfaz);
                Utilidades.repintarArbol(JP_TREE, FR_ARBOL, objArbol);

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un dato válido.", "Intenta de nuevo...", 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! No se pudo insertar el dato." + e.getMessage(), "Intenta de nuevo...", 0);
        }

    }//GEN-LAST:event_lbl_SaveMouseClicked

    private void lbl_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SaveMouseEntered
        btn_Save.setBackground(new Color(0, 156, 223));
        lbl_Save.setForeground(Color.white);
    }//GEN-LAST:event_lbl_SaveMouseEntered

    private void lbl_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SaveMouseExited
        btn_Save.setBackground(new Color(102, 204, 255));
        lbl_Save.setForeground(Color.black);
    }//GEN-LAST:event_lbl_SaveMouseExited

    private void txt_InsertarLetraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_InsertarLetraKeyTyped
        Utilidades.soloLetras(evt);
    }//GEN-LAST:event_txt_InsertarLetraKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_Save;
    private javax.swing.JPanel jP_Opcion1;
    private javax.swing.JLabel lbl_Save;
    private javax.swing.JTextField txt_InsertarLetra;
    // End of variables declaration//GEN-END:variables
}
