package DAO;

import java.sql.*;

import DTO.PedidosDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Possato
 */
public class PedidosDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarPedido(PedidosDTO objPedidosDTO) {
        String sql = "INSERT INTO Pedidos (ID_cliente, ID_prato, ID_bebida, Valor, Tipo_pagamento, Endereco, Data_pedido) VALUES (?,?,?,?,?,?,?)";
        
        conn = new ConexãoDAO().connectorDB();
        
        try {
            pstm = conn.prepareStatement(sql); 
            
            pstm.setInt(1, objPedidosDTO.getIDCliente_PedidosDTO());
            pstm.setInt(2, objPedidosDTO.getIDPrato_PedidosDTO());
            pstm.setInt(3, objPedidosDTO.getIDBebida_PedidosDTO());
            pstm.setString(4, objPedidosDTO.getValor_PedidosDTO());
            pstm.setString(5, objPedidosDTO.getPagamento_PedidosDTO());
            pstm.setString(6, objPedidosDTO.getEndereço_PedidosDTO());
            pstm.setString(7, objPedidosDTO.getDataPedido_PedidosDTO());
            
            pstm.execute();
            pstm.close();
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'PedidosDAO': " + erro);
        }
    }
}
