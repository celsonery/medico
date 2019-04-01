/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medico.dao;

import acessodb.ConexaoSqlite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import medico.bean.AtestadoClinico;

/**
 *
 * @author celso
 */
public class AtestadoCliDao {

    Connection conn;

    public AtestadoCliDao() {
        conn = ConexaoSqlite.getConexao();
    }

    public int AdicionarModelo(AtestadoClinico aMed) {
        try {
            String sql = "insert into modelos values(null, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, aMed.getNome());
            stmt.setString(2, aMed.getText());
            stmt.setString(3, aMed.getTipo());
            stmt.setString(4, aMed.getEnd());
            stmt.setString(5, aMed.getTels());
            stmt.setString(6, aMed.getData());

            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AtestadoMedDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AtestadoMedDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int AlterarModelo(AtestadoClinico aMed) {
        try {
            String sql = "update modelos set nome = ?, text = ?, tipo = ?, end = ?, tels = ?, data = ? where id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, aMed.getNome());
            stmt.setString(2, aMed.getText());
            stmt.setString(3, aMed.getTipo());
            stmt.setString(4, aMed.getEnd());
            stmt.setString(5, aMed.getTels());
            stmt.setString(6, aMed.getData());
            
            stmt.setLong(7, aMed.getId());

            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AtestadoMedDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AtestadoMedDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int ExcluirModelo(String aMed) {
        try {
            String sql = "delete from modelos where nome = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, aMed);

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AtestadoMedDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AtestadoMedDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<AtestadoClinico> ListasAtestadoMedico() {
        try {
            String sql = "select * from modelos where tipo = 'Clinico'";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            List<AtestadoClinico> listAtMed = new ArrayList<>();

            while (rs.next()) {
                AtestadoClinico aMed1 = new AtestadoClinico();

                aMed1.setId(rs.getLong("id"));
                aMed1.setNome(rs.getString("nome"));
                aMed1.setText(rs.getString("text"));
                aMed1.setTipo(rs.getString("tipo"));
                aMed1.setEnd(rs.getString("end"));
                aMed1.setTels(rs.getString("tels"));
                aMed1.setData(rs.getString("data"));
                
                listAtMed.add(aMed1);
            }

            rs.close();
            stmt.close();

            return listAtMed;

        } catch (SQLException ex) {
            Logger.getLogger(AtestadoMedDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AtestadoMedDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
