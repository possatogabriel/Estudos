package DAO;

import java.sql.*;

import DTO.ClienteDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Possato
 */
public class ClienteDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarCliente(ClienteDTO objClienteDTO) {
        String sql = "INSERT INTO Clientes (CPF, Nome, Sexo, Idade, Endereco, Email, Telefone, Data_cadastro) VALUES (?,?,?,?,?,?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objClienteDTO.getCPF_ClienteDTO());
            pstm.setString(2, objClienteDTO.getNome_ClienteDTO());
            pstm.setString(3, objClienteDTO.getSexo_ClienteDTO());
            pstm.setInt(4, objClienteDTO.getIdade_ClienteDTO());
            pstm.setString(5, objClienteDTO.getEndereço_ClienteDTO());
            pstm.setString(6, objClienteDTO.getEmail_ClienteDTO());
            pstm.setString(7, objClienteDTO.getTelefone_ClienteDTO());
            pstm.setString(8, objClienteDTO.getDataCadastro_ClienteDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'ClienteDAO': " + erro);
        }
    }
    
}
