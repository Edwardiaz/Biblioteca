package clases;

import datos.Globales;
import datos.Conexion;
import form.Dashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eduardo Trujillo
 */
public class Usuario {

    //Atributos
    public int id;
    public String nombre;
    public String apellido;
    public String nickname;
    public String email;
    public String pass;
    public Float mora;
    public String fecha_nacimiento;
    public int codigo_rol;
    public String rol;

    //Constructor
    public Usuario() {
    }

    //Metodo agregar usuario
    public void agregarUsuario(String nombre, String apellido, String nickname, String email, String pass, Float mora, String fecha_nacimiento, int codigo_rol) throws SQLException {
        //Crear objeto de tipo conexion
        Conexion co = new Conexion();
        Connection con = co.getConnection();

        //Codigo SQL para insertar registro a tabla
        String sql = "INSERT INTO `usuarios`(nombre, apellido, nickname, email, pass, mora, fecha_nacimiento, codigo_rol) VALUES(?,?,?,?,?,?,STR_TO_DATE(?, '%d/%m/%Y %H:%i:%s'),?)";
        //Preparar statement
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            stmt.setString(index++, nickname);
            stmt.setString(index++, email);
            stmt.setString(index++, pass);
            stmt.setFloat(index++, mora);
            stmt.setString(index++, fecha_nacimiento);
            stmt.setInt(index, codigo_rol);

            rows = stmt.executeUpdate();
            System.out.println("Registros afectados " + rows);
        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            Conexion.close(stmt);
            Conexion.close(con);
        }
    }

    //Metodo select all users
    public ArrayList<ArrayList<String>> mostrarUsuarios() throws SQLException {
        //Crear Lista
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        //Crear objeto de tipo conexion
        Conexion co = new Conexion();
        Connection con = co.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        //Codigo SQL para insertar registro a tabla
        String sql = "SELECT usuarios.id AS idUser,nombre, apellido, nickname, email, pass, mora, date_format(fecha_nacimiento, \"%d/%m/%Y\") AS fecha_nacimiento, rol "
                + "FROM biblioteca.usuarios JOIN rol ON usuarios.codigo_rol = rol.id";
        //Preparar statement
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            ArrayList<String> row = new ArrayList<String>();
            row.add(rs.getString("idUser"));
            row.add(rs.getString("nombre"));
            row.add(rs.getString("apellido"));
            row.add(rs.getString("nickname"));
            row.add(rs.getString("email"));
            row.add(rs.getString("rol"));
            row.add(rs.getString("fecha_nacimiento"));
            row.add(rs.getString("mora"));
            result.add(row);
        }

        return result;
    }

    //Definir variables globales al ingresar a sistema
    public void login(String nickname) throws SQLException {
        //Crear objeto de tipo conexion
        Conexion co = new Conexion();
        Connection con = co.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //Codigo SQL para insertar registro a tabla
            //String sql = "SELECT * FROM `Usuarios` WHERE nickname ='"+nickname+"'";
            String sql = "SELECT nombre, apellido, nickname, codigo_rol FROM usuarios WHERE nickname='"+nickname+"'";
            //Preparar statement
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                //Globales.IdUsuario = rs.getInt("id");
                String u = Globales.nombreUsuario = rs.getString("nombre") + " " + rs.getString("apellido");
                Globales.nickname = rs.getString("nickname");
                int rolU = Globales.rolUsuario = rs.getInt("codigo_rol");

                switch (rolU) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Bienvenido Administrador: " + u);
                        Dashboard db = new Dashboard();
                        db.setVisible(true);
                        
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Bienvenido Profesor: " + u);

                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Bienvenido Alumno: " + u);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado. ");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            Conexion.close(con);
            Conexion.close(ps);
            Conexion.close(rs);
        }
    }

    public List<Usuario> verUsuario(String idUsuario) throws SQLException {
        //Crear objeto de tipo conexion
        Conexion co = new Conexion();
        Connection con = co.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Usuario> usr = new ArrayList<Usuario>();

        try {
            String sql = "SELECT usuarios.id AS id,nombre, apellido, nickname, email, pass, mora, date_format(fecha_nacimiento, \"%d/%m/%Y\") AS fecha_nacimiento, codigo_rol, rol "
                    + "FROM usuarios JOIN rol ON usuarios.codigo_rol = rol.id WHERE usuarios.id ='" + idUsuario + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                Usuario usrData = new Usuario();
                usrData.id = rs.getInt("id");
                usrData.nombre = rs.getString("nombre");
                usrData.apellido = rs.getString("apellido");
                usrData.nickname = rs.getString("nickname");
                usrData.email = rs.getString("email");
                usrData.pass = rs.getString("pass");
                usrData.mora = rs.getFloat("mora");
                usrData.fecha_nacimiento = rs.getString("fecha_nacimiento");
                usrData.codigo_rol = rs.getInt("codigo_rol");
                usrData.rol = rs.getString("rol");
                usr.add(usrData);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            Conexion.close(con);
            Conexion.close(ps);
            Conexion.close(rs);
        }

        for (int i = 0; i < usr.size(); i++) {
            String id = Integer.toString(usr.get(i).id);
            String nombre = usr.get(i).nombre;
            String apellido = usr.get(i).apellido;
            String nickname = usr.get(i).nickname;
            String email = usr.get(i).email;
            String rol = usr.get(i).rol;
            String fecha_nacimiento = usr.get(i).fecha_nacimiento;
            String mora = "$ " + usr.get(i).mora;
        }
        return usr;
    }

    public void actualizarUsuario(String id, String nombre, String apellido, String nickname, String email, String pass, Float mora, String fecha_nacimiento, int codigo_rol) throws SQLException {
        //Crear objeto de tipo conexion
        Conexion co = new Conexion();
        Connection con = co.getConnection();
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            String sql = "UPDATE usuarios SET nombre = ?, apellido = ?, nickname = ?, email = ?,pass = ?, mora = ?, fecha_nacimiento = STR_TO_DATE(?, '%d/%m/%Y %H:%i:%s'), codigo_rol = ? WHERE usuarios.id ='" + id + "'";
            stmt = con.prepareStatement(sql);

            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            stmt.setString(index++, nickname);
            stmt.setString(index++, email);
            stmt.setString(index++, pass);
            stmt.setFloat(index++, mora);
            stmt.setString(index++, fecha_nacimiento);
            stmt.setInt(index, codigo_rol);

            rows = stmt.executeUpdate();
            System.out.println("Registros afectados " + rows);
        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            Conexion.close(stmt);
            Conexion.close(con);
        }
    }

    public void eliminarUsuario(String id) throws SQLException {
        //Crear objeto de tipo conexion
        Conexion co = new Conexion();
        Connection con = co.getConnection();
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            String sql = "DELETE FROM usuarios WHERE usuarios.id ='" + id + "'";
            stmt = con.prepareStatement(sql);

            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql);

            rows = stmt.executeUpdate();
            System.out.println("Registros afectados " + rows);
        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            Conexion.close(stmt);
            Conexion.close(con);
        }
    }
}
