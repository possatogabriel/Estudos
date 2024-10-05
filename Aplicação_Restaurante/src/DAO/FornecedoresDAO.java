package DAO;

import java.sql.*;

import DTO.FornecedoresDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Possato
 */
public class FornecedoresDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarFornecedor(FornecedoresDTO objFornecedoresDTO) {
        String sql = "INSERT INTO Fornecedores (Nome, CNPJ, Tipo_material, Email, Telefone, Valor_material) VALUES (?,?,?,?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objFornecedoresDTO.getNome_FornecedoresDTO());
            pstm.setString(2, objFornecedoresDTO.getCNPJ_FornecedoresDTO());
            pstm.setString(3, objFornecedoresDTO.getMaterial_FornecedoresDTO());
            pstm.setString(4, objFornecedoresDTO.getEmail_FornecedoresDTO());
            pstm.setString(5, objFornecedoresDTO.getTelefone_FornecedoresDTO());
            pstm.setString(6, objFornecedoresDTO.getValor_FornecedoresDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'FornecedoresDAO': " + erro);
        }
    }
}
