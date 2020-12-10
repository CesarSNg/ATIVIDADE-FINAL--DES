package pacotao;

import java.sql.*;
import java.util.*;

public class TestaCliente {
    
    public static void main(String[] args) {

        Connection con = Conexao.AbrirConexao();

        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);
        
        cb.setNome("James");
        cb.setTelRede("66666666");
        cb.setTelCome("966666666");
        cb.setTelCel("966666666");
        cb.setEmail("JNG@gmail.com");
        
        System.out.println(cd.inserirCliente(cb));

        List<ClienteBean> lista = cd.listarTodos();

        if (lista != null) {

            for (ClienteBean cliente : lista) {
                
                System.out.println("ID: " + cliente.getId());
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Tel Residêncial: " + cliente.getTelRede());
                
            }
        }
    }
}
