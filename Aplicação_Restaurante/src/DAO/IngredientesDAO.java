package DAO;

import java.sql.*;

import DTO.IngredientesDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Possato
 */
public class IngredientesDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarIngrediente(IngredientesDTO objIngredientesDTO) {
        String sql = "INSERT INTO Ingredientes (Nome, Unidade_Medida, ID_prato, ID_bebida) VALUES (?,?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            
            pstm.setString(1, objIngredientesDTO.getNome_IngredientesDTO());
            pstm.setString(2, objIngredientesDTO.getUnidadeMedida_IngredientesDTO());
            pstm.setInt(3, objIngredientesDTO.getIDPrato_IngredientesDTO());
            pstm.setInt(4, objIngredientesDTO.getIDBebida_IngredientesDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'IngredientesDAO': " + erro);
        }
    }
}
