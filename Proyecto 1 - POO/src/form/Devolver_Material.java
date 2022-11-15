/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import datos.Conexion;
import datos.Prestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Devolver_Material extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    Connection con = conn.getConnection();
    Prestamo prestamos = new Prestamo();
    
    public Devolver_Material() throws SQLException {
        initComponents();
        this.setTitle("Retornar material");
        this.setLocationRelativeTo(null);
        verPrestamos();
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
        tblPrestamos = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlVerUser.setBackground(new java.awt.Color(0, 0, 51));
        pnlVerUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPrestamos.setSelectionBackground(new java.awt.Color(0, 0, 51));
        tblPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPrestamos);

        pnlVerUser.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 630, 290));

        btnReturn.setBackground(new java.awt.Color(0, 0, 204));
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Devolver");
        btnReturn.setBorder(null);
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReturnMousePressed(evt);
            }
        });
        pnlVerUser.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 80, 40));

        btnAtras.setBackground(new java.awt.Color(153, 0, 0));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atrás");
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAtrasMousePressed(evt);
            }
        });
        pnlVerUser.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 80, 40));

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
        pnlVerUser.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 140, 20));

        jSeparator6.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlVerUser.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 140, -1));

        lblUser.setBackground(new java.awt.Color(0, 0, 51));
        lblUser.setForeground(new java.awt.Color(204, 204, 204));
        lblUser.setText("Usuario:");
        pnlVerUser.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

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

    private void btnReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMousePressed
        // TODO add your handling code here:
        try {
            //Variable para almacenar el valor de la fla seleccionada
            int fila = tblPrestamos.getSelectedRow();

            String idMater = tblPrestamos.getValueAt(fila, 1).toString();
            String nickname = txtUsuario.getText();

            
            //Condicionales
            if (!prestamos.existeMaterial(idMater)) {
                JOptionPane.showMessageDialog(this, "No existe ningún material con ese ID. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            } else if (nickname.equals("") || nickname == null) {
                JOptionPane.showMessageDialog(this, "Nickname de usuario vacío. \n", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            try {
                //Bloque de código para verificar si el usuario existe en el sistema
                boolean aceptado = prestamos.existeUsuario(nickname);
                if (!aceptado) {
                    JOptionPane.showMessageDialog(this, "No existe ningún usuario registrado. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                    txtUsuario.setText("");
                    txtUsuario.requestFocus();
                } else if (!prestamos.verificarPrestamo(nickname, idMater)) {
                    JOptionPane.showMessageDialog(this, "No se ha podido encontrar registro del prestamo con los datos ingresados. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                    txtUsuario.setText("");
                } else {
                    prestamos.regresarMaterial(nickname, idMater);
                    txtUsuario.setText("");
                    verPrestamos();
                }
            } catch (Exception e) {
                System.out.println("Error" + e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila de la tabla. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnReturnMousePressed

    private void btnAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMousePressed
        // TODO add your handling code here:
        Menu_Prestamos pres = new Menu_Prestamos();
        pres.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasMousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void tblPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrestamosMouseClicked
        // TODO add your handling code here:
        
        int seleccion = tblPrestamos.rowAtPoint(evt.getPoint());
        txtUsuario.setText(String.valueOf(tblPrestamos.getValueAt(seleccion, 2)));
    }//GEN-LAST:event_tblPrestamosMouseClicked

    public void verPrestamos() throws SQLException {
        //Variables a utilizar
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            //Sentencia que permite seleccionar los datos de la tabla prestamos
            String sql = "SELECT prestamos.id, prestamos.codigo_material AS Material, usuarios.nickname AS Usuario, prestamos.fecha_prestamo, prestamos.fecha_devolucion FROM prestamos LEFT JOiN materiales ON materiales.id = prestamos.codigo_material LEFT JOIN usuarios on usuarios.id = prestamos.codigo_usuario";

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(); //Ejecución

            //Contador que ayuda a recorrer uno a uno las filas de la lista
            int count = 0;
            while (rs.next()) {
                count++;
            }

            String lista[][] = new String[count][9];
            int i = 0;
            ResultSet re = stmt.executeQuery("SELECT prestamos.id, prestamos.codigo_material AS Material, usuarios.nickname AS Usuario, prestamos.fecha_prestamo, prestamos.fecha_devolucion FROM prestamos LEFT JOiN materiales ON materiales.id = prestamos.codigo_material LEFT JOIN usuarios on usuarios.id = prestamos.codigo_usuario");
            while (re.next()) {
                lista[i][0] = re.getString("id");
                lista[i][1] = re.getString("Material");
                lista[i][2] = re.getString("Usuario");
                lista[i][3] = re.getString("fecha_prestamo");
                lista[i][4] = re.getString("fecha_devolucion");
                i++;
            }

            //Ingresar los dtaos en la tabla
            tblPrestamos.setModel(new DefaultTableModel(
                    lista,
                    new String[]{
                        "ID", "Material", "Usuario", "Fecha de Prestamo", "Fecha de Devolución"
                    }));
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            
        }
    }

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
            java.util.logging.Logger.getLogger(Devolver_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devolver_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devolver_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devolver_Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Devolver_Material().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Devolver_Material.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnReturn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlVerUser;
    private javax.swing.JTable tblPrestamos;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
