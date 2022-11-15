/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import datos.Globales;
import datos.Usuario;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class cambiarClave extends javax.swing.JFrame {

    /**
     * Creates new form AgregarUser
     */
    public cambiarClave(){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cambiar contrseña");
        
        //DESHABILITAR BOTON CERRAR
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Usar el boton SALIR del menu inicio!", "AVISO",JOptionPane.INFORMATION_MESSAGE);
          }
        });           
        
        this.lblTitulo.setText("Hola " + Globales.nombreUsuario +" !");
        this.lblTitulo2.setText("Favor confirmar datos de usuario:");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtNickname = new javax.swing.JTextField();
        lblTitulo2 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        lblContra = new javax.swing.JLabel();
        txtContraActual = new javax.swing.JPasswordField();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNickname1 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        txtContraNueva = new javax.swing.JPasswordField();
        lblContra1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 455));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 107, 5, 19));

        jSeparator8.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 183, -1));

        txtNickname.setBackground(new java.awt.Color(0, 0, 51));
        txtNickname.setForeground(new java.awt.Color(204, 204, 204));
        txtNickname.setText("Ingrese nickname");
        txtNickname.setAlignmentX(0.8F);
        txtNickname.setBorder(null);
        txtNickname.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNickname.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtNickname.setMinimumSize(new java.awt.Dimension(5, 20));
        txtNickname.setName("txtNickname"); // NOI18N
        txtNickname.setNextFocusableComponent(txtEmail);
        txtNickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNicknameMousePressed(evt);
            }
        });
        txtNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicknameActionPerformed(evt);
            }
        });
        jPanel1.add(txtNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 183, 19));

        lblTitulo2.setBackground(new java.awt.Color(0, 0, 51));
        lblTitulo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo2.setToolTipText("");
        jPanel1.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 300, 30));

        jSeparator9.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 183, -1));

        txtEmail.setBackground(new java.awt.Color(0, 0, 51));
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setText("Ingrese email");
        txtEmail.setAlignmentX(0.8F);
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmail.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtEmail.setMinimumSize(new java.awt.Dimension(5, 20));
        txtEmail.setName("txtEmail"); // NOI18N
        txtEmail.setNextFocusableComponent(txtContraActual);
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmailMousePressed(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 183, 19));

        lblEmail.setBackground(new java.awt.Color(0, 0, 51));
        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(204, 204, 204));
        lblEmail.setText("Email:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 183, -1));

        lblContra.setBackground(new java.awt.Color(0, 0, 51));
        lblContra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblContra.setForeground(new java.awt.Color(204, 204, 204));
        lblContra.setText("Contraseña actual:");
        jPanel1.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtContraActual.setBackground(new java.awt.Color(0, 0, 51));
        txtContraActual.setForeground(new java.awt.Color(255, 255, 255));
        txtContraActual.setText("Ingrese contraseña actual");
        txtContraActual.setBorder(null);
        txtContraActual.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContraActual.setName("txtContraActual"); // NOI18N
        txtContraActual.setNextFocusableComponent(txtContraNueva);
        jPanel1.add(txtContraActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 20));

        btnActualizar.setBackground(new java.awt.Color(0, 0, 255));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.setNextFocusableComponent(btnCancelar);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarMousePressed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 80, 30));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 80, 30));

        lblNickname1.setBackground(new java.awt.Color(0, 0, 51));
        lblNickname1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNickname1.setForeground(new java.awt.Color(204, 204, 204));
        lblNickname1.setText("Nickname:");
        jPanel1.add(lblNickname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jSeparator12.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator12.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 183, -1));

        txtContraNueva.setBackground(new java.awt.Color(0, 0, 51));
        txtContraNueva.setForeground(new java.awt.Color(255, 255, 255));
        txtContraNueva.setBorder(null);
        txtContraNueva.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContraNueva.setName("txtContra"); // NOI18N
        txtContraNueva.setNextFocusableComponent(btnActualizar);
        jPanel1.add(txtContraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 180, 20));

        lblContra1.setBackground(new java.awt.Color(0, 0, 51));
        lblContra1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblContra1.setForeground(new java.awt.Color(204, 204, 204));
        lblContra1.setText("Contraseña nueva:");
        jPanel1.add(lblContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 51));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setToolTipText("");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(390, 390, 390))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        // TODO add your handling code here:
        Menu_Usuarios users = new Menu_Usuarios();
        users.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMousePressed
        //Comprobar que los datos no sean nulos ni vaciós
        if(txtNickname.getText().equals("Ingrese nickname") || txtEmail.getText().equals("Ingrese email") || txtContraActual.getPassword().length == 0 
                || txtContraNueva.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO",JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                String id = Integer.toString(Globales.IdUsuario);
                String nickname = txtNickname.getText();
                String email = txtEmail.getText();
                String pass = new String(txtContraActual.getPassword());
                String nuevoPass = new String(txtContraNueva.getPassword());

                //Cerrar ventana y regresar a listado
                Menu_Usuarios ver = null;
                ver = new Menu_Usuarios();
                this.dispose();
                
                //Llamar metodo para actualizar contraseña
                Usuario usuario = new Usuario();
                usuario.cambiarClave(id,nuevoPass,nickname,email,pass);
            }
            catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AgregarUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnActualizarMousePressed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailMousePressed

    private void txtNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicknameActionPerformed

    private void txtNicknameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNicknameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicknameMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMousePressed

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
            java.util.logging.Logger.getLogger(cambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambiarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cambiarClave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblContra1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNickname1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JPasswordField txtContraActual;
    private javax.swing.JPasswordField txtContraNueva;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
