package DAO;

import java.sql.*;

import DTO.FilialDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Possato
 */
public class FilialDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarFilial(FilialDTO objFilialDTO) {
        String sql = "INSERT INTO Filiais (Endereco, Email, Telefone, Quant_mesas, Avaliacao) VALUES (?,?,?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objFilialDTO.getEndereço_FiliaisDTO());
            pstm.setString(2, objFilialDTO.getEmail_FiliaisDTO());
            pstm.setString(3, objFilialDTO.getTelefone_FiliaisDTO());
            pstm.setInt(4, objFilialDTO.getQtndMesas_FiliaisDTO());
            pstm.setString(5, objFilialDTO.getAvaliação_FiliaisDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'FilialDAO': " + erro);
        }
    }
}
