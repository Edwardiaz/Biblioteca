/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author user
 */
public class Menu_Materiales extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Materiales
     */
    public Menu_Materiales() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Materiales");
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
        lblAgregarMaterial = new javax.swing.JLabel();
        lblAddMaterial = new javax.swing.JLabel();
        lblVerMaterial = new javax.swing.JLabel();
        lblMostrarMat = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        lblReturn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        lblAgregarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add_Material.png"))); // NOI18N
        lblAgregarMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregarMaterial.setName("lblAgregarMaterial"); // NOI18N

        lblAddMaterial.setBackground(new java.awt.Color(0, 0, 51));
        lblAddMaterial.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAddMaterial.setForeground(new java.awt.Color(255, 255, 255));
        lblAddMaterial.setText("Agregar");
        lblAddMaterial.setName("lblAddMaterial"); // NOI18N

        lblVerMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ver user.png"))); // NOI18N
        lblVerMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerMaterial.setName("lblVerMaterial"); // NOI18N

        lblMostrarMat.setBackground(new java.awt.Color(0, 0, 51));
        lblMostrarMat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMostrarMat.setForeground(new java.awt.Color(255, 255, 255));
        lblMostrarMat.setText("Ver");
        lblMostrarMat.setName("lblNuevo"); // NOI18N

        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Regresar.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblAgregarMaterial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblAddMaterial)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVerMaterial)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMostrarMat)
                        .addGap(131, 131, 131))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegresar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblReturn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVerMaterial)
                        .addGap(18, 18, 18)
                        .addComponent(lblMostrarMat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAgregarMaterial)
                        .addGap(18, 18, 18)
                        .addComponent(lblAddMaterial)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(lblRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblReturn)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMousePressed
        // TODO add your handling code here:
        Dashboard db = new Dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegresarMousePressed

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
            java.util.logging.Logger.getLogger(Menu_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Materiales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddMaterial;
    private javax.swing.JLabel lblAgregarMaterial;
    private javax.swing.JLabel lblMostrarMat;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblReturn;
    private javax.swing.JLabel lblVerMaterial;
    // End of variables declaration//GEN-END:variables
}
