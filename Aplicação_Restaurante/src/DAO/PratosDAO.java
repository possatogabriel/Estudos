package DAO;

import java.sql.*;

import DTO.PratosDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Possato
 */
public class PratosDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarPrato(PratosDTO objPratosDTO) {
        String sql = "INSERT INTO Pratos (Nome, Descricao, Valor) VALUES (?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            
            pstm.setString(1, objPratosDTO.getNome_PratosDTO());
            pstm.setString(2, objPratosDTO.getDescrição_PratosDTO());
            pstm.setString(3, objPratosDTO.getValor_PratosDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'PratosDAO': " + erro);
        }
    }
}
