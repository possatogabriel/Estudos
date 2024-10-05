package DAO;

import java.sql.*;

import DTO.ReservasDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Possato
 */
public class ReservasDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarReserva(ReservasDTO objReservasDTO) {
        String sql = "INSERT INTO Reservas (Data_reserva, ID_cliente, Mesa, ID_filial, Capacidade) VALUES (?,?,?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            
            pstm.setString(1, objReservasDTO.getDataReserva_Reservas());
            pstm.setInt(2, objReservasDTO.getIDCliente_Reservas());
            pstm.setString(3, objReservasDTO.getMesa_Reservas());
            pstm.setInt(4, objReservasDTO.getIDFilial_Reservas());
            pstm.setInt(5, objReservasDTO.getCapacidade_Reservas());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'ReservasDAO': " + erro);
        }
    }
}
