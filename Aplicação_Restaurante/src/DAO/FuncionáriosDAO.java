package DAO;

import java.sql.*;

import DTO.FuncionáriosDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Possato
 */
public class FuncionáriosDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarFuncionário(FuncionáriosDTO objFuncionáriosDTO) {
        String sql = "INSERT INTO Funcionarios (CPF, Nome, Sexo, Idade, Endereco, Email, Telefone, ID_filial, Cargo, Data_contatacao) VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objFuncionáriosDTO.getCPF_FuncionáriosDTO());
            pstm.setString(2, objFuncionáriosDTO.getNome_FuncionáriosDTO());
            pstm.setString(3, objFuncionáriosDTO.getSexo_FuncionáriosDTO());
            pstm.setInt(4, objFuncionáriosDTO.getIdade_FuncionáriosDTO());
            pstm.setString(5, objFuncionáriosDTO.getEndereço_FuncionáriosDTO());
            pstm.setString(6, objFuncionáriosDTO.getEmail_FuncionáriosDTO());
            pstm.setString(7, objFuncionáriosDTO.getTelefone_FuncionáriosDTO());
            pstm.setInt(8, objFuncionáriosDTO.getIDFilial_FuncionáriosDTO());
            pstm.setString(9, objFuncionáriosDTO.getCargo_FuncionáriosDTO());
            pstm.setString(10, objFuncionáriosDTO.getDataContratação_FuncionáriosDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'FuncionáriosDAO': " + erro);
        }
    }
}
