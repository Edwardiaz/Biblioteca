package form;

/**
 *
 * @grupo 02
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Bienvenido/a");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pnlBienvenida = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblVerUsuarios = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblVerMateriales = new javax.swing.JLabel();
        lblPrestar = new javax.swing.JLabel();
        lblVerPrestamos = new javax.swing.JLabel();
        lblEjemplares1 = new javax.swing.JLabel();
        lblVerInfo = new javax.swing.JLabel();
        lblAcerca = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        pnlBienvenida.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido a Biblioteca \"Amigos de Don Bosco\" !");

        javax.swing.GroupLayout pnlBienvenidaLayout = new javax.swing.GroupLayout(pnlBienvenida);
        pnlBienvenida.setLayout(pnlBienvenidaLayout);
        pnlBienvenidaLayout.setHorizontalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        pnlBienvenidaLayout.setVerticalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblVerUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu_usuario.png"))); // NOI18N
        lblVerUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVerUsuariosMousePressed(evt);
            }
        });

        lblUsuarios.setBackground(new java.awt.Color(0, 0, 51));
        lblUsuarios.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios.setText("Usuarios");

        lblVerMateriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu_ejemplares.png"))); // NOI18N
        lblVerMateriales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerMateriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVerMaterialesMousePressed(evt);
            }
        });

        lblPrestar.setBackground(new java.awt.Color(0, 0, 51));
        lblPrestar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPrestar.setForeground(new java.awt.Color(255, 255, 255));
        lblPrestar.setText("Préstamos");

        lblVerPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu_prestar.png"))); // NOI18N
        lblVerPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVerPrestamosMousePressed(evt);
            }
        });

        lblEjemplares1.setBackground(new java.awt.Color(0, 0, 51));
        lblEjemplares1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEjemplares1.setForeground(new java.awt.Color(255, 255, 255));
        lblEjemplares1.setText("Materiales");

        lblVerInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu_info.png"))); // NOI18N
        lblVerInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVerInfoMousePressed(evt);
            }
        });

        lblAcerca.setBackground(new java.awt.Color(0, 0, 51));
        lblAcerca.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAcerca.setForeground(new java.awt.Color(255, 255, 255));
        lblAcerca.setText("Acerca de");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(lblVerUsuarios))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(lblUsuarios)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPrestar)
                        .addComponent(lblVerPrestamos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblVerMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEjemplares1)
                        .addComponent(lblVerInfo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAcerca)))
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVerUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuarios)
                        .addGap(53, 53, 53)
                        .addComponent(lblVerPrestamos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPrestar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVerMateriales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEjemplares1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(lblVerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAcerca)))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVerUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerUsuariosMousePressed
        // TODO add your handling code here:
        Menu_Usuarios user = new Menu_Usuarios();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVerUsuariosMousePressed

    private void lblVerMaterialesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerMaterialesMousePressed
        // TODO add your handling code here:
        Menu_Materiales mat = new Menu_Materiales();
        mat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVerMaterialesMousePressed

    private void lblVerInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerInfoMousePressed
        // TODO add your handling code here:
        Acerca_De ac = new Acerca_De();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVerInfoMousePressed

    private void lblVerPrestamosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerPrestamosMousePressed
        // TODO add your handling code here:
        Menu_Prestamos pres = new Menu_Prestamos();
        pres.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVerPrestamosMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAcerca;
    private javax.swing.JLabel lblEjemplares1;
    private javax.swing.JLabel lblPrestar;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel lblVerInfo;
    private javax.swing.JLabel lblVerMateriales;
    private javax.swing.JLabel lblVerPrestamos;
    private javax.swing.JLabel lblVerUsuarios;
    private javax.swing.JPanel pnlBienvenida;
    // End of variables declaration//GEN-END:variables
}
