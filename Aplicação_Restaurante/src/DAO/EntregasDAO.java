package DAO;

import java.sql.*;

import DTO.EntregasDTO;    
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Possato
 */
public class EntregasDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarEntregas(EntregasDTO objEntregasDTO) {
        String sql = "INSERT INTO Entregas (Endereco, ID_pedido, Data_entrega) VALUES (?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objEntregasDTO.getEndereço_EntregasDTO());
            pstm.setInt(2, objEntregasDTO.getIDPedido_EntregasDTO());
            pstm.setString(3, objEntregasDTO.getDataEntrega_EntregasDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'EntregasDAO': " + erro);
        }
    }
}
