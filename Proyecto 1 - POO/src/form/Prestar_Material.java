package form;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Prestar_Material extends javax.swing.JFrame {

    /**
     * Creates new form Prestar_Material
     */
    public Prestar_Material() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVerUser = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVerMat = new javax.swing.JTable();
        btnPrestar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblNickname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlVerUser.setBackground(new java.awt.Color(0, 0, 51));
        pnlVerUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVerMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblVerMat.setSelectionBackground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(tblVerMat);

        pnlVerUser.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 650, 260));

        btnPrestar.setBackground(new java.awt.Color(0, 0, 204));
        btnPrestar.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestar.setText("Prestar");
        btnPrestar.setBorder(null);
        btnPrestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });
        pnlVerUser.add(btnPrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 80, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        pnlVerUser.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 80, 40));

        txtUsuario.setBackground(new java.awt.Color(0, 0, 51));
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setAlignmentX(0.8F);
        txtUsuario.setBorder(null);
        txtUsuario.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtUsuario.setMinimumSize(new java.awt.Dimension(5, 20));
        txtUsuario.setName("txtUsuario"); // NOI18N
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        pnlVerUser.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 20));

        jSeparator6.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlVerUser.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, -1));

        lblNickname.setBackground(new java.awt.Color(0, 0, 51));
        lblNickname.setForeground(new java.awt.Color(204, 204, 204));
        lblNickname.setText("Ingrese nickname:");
        pnlVerUser.add(lblNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlVerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlVerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed

            
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        // TODO add your handling code here:
        Menu_Prestamos back = new Menu_Prestamos();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Prestar_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestar_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestar_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestar_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestar_Material().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JPanel pnlVerUser;
    private javax.swing.JTable tblVerMat;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
