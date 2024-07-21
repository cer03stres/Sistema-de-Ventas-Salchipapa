package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection conectar(){
        try {
            
            Connection cn = DriverManager.getConnection("jdbc:mysql//localhost//bd_salchipapa", "root", "admin");
        } catch (SQLException e) {
            System.out.println("Error de conexion local" + e);      
        }
        return null;
    }  
}

   