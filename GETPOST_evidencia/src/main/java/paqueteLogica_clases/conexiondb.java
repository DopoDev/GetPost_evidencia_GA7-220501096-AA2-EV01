package paqueteLogica_clases;

import java.sql.*;
import java.sql.DriverManager;

public class conexiondb {
    Connection conn = null; 
    
    
    public void conectardb(){
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String password = "1234";
        String user = "postgres";
        
        try{
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
            System.out.println("Se ha conectado a la db satisfactoriamente");
        }catch(SQLException e){
            System.out.println("No se ha podido conectar a la base de datos -> " + e);
        }
        
    }
    
    
}
