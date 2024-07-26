package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection conectar(){
        try {
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_salchipapa?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root","admin");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error de conexion local" + e);      
        }
        return null;
    }  
}

   