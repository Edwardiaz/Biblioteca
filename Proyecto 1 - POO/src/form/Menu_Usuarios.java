/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Menu_Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Usuarios
     */
    public Menu_Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Usuarios");
        
        //DESHABILITAR BOTON CERRAR
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Usar el boton SALIR del menu inicio!", "AVISO",JOptionPane.INFORMATION_MESSAGE);
          }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAgregarUser = new javax.swing.JLabel();
        lblPrivilegios = new javax.swing.JLabel();
        lblNuevo = new javax.swing.JLabel();
        lblPrivi = new javax.swing.JLabel();
        lblVerUsuario = new javax.swing.JLabel();
        lblVer = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        lblReturn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblRestablecer = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();
        lblRes2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        lblAgregarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add-user.png"))); // NOI18N
        lblAgregarUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAgregarUser.setName("lblAgregarUser"); // NOI18N
        lblAgregarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAgregarUserMousePressed(evt);
            }
        });

        lblPrivilegios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/privilegios.png"))); // NOI18N
        lblPrivilegios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPrivilegios.setName("lblPrivilegios"); // NOI18N
        lblPrivilegios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblPrivilegiosMousePressed(evt);
            }
        });

        lblNuevo.setBackground(new java.awt.Color(0, 0, 51));
        lblNuevo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevo.setText("Agregar");
        lblNuevo.setName("lblNuevo"); // NOI18N

        lblPrivi.setBackground(new java.awt.Color(0, 0, 51));
        lblPrivi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPrivi.setForeground(new java.awt.Color(255, 255, 255));
        lblPrivi.setText("Privilegios");
        lblPrivi.setName("lblPrivi"); // NOI18N

        lblVerUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ver user.png"))); // NOI18N
        lblVerUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVerUsuario.setName("lblVerUsuario"); // NOI18N
        lblVerUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVerUsuarioMousePressed(evt);
            }
        });

        lblVer.setBackground(new java.awt.Color(0, 0, 51));
        lblVer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblVer.setForeground(new java.awt.Color(255, 255, 255));
        lblVer.setText("Ver");
        lblVer.setName("lblNuevo"); // NOI18N

        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Regresar.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblRegresar.setName("lblRegresar"); // NOI18N
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRegresarMousePressed(evt);
            }
        });

        lblReturn.setBackground(new java.awt.Color(0, 0, 51));
        lblReturn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReturn.setForeground(new java.awt.Color(255, 255, 255));
        lblReturn.setText("Regresar");
        lblReturn.setName("lblReturn"); // NOI18N

        lblRestablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Restablecer.png"))); // NOI18N
        lblRestablecer.setToolTipText("");
        lblRestablecer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblRestablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRestablecerMousePressed(evt);
            }
        });

        lblRes.setBackground(new java.awt.Color(0, 0, 51));
        lblRes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRes.setForeground(new java.awt.Color(255, 255, 255));
        lblRes.setText("Restablecer");
        lblRes.setName("lblPrivi"); // NOI18N

        lblRes2.setBackground(new java.awt.Color(0, 0, 51));
        lblRes2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRes2.setForeground(new java.awt.Color(255, 255, 255));
        lblRes2.setText("contraseña");
        lblRes2.setName("lblPrivi"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVerUsuario)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lblVer)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegresar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblReturn)))
                        .addGap(148, 148, 148))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgregarUser)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblNuevo)))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrivilegios)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPrivi)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRestablecer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblRes2)
                                .addComponent(lblRes)))
                        .addGap(139, 139, 139))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgregarUser)
                            .addComponent(lblPrivilegios)
                            .addComponent(lblRestablecer)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrivi)
                    .addComponent(lblNuevo)
                    .addComponent(lblRes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVerUsuario)
                    .addComponent(lblRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVer)
                    .addComponent(lblReturn))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMousePressed
        // TODO add your handling code here:
        Dashboard db = new Dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegresarMousePressed

    private void lblAgregarUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarUserMousePressed
        // TODO add your handling code here:
        AgregarUser user = new AgregarUser();
        user.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_lblAgregarUserMousePressed

    private void lblVerUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerUsuarioMousePressed
        // TODO add your handling code here:
        Ver_Usuario ver = null;
        try {
            ver = new Ver_Usuario();
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        ver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVerUsuarioMousePressed

    private void lblPrivilegiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrivilegiosMousePressed
        // TODO add your handling code here:
        Ver_Roles ver = null;
        try {
            ver = new Ver_Roles();
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        ver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblPrivilegiosMousePressed

    private void lblRestablecerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestablecerMousePressed
        // TODO add your handling code here:
        cambiarClave usr = new cambiarClave();
        usr.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_lblRestablecerMousePressed

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
            java.util.logging.Logger.getLogger(Menu_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgregarUser;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblPrivi;
    private javax.swing.JLabel lblPrivilegios;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblRes;
    private javax.swing.JLabel lblRes2;
    private javax.swing.JLabel lblRestablecer;
    private javax.swing.JLabel lblReturn;
    private javax.swing.JLabel lblVer;
    private javax.swing.JLabel lblVerUsuario;
    // End of variables declaration//GEN-END:variables
}
