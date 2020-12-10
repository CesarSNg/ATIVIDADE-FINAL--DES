package pacotao;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

    private Connection con;

    public ClienteDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserirCliente(ClienteBean cliente) {

        String sql = "insert into tbclientes(nome, telRede, telCome, telCel, email)values(?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps;
            ps = getCon().prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelRede());
            ps.setString(3, cliente.getTelCome());
            ps.setString(4, cliente.getTelCel());
            ps.setString(5, cliente.getEmail());

            if (ps.executeUpdate() > 0) {
                return "Sucesso";
            } else {
                return "Erro";
            }

        } catch (SQLException ex) {
            return ex.getMessage();

        }
    }

    public String alterarCliente(ClienteBean cliente) {

        String sql = "update tbclientes set nome = ?, telR = ?, telCo = ?, telCe = ?, email = ? where id = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelRede());
            ps.setString(3, cliente.getTelCome());
            ps.setString(4, cliente.getTelCel());
            ps.setString(5, cliente.getEmail());
            ps.setInt(6, cliente.getId());

            if (ps.executeUpdate() > 0) {

                return "sucesso";
            } else {
                return "Erro ";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public String excluirCliente(ClienteBean cliente) {

        String sql = "delete from tbclientes where id = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setInt(1, cliente.getId());

            if (ps.executeUpdate() > 0) {
                return " sucesso!!!";
            } else {
                return "Erro!!!";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public List<ClienteBean> listarTodos() {

        String sql = "select * from tbclientes";

        List<ClienteBean> listaClientes = new ArrayList<>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    ClienteBean cb = new ClienteBean();
                    cb.setId(rs.getInt(1));
                    cb.setNome(rs.getString(2));
                    cb.setTelRede(rs.getString(3));
                    cb.setTelCome(rs.getString(4));
                    cb.setTelCel(rs.getString(5));
                    cb.setEmail(rs.getString(6));

                    listaClientes.add(cb);
                }
                return listaClientes;
            } else {
                return null;
            }

        } catch (SQLException ex) {
            return null;
        }
    }
}
