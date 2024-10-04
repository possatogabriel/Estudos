/**
 *
 * @author Gabriel Possato
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectorDAO {
    
    public Connection connectorDB() {
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/Restaurante";
            String user = "root";
            String password = "";
            
            conn = DriverManager.getConnection(url, user, password); 
        } 
        
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro encontrado no arquivo 'ConnectorDAO': " + erro.getMessage());
        }
        return conn;
    }
}
