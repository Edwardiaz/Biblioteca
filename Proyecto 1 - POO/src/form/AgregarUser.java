/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import datos.Globales;
import datos.Usuario;
import datos.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AgregarUser extends javax.swing.JFrame {

    /**
     * Creates new form AgregarUser
     */
    public AgregarUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Nuevo Usuario");
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
        jSeparator6 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtApellido = new javax.swing.JTextField();
        lblRol = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txtNickname = new javax.swing.JTextField();
        lblNickname = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        lblNombre2 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        lblContra = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        cmbRol = new javax.swing.JComboBox<>();
        lblApellido1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator6.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 183, -1));

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

        lblNombre.setBackground(new java.awt.Color(0, 0, 51));
        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 204, 204));
        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        txtNombre.setBackground(new java.awt.Color(0, 0, 51));
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese nombre");
        txtNombre.setAlignmentX(0.8F);
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtNombre.setMinimumSize(new java.awt.Dimension(5, 20));
        txtNombre.setName("txtUsuario"); // NOI18N
        txtNombre.setNextFocusableComponent(txtApellido);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 180, 19));

        jSeparator7.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 183, -1));

        txtApellido.setBackground(new java.awt.Color(0, 0, 51));
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setText("Ingrese apellido");
        txtApellido.setAlignmentX(0.8F);
        txtApellido.setBorder(null);
        txtApellido.setCaretColor(new java.awt.Color(255, 255, 255));
        txtApellido.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtApellido.setMinimumSize(new java.awt.Dimension(5, 20));
        txtApellido.setName("txtUsuario"); // NOI18N
        txtApellido.setNextFocusableComponent(txtNickname);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 183, 19));

        lblRol.setBackground(new java.awt.Color(0, 0, 51));
        lblRol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRol.setForeground(new java.awt.Color(204, 204, 204));
        lblRol.setText("Rol de usuario:");
        jPanel1.add(lblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 183, -1));

        txtNickname.setBackground(new java.awt.Color(0, 0, 51));
        txtNickname.setForeground(new java.awt.Color(204, 204, 204));
        txtNickname.setText("Ingrese nickname");
        txtNickname.setAlignmentX(0.8F);
        txtNickname.setBorder(null);
        txtNickname.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNickname.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtNickname.setMinimumSize(new java.awt.Dimension(5, 20));
        txtNickname.setName("txtUsuario"); // NOI18N
        txtNickname.setNextFocusableComponent(txtFechaNacimiento);
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
        jPanel1.add(txtNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 183, 19));

        lblNickname.setBackground(new java.awt.Color(0, 0, 51));
        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNickname.setForeground(new java.awt.Color(204, 204, 204));
        lblNickname.setText("Nickname:");
        jPanel1.add(lblNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 183, -1));

        txtEmail.setBackground(new java.awt.Color(0, 0, 51));
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setText("Ingrese email");
        txtEmail.setAlignmentX(0.8F);
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmail.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtEmail.setMinimumSize(new java.awt.Dimension(5, 20));
        txtEmail.setName("txtUsuario"); // NOI18N
        txtEmail.setNextFocusableComponent(txtContra);
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
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 183, 19));

        lblEmail.setBackground(new java.awt.Color(0, 0, 51));
        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(204, 204, 204));
        lblEmail.setText("Email:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 183, -1));

        lblNombre2.setBackground(new java.awt.Color(0, 0, 51));
        lblNombre2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(204, 204, 204));
        lblNombre2.setText("Nombre:");
        jPanel1.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 183, -1));

        lblContra.setBackground(new java.awt.Color(0, 0, 51));
        lblContra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblContra.setForeground(new java.awt.Color(204, 204, 204));
        lblContra.setText("Contraseña");
        jPanel1.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jSeparator12.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator12.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 183, -1));

        txtFechaNacimiento.setBackground(new java.awt.Color(0, 0, 51));
        txtFechaNacimiento.setForeground(new java.awt.Color(204, 204, 204));
        txtFechaNacimiento.setText("Ingrese fecha");
        txtFechaNacimiento.setAlignmentX(0.8F);
        txtFechaNacimiento.setBorder(null);
        txtFechaNacimiento.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtFechaNacimiento.setMinimumSize(new java.awt.Dimension(5, 20));
        txtFechaNacimiento.setName("txtUsuario"); // NOI18N
        txtFechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaNacimientoMousePressed(evt);
            }
        });
        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 183, 19));

        lblFecha.setBackground(new java.awt.Color(0, 0, 51));
        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(204, 204, 204));
        lblFecha.setText("Fecha de nacimiento(dd/mm/yyyy):");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 220, -1));

        txtContra.setBackground(new java.awt.Color(0, 0, 51));
        txtContra.setForeground(new java.awt.Color(255, 255, 255));
        txtContra.setBorder(null);
        txtContra.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContra.setNextFocusableComponent(cmbRol);
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 20));

        cmbRol.setForeground(new java.awt.Color(0, 0, 51));
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -", "Administrador", "Profesor", "Estudiante" }));
        cmbRol.setNextFocusableComponent(btnAgregar);
        cmbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolActionPerformed(evt);
            }
        });
        jPanel1.add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        lblApellido1.setBackground(new java.awt.Color(0, 0, 51));
        lblApellido1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellido1.setForeground(new java.awt.Color(204, 204, 204));
        lblApellido1.setText("Apellido:");
        jPanel1.add(lblApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setNextFocusableComponent(btnCancelar);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 80, 30));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNicknameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNicknameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicknameMousePressed

    private void txtNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicknameActionPerformed

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailMousePressed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtFechaNacimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaNacimientoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoMousePressed

    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        // TODO add your handling code here:
        Menu_Usuarios users = new Menu_Usuarios();
        users.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void cmbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolActionPerformed

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        //Comprobar que los datos no sean nulos ni vaciós
        if(txtNombre.getText().equals("Ingrese nombre") || txtApellido.getText().equals("Ingrese apellido")
            || txtNickname.getText().equals("Ingrese nickname") || txtFechaNacimiento.getText().equals("Ingrese fecha")
            || txtEmail.getText().equals("Ingrese email")|| cmbRol.getSelectedItem().equals("-")
            || txtContra.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO",JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        } else {
            try {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String nickname = txtNickname.getText();
                String email = txtEmail.getText();
                String pass = new String(txtContra.getPassword());
                Float mora = 0.0f;
                String fecha_nacimiento = txtFechaNacimiento.getText();
                int codigo_rol = 0;
                //Evaluar rol id
                if (cmbRol.getSelectedItem().equals("Administrador")) {
                    codigo_rol = 1;
                }else if(cmbRol.getSelectedItem().equals("Profesor")){
                    codigo_rol = 2;
                }else if(cmbRol.getSelectedItem().equals("Alumno")){
                    codigo_rol = 3;
                }

                //Llamar metodo para agregar usuario a tabla
                Usuario usuario = new Usuario();
                usuario.agregarUsuario(nombre, apellido, nickname, email, pass, mora, fecha_nacimiento, codigo_rol);
            }
            catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AgregarUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAgregarMousePressed

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
            java.util.logging.Logger.getLogger(AgregarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblRol;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

//    public void agregarUsuario (String nombre, String apellido, String nickname, String email, String pass, Float mora, String fecha_nacimiento, int codigo_rol) throws SQLException{
//        //Crear objeto de tipo conexion
//        Conexion co = new Conexion();
//        Connection con = co.getConnection();
//        
//        //Codigo SQL para insertar registro a tabla
//        String sql = "INSERT INTO `Usuarios`(nombre, apellido, nickname, email, pass, mora, fecha_nacimiento, codigo_rol) VALUES(?,?,?,?,?,?,STR_TO_DATE(?, '%d/%m/%Y %H:%i:%s'),?)";
//        //Preparar statement
//        PreparedStatement stmt = null;
//        int rows = 0;
//
//        try{
//            con = Conexion.getConnection();
//            stmt = con.prepareStatement(sql);
//            int index = 1;
//            stmt.setString(index++, nombre);
//            stmt.setString(index++, apellido);
//            stmt.setString(index++, nickname);
//            stmt.setString(index++, email);
//            stmt.setString(index++, pass);
//            stmt.setFloat(index++, mora);
//            stmt.setString(index++, fecha_nacimiento);
//            stmt.setInt(index, codigo_rol);
//
//            rows = stmt.executeUpdate();
//            System.out.println("Registros afectados " + rows);
//        }catch(SQLException e){
//            System.out.println("Error" + e);
//        } finally{
//            Conexion.close(stmt);
//            Conexion.close(con);
//        }
//    } 
}
