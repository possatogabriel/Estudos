package DAO;

/**
 *
 * @author Gabriel Possato
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectorDAO {
    
    public Connection conectorDB() {  
        Connection conn = null; 
        
        try {
            String url = "jdbc:mysql//localhost:3306/db"; //SEM STRING DE USER E PASSWORD: ?user=root&password=
            String user = "root";
            String password = "1234";
            
            conn = DriverManager.getConnection(url);
        }
        
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "ERRO NO CONNECTORDAO.JAVA: " + erro.getMessage());
        }
        
        return conn;
    }
    
}
