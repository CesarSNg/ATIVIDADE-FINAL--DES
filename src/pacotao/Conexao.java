package pacotao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

        
public class Conexao {
    
    public static Connection AbrirConexao() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/dbcadclientes?user=root&password=";

            con = DriverManager.getConnection(url);
            System.out.println("Conexão aberta \n");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;    
}
    public static void fecharConexao(Connection con) {

        try {
            con.close();
            System.out.println("Conexão fechada!!!");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
