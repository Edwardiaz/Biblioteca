package form;

import datos.Conexion;
import datos.MaterialesCRUD;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Agregar_Libro extends javax.swing.JFrame {

    Conexion co = new Conexion();
    Connection con = co.getConnection();
    
    public Agregar_Libro() throws SQLException{
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Libro.");
        consultarAutores();
        consultarEditoriales();
        
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator4 = new javax.swing.JSeparator();
        pnlAgregarMenu = new javax.swing.JPanel();
        lblNewLibro = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtTituloLibro = new javax.swing.JTextField();
        lblTituloLibro = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblAutorLibro = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtPaginas = new javax.swing.JTextField();
        lblPaginas = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        lblEditorial = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        txtIsbn = new javax.swing.JTextField();
        lblIsbn = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        txtFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        txtDisponible = new javax.swing.JTextField();
        lblDisponible = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu5.setText("jMenu5");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlAgregarMenu.setBackground(new java.awt.Color(0, 0, 51));
        pnlAgregarMenu.setForeground(new java.awt.Color(102, 0, 204));
        pnlAgregarMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNewLibro.setForeground(new java.awt.Color(255, 255, 255));
        lblNewLibro.setText("Agregar Libro");
        pnlAgregarMenu.add(lblNewLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));
        pnlAgregarMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 92, -1, 170));
        pnlAgregarMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlAgregarMenu.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 10, 440));

        jSeparator7.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlAgregarMenu.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 260, 10));

        txtTituloLibro.setBackground(new java.awt.Color(0, 0, 51));
        txtTituloLibro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtTituloLibro.setForeground(new java.awt.Color(102, 102, 102));
        txtTituloLibro.setText("Ingrese título");
        txtTituloLibro.setAlignmentX(0.8F);
        txtTituloLibro.setBorder(null);
        txtTituloLibro.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtTituloLibro.setMinimumSize(new java.awt.Dimension(5, 20));
        txtTituloLibro.setName("txtTituloLibro"); // NOI18N
        txtTituloLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTituloLibroMousePressed(evt);
            }
        });
        pnlAgregarMenu.add(txtTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 260, 30));

        lblTituloLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloLibro.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloLibro.setText("Título");
        lblTituloLibro.setName("lblTituloLibro"); // NOI18N
        pnlAgregarMenu.add(lblTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlAgregarMenu.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 260, 10));

        lblAutorLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAutorLibro.setForeground(new java.awt.Color(255, 255, 255));
        lblAutorLibro.setText("Autor");
        lblAutorLibro.setName("lblAutorLibro"); // NOI18N
        pnlAgregarMenu.add(lblAutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlAgregarMenu.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 260, 10));

        txtPaginas.setBackground(new java.awt.Color(0, 0, 51));
        txtPaginas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPaginas.setForeground(new java.awt.Color(102, 102, 102));
        txtPaginas.setText("Ingrese número de páginas");
        txtPaginas.setAlignmentX(0.8F);
        txtPaginas.setBorder(null);
        txtPaginas.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtPaginas.setMinimumSize(new java.awt.Dimension(5, 20));
        txtPaginas.setName("txtPaginas"); // NOI18N
        txtPaginas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPaginasMousePressed(evt);
            }
        });
        pnlAgregarMenu.add(txtPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 260, 30));

        lblPaginas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPaginas.setForeground(new java.awt.Color(255, 255, 255));
        lblPaginas.setText("Páginas");
        lblPaginas.setName("lblPaginas"); // NOI18N
        pnlAgregarMenu.add(lblPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlAgregarMenu.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 260, 10));

        lblEditorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEditorial.setForeground(new java.awt.Color(255, 255, 255));
        lblEditorial.setText("Editorial");
        lblEditorial.setName("lblEditorial"); // NOI18N
        pnlAgregarMenu.add(lblEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jSeparator12.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator12.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlAgregarMenu.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 260, 10));

        txtIsbn.setBackground(new java.awt.Color(0, 0, 51));
        txtIsbn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtIsbn.setForeground(new java.awt.Color(102, 102, 102));
        txtIsbn.setText("Ingrese los 13 digitos del ISBN");
        txtIsbn.setAlignmentX(0.8F);
        txtIsbn.setBorder(null);
        txtIsbn.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtIsbn.setMinimumSize(new java.awt.Dimension(5, 20));
        txtIsbn.setName("txtIsbn"); // NOI18N
        txtIsbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIsbnMousePressed(evt);
            }
        });
        pnlAgregarMenu.add(txtIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 260, 30));

        lblIsbn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIsbn.setForeground(new java.awt.Color(255, 255, 255));
        lblIsbn.setText("ISBN");
        lblIsbn.setName("lblIsbn"); // NOI18N
        pnlAgregarMenu.add(lblIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jSeparator13.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator13.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlAgregarMenu.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 260, 10));

        txtFecha.setBackground(new java.awt.Color(0, 0, 51));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha.setText("dia/mes/año");
        txtFecha.setAlignmentX(0.8F);
        txtFecha.setBorder(null);
        txtFecha.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtFecha.setMinimumSize(new java.awt.Dimension(5, 20));
        txtFecha.setName("txtFecha"); // NOI18N
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaMousePressed(evt);
            }
        });
        pnlAgregarMenu.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 260, 30));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha de Publicación");
        lblFecha.setName("lblFecha"); // NOI18N
        pnlAgregarMenu.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, 20));

        jSeparator14.setForeground(new java.awt.Color(102, 0, 204));
        jSeparator14.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlAgregarMenu.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 260, 10));

        txtDisponible.setBackground(new java.awt.Color(0, 0, 51));
        txtDisponible.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDisponible.setForeground(new java.awt.Color(102, 102, 102));
        txtDisponible.setText("Ingrese cantidad");
        txtDisponible.setAlignmentX(0.8F);
        txtDisponible.setBorder(null);
        txtDisponible.setMargin(new java.awt.Insets(5, 15, 5, 5));
        txtDisponible.setMinimumSize(new java.awt.Dimension(5, 20));
        txtDisponible.setName("txtDisponible"); // NOI18N
        txtDisponible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDisponibleMousePressed(evt);
            }
        });
        pnlAgregarMenu.add(txtDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 260, 30));

        lblDisponible.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDisponible.setForeground(new java.awt.Color(255, 255, 255));
        lblDisponible.setText("Unidades disponibles");
        lblDisponible.setName("lblDisponible"); // NOI18N
        pnlAgregarMenu.add(lblDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(51, 0, 153));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setName("btnAgregar"); // NOI18N
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        pnlAgregarMenu.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 393, 110, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 0, 153));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-salir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        pnlAgregarMenu.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 393, 110, 40));

        jComboBox2.setForeground(new java.awt.Color(0, 0, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- -  - -" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlAgregarMenu.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 260, -1));

        jComboBox3.setForeground(new java.awt.Color(0, 0, 51));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- -  - -" }));
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlAgregarMenu.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloLibroMousePressed
        
       if(txtTituloLibro.getText().equals("Ingrese título"))
        txtTituloLibro.setText("");

       if(txtPaginas.getText().equals("") || txtPaginas.getText() == null)
        txtPaginas.setText("Ingrese número de páginas");
       
       if(txtIsbn.getText().equals("") || txtIsbn.getText() == null)
        txtIsbn.setText("Ingrese los 13 digitos del ISBN");
       
       if(txtFecha.getText().equals("") || txtFecha.getText() == null)
        txtFecha.setText("dia/mes/año");
       
       if(txtDisponible.getText().equals("") || txtDisponible.getText() == null)
        txtDisponible.setText("Ingrese cantidad"); 
       
    }//GEN-LAST:event_txtTituloLibroMousePressed

    private void txtPaginasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaginasMousePressed
        
       if(txtPaginas.getText().equals("Ingrese número de páginas"))
        txtPaginas.setText("");
        
       if(txtTituloLibro.getText().equals("") || txtTituloLibro.getText() == null)
        txtTituloLibro.setText("Ingrese título");
       
       if(txtIsbn.getText().equals("") || txtIsbn.getText() == null)
        txtIsbn.setText("Ingrese los 13 digitos del ISBN");
       
       if(txtFecha.getText().equals("") || txtFecha.getText() == null)
        txtFecha.setText("dia/mes/año");
       
       if(txtDisponible.getText().equals("") || txtDisponible.getText() == null)
        txtDisponible.setText("Ingrese cantidad");

    }//GEN-LAST:event_txtPaginasMousePressed

    private void txtIsbnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIsbnMousePressed
        
       if(txtIsbn.getText().equals("Ingrese los 13 digitos del ISBN"))
        txtIsbn.setText(""); 
        
       if(txtTituloLibro.getText().equals("") || txtTituloLibro.getText() == null)
        txtTituloLibro.setText("Ingrese título");
       
       if(txtPaginas.getText().equals("") || txtPaginas.getText() == null)
        txtPaginas.setText("Ingrese número de páginas");
       
       if(txtFecha.getText().equals("") || txtFecha.getText() == null)
        txtFecha.setText("dia/mes/año");
       
       if(txtDisponible.getText().equals("") || txtDisponible.getText() == null)
        txtDisponible.setText("Ingrese cantidad");

    }//GEN-LAST:event_txtIsbnMousePressed

    private void txtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMousePressed
       
       if(txtFecha.getText().equals("dia/mes/año"))
        txtFecha.setText("");
        
       if(txtTituloLibro.getText().equals("") || txtTituloLibro.getText() == null)
        txtTituloLibro.setText("Ingrese título");
       
       if(txtPaginas.getText().equals("") || txtPaginas.getText() == null)
        txtPaginas.setText("Ingrese número de páginas");
       
       if(txtIsbn.getText().equals("") || txtIsbn.getText() == null)
        txtIsbn.setText("Ingrese los 13 digitos del ISBN");
       
       if(txtDisponible.getText().equals("") || txtDisponible.getText() == null)
        txtDisponible.setText("Ingrese cantidad");

    }//GEN-LAST:event_txtFechaMousePressed

    private void txtDisponibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDisponibleMousePressed
         
       if(txtDisponible.getText().equals("Ingrese cantidad"))
        txtDisponible.setText("");
        
       if(txtTituloLibro.getText().equals("") || txtTituloLibro.getText() == null)
        txtTituloLibro.setText("Ingrese título");
       
       if(txtPaginas.getText().equals("") || txtPaginas.getText() == null)
        txtPaginas.setText("Ingrese número de páginas");
       
       if(txtIsbn.getText().equals("") || txtIsbn.getText() == null)
        txtIsbn.setText("Ingrese los 13 digitos del ISBN");
              
       if(txtFecha.getText().equals("") || txtFecha.getText() == null)
        txtFecha.setText("dia/mes/año");

    }//GEN-LAST:event_txtDisponibleMousePressed

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        
        //Comprobar que los datos no sean nulos ni vaciós
        if(txtTituloLibro.getText().equals("Ingrese Título")
            || txtFecha.getText().equals("dia/mes/año")
            || txtPaginas.getText().equals("Ingrese número de páginas")
            || txtIsbn.getText().equals("Ingrese ISBN (13 carácteres)")
            || txtDisponible.getText().equals("Ingrese cantidad")){
            JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n", "AVISO",JOptionPane.INFORMATION_MESSAGE);
            
        } else { 
            try {
                //Creación de variables que almacenan los datos introducidos
                //String id = txtIdlibro.getText();
                MaterialesCRUD crud = new MaterialesCRUD();
                //String id = crud.crearID("LIB");
                String titulo = txtTituloLibro.getText();
                String autor = (String)jComboBox2.getSelectedItem();
                String fecha = txtFecha.getText();
                String num_pag = txtPaginas.getText();
                String editorial = (String)jComboBox3.getSelectedItem();
                String isbn = txtIsbn.getText();
                String disponible = txtDisponible.getText();
                int pag=0;
                int u_disponible=0;
                
                //Variable que almacenará el incremento del id autor
                //int idAutor = 1;
                /*try {
                    idAutor = crud.incremento_id();
                } catch (SQLException ex) {
                    Logger.getLogger(Agregar_Libro.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                
                //Variable que almacenará el incremento del id editorial
                int idEditorial = 1;
                idEditorial = incrementarIdEditorial();
                
                //Condicional que evalua si se ha ingresado 8 caracteres dentro del apartado ID
                //if(id.length()== 8){
                    //Condicional que lanza mensaje de error si hay algún dato con tipo erróneo
                    if(titulo == null || "".equals(titulo) || autor == null || "".equals(autor)
                            || fecha == null || "".equals(fecha) || num_pag == null || "".equals(num_pag)
                            || editorial == null || "".equals(editorial) || isbn == null || "".equals(isbn)|| isbn.length()>13
                            || disponible == null
                            || "".equals(disponible)){
                        JOptionPane.showMessageDialog(this, "Rellenar los campos solicitados de forma correcta \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                        
                    } else {
                        
                        //Convertir datos de tipo String a enteros
                        pag = Integer.parseInt(num_pag);
                        u_disponible = Integer.parseInt(disponible);
                        
                        //Convetir dato ingresado a formato Fecha
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        java.sql.Date conversion = null;
                        
                        try {
                            Date fecha_publicacion = formato.parse(fecha);
                            conversion = new java.sql.Date(fecha_publicacion.getTime());
                        }catch(Exception e){
                            Logger.getLogger(Agregar_Libro.class.getName()).log(Level.SEVERE, "Hubo un error en la conversion de la FECHA DE PUBLICACION", e);
                        }
                        
                        //Llamar a los siguientes métodos, pasándole parámetros
//                        
//                        insertarAutor(idAutor, autor);
//
//                        insertarEditorial(idEditorial, editorial);
                        
                        //insertarTipo(tipo);
                        
                        //Bloque de código para insertar información en tabla materiales                       
                        if(crud.insertarLibros(titulo, pag, idEditorial, isbn, conversion, u_disponible, autor, editorial)>=1){
                            //Llamada al método limpiar campos
                            limpiarCampos();

                            //Cerrar ventana
                            //try {
                            JOptionPane.showMessageDialog(this, "Datos ingresados correctamente. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                            Dashboard dash = new Dashboard();
                            dash.setVisible(true);
                            this.dispose();
                            /*} catch (SQLException ex) {
                                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                            }*/
                        }
                    }
                /*} else if(id.length()<8) {
                    JOptionPane.showMessageDialog(this, "Error en Campo ID. Pocos caracteres. Debe tener 8 caracteres \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                } else if(id.length()>8){
                    JOptionPane.showMessageDialog(this, "Error en Campo ID. Excede de 8 caracteres \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }*/
                
            } catch (SQLException ex) {
                Logger.getLogger(Agregar_Libro.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed

        JOptionPane.showMessageDialog(this, "Acción cancelada. Volviendo al menú. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        
        try {
            Menu_Tipo_Material tipo = new Menu_Tipo_Material();
            tipo.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Libro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarMousePressed

    public void consultarAutores(){
        String sql = "SELECT nombre_autor FROM AUTORES;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                String nombreAutor = rs.getString("nombre_autor");
                jComboBox2.addItem(nombreAutor);
            }
            
        } catch (Exception e) {
            Logger.getLogger(Agregar_Libro.class.getName()).log(Level.SEVERE, null, e);
        } finally{
            Conexion.close(stmt);
            Conexion.close(con);
        }
    }
    
    public int consultarEditoriales(){
        String sql = "SELECT id, nombre_editorial FROM EDITORIALES;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int id = 0;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                String nombreEditorial = rs.getString("nombre_editorial");
                jComboBox3.addItem(nombreEditorial);
            }   
        } catch (Exception e) {
            Logger.getLogger(Agregar_Libro.class.getName()).log(Level.SEVERE, null, e);
        } finally{
            Conexion.close(stmt);
            Conexion.close(con);
        }
        return id;
    }
    
    /*public String crearID(String tipoMaterial){
        //Estructura del ID: DVD00001
        String sql = "SELECT id FROM materiales";
        int[] arrayID = new int[8];
        int i = 0;
        String id = "";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            //vamos convirtiendo cada ID en int quitando las tres primera letras
            //y depositando el numero en un array
            while (rs.next()) {                
                String nombreAutor = rs.getString("id");                
                String tipoID = nombreAutor.length() < 2 ? nombreAutor : nombreAutor.substring(0, 3);
                if(tipoID.equalsIgnoreCase(tipoMaterial)){
                    int numberId = Integer.parseInt(nombreAutor.substring(3));
                    arrayID[i] = numberId;
                    i++;
                }
            }
            //voy identificando el numero mayor
            int numMayor = arrayID[0];
            for (int j = 1; i < arrayID.length; i++){
                if (arrayID[j] > numMayor) {
                    numMayor = arrayID[j];
                }
            }
            //vamos a ver cuantos digitos tiene el numero resultante
            int conteo = (int)Math.floor(Math.log10(numMayor) + 1);
                                    
            //agregamos los ceros según la cantidad de digitos del numero mayor
            int resultado = 0;
            if(conteo == 1){
                resultado = numMayor+1;
                id = String.valueOf("LIB0000"+resultado);
            } else if(conteo == 2) {
                resultado = numMayor+1;
                id = String.valueOf("LIB000"+resultado);
            } else if(conteo == 3) {
                resultado = numMayor+1;
                id = String.valueOf("LIB00"+resultado);
            } else if(conteo == 4) {
                resultado = numMayor+1;
                id = String.valueOf("LIB0"+resultado);
            } else {
                resultado = numMayor+1;
                id = String.valueOf("LIB"+resultado);
            }
        } catch (Exception e) {
            Logger.getLogger(Agregar_Libro.class.getName()).log(Level.SEVERE, null, e);
        } finally{
            Conexion.close(stmt);
            Conexion.close(con);
        }
        return id;
    }*/
    
        
    /*public int incremento_id () throws SQLException {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = Conexion.getConnection();
        try{
            ps = con.prepareStatement("SELECT MAX(id) FROM autores");
            rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt(1) + 1;
            }
        }catch(SQLException e){
            Logger.getLogger(Agregar_Libro.class.getName()).log(Level.SEVERE, null, e);
        } finally{
            Conexion.close(con);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return id;
    }*/
    
    public int incrementarIdEditorial() throws SQLException{
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = Conexion.getConnection();
        try{
            ps = con.prepareStatement("SELECT MAX(id) FROM editoriales");
            rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt(1) + 1;
            }
        }catch(SQLException e){
            Logger.getLogger(Agregar_Libro.class.getName()).log(Level.SEVERE, null, e);
        } finally{
            Conexion.close(con);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return id;
    }
    
    public void limpiarCampos(){
                
                txtTituloLibro.setText("");
                jComboBox2.setSelectedIndex(0);
                txtFecha.setText("");
                txtPaginas.setText("");
                jComboBox3.setSelectedIndex(0);
                txtIsbn.setText("");
                txtDisponible.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAutorLibro;
    private javax.swing.JLabel lblDisponible;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblNewLibro;
    private javax.swing.JLabel lblPaginas;
    private javax.swing.JLabel lblTituloLibro;
    private javax.swing.JPanel pnlAgregarMenu;
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
