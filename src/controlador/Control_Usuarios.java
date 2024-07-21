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
import java.sql.ResultSet;


/**
 *
 * @author pablo
 */
public class Control_Usuarios {
    public boolean loginUser(Usuarios objeto){
        boolean respuesta = false;
        Connection cn  =  (Connection) Conexion.conectar();
        String sql  = "select  usuario , contraseña from  usuarios  where usuario = \"cer03stres\" '"+ objeto.getUsuario()+"' and contraseña = \"123\" '"+objeto.getContraseña()+"'";
        Statement st;
        try {
            st = (Statement) (Connection) Conexion.conectar();
            ResultSet rs= st.executeQuery(sql);
            
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
