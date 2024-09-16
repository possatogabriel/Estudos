package DAO;

import java.sql.*;

import DTO.UsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Possato
 */
public class UsuarioDAO {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO classUsuarioDTO) {
        conn = new ConnectorDAO().conectorDB();
        
        try {
            String sql = "SELECT * from UsuarioTabela WHERE Nome_Usuario = ? AND Senha_Usuario = ? ";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, classUsuarioDTO.getNome());
            stmt.setString(2, classUsuarioDTO.getSenha());
            
            ResultSet rs = stmt.executeQuery();
            return rs;
        }
        
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "ERRO NO USUARIODAO.JAVA: " + erro.getMessage());
            return null;
        }
    }
}
