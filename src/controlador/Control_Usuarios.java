/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import modelo.Usuarios;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author pablo
 */
public class Control_Usuarios {
    public boolean loginUser(Usuarios objeto){
        boolean respuesta = false;
        java.sql.Connection cn  =  Conexion.conectar();
        //String sql  = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
        String sql  = "SELECT usuario,contraseña  from usuarios WHERE usuario ='"+objeto.getUsuario()+"' AND contraseña = '"+objeto.getContraseña()+"'";
        Statement st;
        try {
            st =  (Statement) cn.createStatement();
            java.sql.ResultSet rs= st.executeQuery(sql);
            
            while (rs.next()){
                respuesta =  true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null,"Error al iniciar sesíón");
        }
        return respuesta;
    }
    
}
