package GUI;

import Entidades.Arbol;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {

    int xMouse, yMouse;
    private Arbol obj_Arbol = new Arbol();

    public Main() {
        initComponents();
        this.jP_Graficar.setVisible(false);
        //this.jP_Container.setVisible(false);
        this.jP_Insertar.setVisible(false);
        this.jP_Eliminar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jP_Background = new javax.swing.JPanel();
        jP_Header = new javax.swing.JPanel();
        btn_Exit = new javax.swing.JPanel();
        lbl_Exit = new javax.swing.JLabel();
        btn_Min = new javax.swing.JPanel();
        lbl_Min = new javax.swing.JLabel();
        btn_Opcion1 = new javax.swing.JPanel();
        lbl_Opcion1 = new javax.swing.JLabel();
        btn_Opcion2 = new javax.swing.JPanel();
        lbl_Opcion2 = new javax.swing.JLabel();
        btn_Opcion3 = new javax.swing.JPanel();
        lbl_Opcion3 = new javax.swing.JLabel();
        jP_Container = new javax.swing.JPanel();
        jP_Insertar = new javax.swing.JPanel();
        jP_Eliminar = new javax.swing.JPanel();
        jP_Graficar = new javax.swing.JPanel();
        jP_Tree = new javax.swing.JPanel();
        fr_Arbol = new javax.swing.JInternalFrame();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jP_Background.setBackground(new java.awt.Color(102, 204, 255));
        jP_Background.setPreferredSize(new java.awt.Dimension(600, 500));

        jP_Header.setBackground(new java.awt.Color(211, 236, 250));
        jP_Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jP_HeaderMouseDragged(evt);
            }
        });
        jP_Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jP_HeaderMousePressed(evt);
            }
        });

        btn_Exit.setBackground(new java.awt.Color(211, 236, 250));
        btn_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Exit.setPreferredSize(new java.awt.Dimension(30, 30));

        lbl_Exit.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        lbl_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Exit.setText("X");
        lbl_Exit.setToolTipText("Cierra la aplicación.");
        lbl_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_ExitLayout = new javax.swing.GroupLayout(btn_Exit);
        btn_Exit.setLayout(btn_ExitLayout);
        btn_ExitLayout.setHorizontalGroup(
            btn_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        btn_ExitLayout.setVerticalGroup(
            btn_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_ExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Exit))
        );

        btn_Min.setBackground(new java.awt.Color(211, 236, 250));
        btn_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Min.setPreferredSize(new java.awt.Dimension(30, 30));

        lbl_Min.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_Min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Min.setText("—");
        lbl_Min.setToolTipText("Minimizar pantalla.");
        lbl_Min.setPreferredSize(new java.awt.Dimension(30, 30));
        lbl_Min.setRequestFocusEnabled(false);
        lbl_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_MinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_MinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_MinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_MinLayout = new javax.swing.GroupLayout(btn_Min);
        btn_Min.setLayout(btn_MinLayout);
        btn_MinLayout.setHorizontalGroup(
            btn_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_MinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Min, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_MinLayout.setVerticalGroup(
            btn_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_MinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_Opcion1.setBackground(new java.awt.Color(211, 236, 250));
        btn_Opcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Opcion1.setPreferredSize(new java.awt.Dimension(30, 30));

        lbl_Opcion1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        lbl_Opcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Opcion1.setText("Insertar");
        lbl_Opcion1.setToolTipText("Inserta un nuevo nodo.");
        lbl_Opcion1.setPreferredSize(new java.awt.Dimension(30, 30));
        lbl_Opcion1.setRequestFocusEnabled(false);
        lbl_Opcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Opcion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_Opcion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_Opcion1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_Opcion1Layout = new javax.swing.GroupLayout(btn_Opcion1);
        btn_Opcion1.setLayout(btn_Opcion1Layout);
        btn_Opcion1Layout.setHorizontalGroup(
            btn_Opcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_Opcion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_Opcion1Layout.setVerticalGroup(
            btn_Opcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_Opcion1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_Opcion2.setBackground(new java.awt.Color(211, 236, 250));
        btn_Opcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Opcion2.setPreferredSize(new java.awt.Dimension(30, 30));

        lbl_Opcion2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        lbl_Opcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Opcion2.setText("Eliminar");
        lbl_Opcion2.setToolTipText("Selecciona un nodo y lo elimina.");
        lbl_Opcion2.setPreferredSize(new java.awt.Dimension(30, 30));
        lbl_Opcion2.setRequestFocusEnabled(false);
        lbl_Opcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Opcion2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_Opcion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_Opcion2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_Opcion2Layout = new javax.swing.GroupLayout(btn_Opcion2);
        btn_Opcion2.setLayout(btn_Opcion2Layout);
        btn_Opcion2Layout.setHorizontalGroup(
            btn_Opcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_Opcion2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_Opcion2Layout.setVerticalGroup(
            btn_Opcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_Opcion2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_Opcion3.setBackground(new java.awt.Color(211, 236, 250));
        btn_Opcion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Opcion3.setPreferredSize(new java.awt.Dimension(30, 30));

        lbl_Opcion3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        lbl_Opcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Opcion3.setText("Graficar");
        lbl_Opcion3.setToolTipText("Muestra en grafico el árbol.");
        lbl_Opcion3.setPreferredSize(new java.awt.Dimension(30, 30));
        lbl_Opcion3.setRequestFocusEnabled(false);
        lbl_Opcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Opcion3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_Opcion3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_Opcion3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_Opcion3Layout = new javax.swing.GroupLayout(btn_Opcion3);
        btn_Opcion3.setLayout(btn_Opcion3Layout);
        btn_Opcion3Layout.setHorizontalGroup(
            btn_Opcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_Opcion3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_Opcion3Layout.setVerticalGroup(
            btn_Opcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_Opcion3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jP_HeaderLayout = new javax.swing.GroupLayout(jP_Header);
        jP_Header.setLayout(jP_HeaderLayout);
        jP_HeaderLayout.setHorizontalGroup(
            jP_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_HeaderLayout.createSequentialGroup()
                .addComponent(btn_Opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jP_HeaderLayout.setVerticalGroup(
            jP_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btn_Opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_Opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_Opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jP_Container.setBackground(new java.awt.Color(102, 204, 255));
        jP_Container.setMaximumSize(new java.awt.Dimension(231, 65));
        jP_Container.setMinimumSize(new java.awt.Dimension(231, 65));
        jP_Container.setPreferredSize(new java.awt.Dimension(231, 65));

        jP_Insertar.setMaximumSize(new java.awt.Dimension(231, 65));
        jP_Insertar.setMinimumSize(new java.awt.Dimension(231, 65));
        jP_Insertar.setPreferredSize(new java.awt.Dimension(231, 65));

        javax.swing.GroupLayout jP_InsertarLayout = new javax.swing.GroupLayout(jP_Insertar);
        jP_Insertar.setLayout(jP_InsertarLayout);
        jP_InsertarLayout.setHorizontalGroup(
            jP_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        jP_InsertarLayout.setVerticalGroup(
            jP_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jP_Eliminar.setMaximumSize(new java.awt.Dimension(231, 65));
        jP_Eliminar.setMinimumSize(new java.awt.Dimension(231, 65));
        jP_Eliminar.setPreferredSize(new java.awt.Dimension(231, 65));

        javax.swing.GroupLayout jP_EliminarLayout = new javax.swing.GroupLayout(jP_Eliminar);
        jP_Eliminar.setLayout(jP_EliminarLayout);
        jP_EliminarLayout.setHorizontalGroup(
            jP_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        jP_EliminarLayout.setVerticalGroup(
            jP_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jP_ContainerLayout = new javax.swing.GroupLayout(jP_Container);
        jP_Container.setLayout(jP_ContainerLayout);
        jP_ContainerLayout.setHorizontalGroup(
            jP_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ContainerLayout.createSequentialGroup()
                .addComponent(jP_Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jP_ContainerLayout.setVerticalGroup(
            jP_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jP_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jP_Graficar.setBackground(new java.awt.Color(255, 255, 255));
        jP_Graficar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Árbol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jP_Graficar.setMaximumSize(new java.awt.Dimension(636, 369));
        jP_Graficar.setMinimumSize(new java.awt.Dimension(636, 369));
        jP_Graficar.setOpaque(false);

        jP_Tree.setBackground(new java.awt.Color(255, 255, 255));
        jP_Tree.setMaximumSize(new java.awt.Dimension(502, 323));
        jP_Tree.setMinimumSize(new java.awt.Dimension(502, 323));

        fr_Arbol.setIconifiable(true);
        fr_Arbol.setMaximizable(true);
        fr_Arbol.setResizable(true);
        fr_Arbol.setEnabled(false);
        fr_Arbol.setFocusCycleRoot(false);
        fr_Arbol.setVisible(true);

        javax.swing.GroupLayout fr_ArbolLayout = new javax.swing.GroupLayout(fr_Arbol.getContentPane());
        fr_Arbol.getContentPane().setLayout(fr_ArbolLayout);
        fr_ArbolLayout.setHorizontalGroup(
            fr_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        fr_ArbolLayout.setVerticalGroup(
            fr_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jP_TreeLayout = new javax.swing.GroupLayout(jP_Tree);
        jP_Tree.setLayout(jP_TreeLayout);
        jP_TreeLayout.setHorizontalGroup(
            jP_TreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(jP_TreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_TreeLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fr_Arbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jP_TreeLayout.setVerticalGroup(
            jP_TreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
            .addGroup(jP_TreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_TreeLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fr_Arbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jP_GraficarLayout = new javax.swing.GroupLayout(jP_Graficar);
        jP_Graficar.setLayout(jP_GraficarLayout);
        jP_GraficarLayout.setHorizontalGroup(
            jP_GraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_GraficarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP_Tree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jP_GraficarLayout.setVerticalGroup(
            jP_GraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_GraficarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_Tree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP_BackgroundLayout = new javax.swing.GroupLayout(jP_Background);
        jP_Background.setLayout(jP_BackgroundLayout);
        jP_BackgroundLayout.setHorizontalGroup(
            jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_BackgroundLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP_Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP_Container, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jP_BackgroundLayout.setVerticalGroup(
            jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BackgroundLayout.createSequentialGroup()
                .addComponent(jP_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jP_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jP_HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jP_HeaderMousePressed

    private void jP_HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jP_HeaderMouseDragged

    private void lbl_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_ExitMouseClicked

    private void lbl_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ExitMouseEntered
        btn_Exit.setBackground(new Color(0, 156, 223));
        lbl_Exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_ExitMouseEntered

    private void lbl_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ExitMouseExited
        btn_Exit.setBackground(new Color(211, 236, 250));
        lbl_Exit.setForeground(Color.black);
    }//GEN-LAST:event_lbl_ExitMouseExited

    private void lbl_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_MinMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lbl_MinMouseClicked

    private void lbl_MinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_MinMouseEntered
        btn_Min.setBackground(new Color(0, 156, 223));
        lbl_Min.setForeground(Color.white);
    }//GEN-LAST:event_lbl_MinMouseEntered

    private void lbl_MinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_MinMouseExited
        btn_Min.setBackground(new Color(211, 236, 250));
        lbl_Min.setForeground(Color.black);
    }//GEN-LAST:event_lbl_MinMouseExited

    private void lbl_Opcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Opcion1MouseClicked

        if (jP_Insertar.isVisible() == false) {
            this.jP_Insertar.setVisible(true);
        }
        Insertar Opcion1 = new Insertar(jP_Tree, fr_Arbol, obj_Arbol);
        Show_Opcion1(Opcion1);

    }//GEN-LAST:event_lbl_Opcion1MouseClicked

    private void lbl_Opcion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Opcion1MouseEntered
        btn_Opcion1.setBackground(new Color(0, 156, 223));
        lbl_Opcion1.setForeground(Color.white);
    }//GEN-LAST:event_lbl_Opcion1MouseEntered

    private void lbl_Opcion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Opcion1MouseExited
        btn_Opcion1.setBackground(new Color(211, 236, 250));
        lbl_Opcion1.setForeground(Color.black);
    }//GEN-LAST:event_lbl_Opcion1MouseExited

    private void lbl_Opcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Opcion2MouseClicked
        if (jP_Eliminar.isVisible() == false) {
            this.jP_Eliminar.setVisible(true);
        }
        Eliminar Opcion2 = new Eliminar(jP_Tree, fr_Arbol, obj_Arbol);
        Show_Opcion2(Opcion2);

    }//GEN-LAST:event_lbl_Opcion2MouseClicked

    private void lbl_Opcion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Opcion2MouseEntered
        btn_Opcion2.setBackground(new Color(0, 156, 223));
        lbl_Opcion2.setForeground(Color.white);
    }//GEN-LAST:event_lbl_Opcion2MouseEntered

    private void lbl_Opcion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Opcion2MouseExited
        btn_Opcion2.setBackground(new Color(211, 236, 250));
        lbl_Opcion2.setForeground(Color.black);
    }//GEN-LAST:event_lbl_Opcion2MouseExited

    private void lbl_Opcion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Opcion3MouseClicked

        this.jP_Graficar.setVisible(true);
        repintarArbol();
    }//GEN-LAST:event_lbl_Opcion3MouseClicked

    private void lbl_Opcion3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Opcion3MouseEntered
        btn_Opcion3.setBackground(new Color(0, 156, 223));
        lbl_Opcion3.setForeground(Color.white);
    }//GEN-LAST:event_lbl_Opcion3MouseEntered

    private void lbl_Opcion3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Opcion3MouseExited
        btn_Opcion3.setBackground(new Color(211, 236, 250));
        lbl_Opcion3.setForeground(Color.black);
    }//GEN-LAST:event_lbl_Opcion3MouseExited

    private void Show_Opcion1(JPanel JPContainer) {

        JPContainer.setSize(231, 65);
        JPContainer.setLocation(0, 0);
        jP_Insertar.removeAll();
        jP_Insertar.add(JPContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jP_Insertar.revalidate();
        jP_Insertar.repaint();
    }

    private void Show_Opcion2(JPanel JPContainer) {

        JPContainer.setSize(231, 65);
        JPContainer.setLocation(0, 0);
        jP_Eliminar.removeAll();
        jP_Eliminar.add(JPContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jP_Eliminar.revalidate();
        jP_Eliminar.repaint();
    }

    public void repintarArbol() {
        this.jP_Tree.removeAll();
        Rectangle tamaño = this.fr_Arbol.getBounds();
        this.fr_Arbol = null;

        this.fr_Arbol = new JInternalFrame("", true);
        this.jP_Tree.add(this.fr_Arbol, JLayeredPane.DEFAULT_LAYER);
        this.fr_Arbol.setVisible(true);
        this.fr_Arbol.setBounds(tamaño);
        this.fr_Arbol.setEnabled(false);
        this.fr_Arbol.add(this.obj_Arbol.getGrafico(), BorderLayout.CENTER);
        fr_Arbol.setUI(null);

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_Exit;
    private javax.swing.JPanel btn_Min;
    private javax.swing.JPanel btn_Opcion1;
    private javax.swing.JPanel btn_Opcion2;
    private javax.swing.JPanel btn_Opcion3;
    private javax.swing.JInternalFrame fr_Arbol;
    private javax.swing.JPanel jP_Background;
    private javax.swing.JPanel jP_Container;
    private javax.swing.JPanel jP_Eliminar;
    private javax.swing.JPanel jP_Graficar;
    private javax.swing.JPanel jP_Header;
    private javax.swing.JPanel jP_Insertar;
    private javax.swing.JPanel jP_Tree;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbl_Exit;
    private javax.swing.JLabel lbl_Min;
    private javax.swing.JLabel lbl_Opcion1;
    private javax.swing.JLabel lbl_Opcion2;
    private javax.swing.JLabel lbl_Opcion3;
    // End of variables declaration//GEN-END:variables
}
