package DAO;

import java.sql.*;

import DTO.EstoqueDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Possato
 */
public class EstoqueDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarEstoque(EstoqueDTO objEstoqueDTO) {
        String sql = "INSERT INTO Estoque (ID_fornecedor, Quantidade, ID_filial) VALUES (?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            pstm.setInt(1, objEstoqueDTO.getIDFornecedor_EstoqueDTO());
            pstm.setInt(2, objEstoqueDTO.getQntd_EstoqueDTO());
            pstm.setInt(3, objEstoqueDTO.getIDFilial_EstoqueDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'EstoqueDAO': " + erro);
        }
    }
}
