package DAO;

import java.sql.*;

import DTO.BebidasDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Possato
 */
public class BebidasDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarBebida(BebidasDTO objBebidasDTO) {
        String sql = "INSERT INTO Bebidas (Nome, Descricao, Valor) VALUES (?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            
            pstm.setString(1, objBebidasDTO.getNome_BebidasDTO());
            pstm.setString(2, objBebidasDTO.getDescrição_BebidasDTO());
            pstm.setString(3, objBebidasDTO.getValor_BebidasDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'BebidasDAO': " + erro);
        }
    }
}
