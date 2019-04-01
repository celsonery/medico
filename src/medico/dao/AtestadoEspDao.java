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
import medico.bean.AtestadoEsp;

/**
 *
 * @author celso
 */
public class AtestadoEspDao {
    
    Connection conn;
    
    public AtestadoEspDao(){
        conn = ConexaoSqlite.getConexao();
    }
    
    public int AdicionarAtestadoEsp(AtestadoEsp esp){
        try {
            String sql = "insert into atestado_especial values(null, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, esp.getPaciente());
            stmt.setString(2, esp.getEnd());
            stmt.setString(3, esp.getPrescricao());
            stmt.setString(4, esp.getTels());
            stmt.setString(5, esp.getData());

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
    
    public int AlterarAtestadoEsp(AtestadoEsp esp){
        try {
            String sql = "update atestado_especial set paciente = ?, end = ?, prescricao = ?, tels = ?, data = ? where id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, esp.getPaciente());
            stmt.setString(2, esp.getEnd());
            stmt.setString(3, esp.getPrescricao());
            stmt.setString(4, esp.getTels());
            stmt.setString(5, esp.getData());

            stmt.setLong(6, esp.getId());

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
    
    public int ExcluirAtestadoEsp(int id){
        try {
            String sql = "delete from atestado_especial where id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

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
    
    public List<AtestadoEsp> ListarAtestadoEsp(){
        try {
            String sql = "select * from atestado_especial";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            List<AtestadoEsp> listAtEsp = new ArrayList<>();

            while (rs.next()) {
                AtestadoEsp aMed1 = new AtestadoEsp();

                aMed1.setId(rs.getInt("id"));
                aMed1.setPaciente(rs.getString("paciente"));
                aMed1.setEnd(rs.getString("end"));
                aMed1.setPrescricao(rs.getString("prescricao"));
                aMed1.setTels(rs.getString("tels"));
                aMed1.setData(rs.getString("data"));

                listAtEsp.add(aMed1);
            }

            rs.close();
            stmt.close();

            return listAtEsp;

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
