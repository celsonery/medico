/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medico.dao;

import medico.acessodb.ConexaoSqlite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import medico.bean.Recibo;

/**
 *
 * @author celso
 */
public class ReciboDao {

    Connection conn;

    public ReciboDao() {
        conn = ConexaoSqlite.getConexao();
    }

    public int AdicionarRecibo(Recibo re) {
        try {
            System.out.println("Adicionando recibo");

            String sql = "insert into recibos values(NULL,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, re.getCpf());
            stmt.setString(2, re.getNome());
            stmt.setDouble(3, re.getValor());
            stmt.setString(4, re.getVlExtenso());
            stmt.setString(5, re.getDescricao());
            stmt.setString(6, re.getData());

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ReciboDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReciboDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int AlterarRecibo(Recibo re) {
        return 0;
    }

    public int ExcluirRecibo(String re) {
        try {
            String sql = "delete from recibos where nome = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, re);

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ReciboDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReciboDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<Recibo> ListarRecibo(String nome) {
        try {
            String sql = "select * from recibos where nome like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nome + '%');
            
            ResultSet rs = stmt.executeQuery();

            List<Recibo> recList = new ArrayList<>();

            while (rs.next()) {
                Recibo r1 = new Recibo();

                r1.setId(rs.getInt("id"));
                r1.setCpf(rs.getString("cpf"));
                r1.setNome(rs.getString("nome"));
                r1.setValor(rs.getDouble("valor"));
                r1.setVlExtenso(rs.getString("vlExtenso"));
                r1.setDescricao(rs.getString("descricao"));
                r1.setData(rs.getString("data"));

                recList.add(r1);
            }

            rs.close();
            stmt.close();

            return recList;

        } catch (SQLException ex) {
            Logger.getLogger(ReciboDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReciboDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<Recibo> ListarRecibo() {
        try {
            String sql = "select * from recibos";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            List<Recibo> recList = new ArrayList<>();

            while (rs.next()) {
                Recibo r1 = new Recibo();

                r1.setId(rs.getInt("id"));
                r1.setCpf(rs.getString("cpf"));
                r1.setNome(rs.getString("nome"));
                r1.setValor(rs.getDouble("valor"));
                r1.setVlExtenso(rs.getString("vlExtenso"));
                r1.setDescricao(rs.getString("descricao"));
                r1.setData(rs.getString("data"));

                recList.add(r1);
            }

            rs.close();
            stmt.close();

            return recList;

        } catch (SQLException ex) {
            Logger.getLogger(ReciboDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReciboDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
