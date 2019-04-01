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
import medico.bean.Especialidade;

/**
 *
 * @author celso
 */
public class EspecialidadeDao {
    Connection conn;
    
    public EspecialidadeDao(){
        conn = ConexaoSqlite.getConexao();
    }
    
    public List<Especialidade> ListarEspecialidades(){
        try {
            String sql = "select * from especialidades order by nome";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            List<Especialidade> listEsp = new ArrayList<>();

            while (rs.next()) {
                Especialidade Esp1 = new Especialidade();

                Esp1.setId(rs.getLong("id"));
                Esp1.setNome(rs.getString("nome"));

                listEsp.add(Esp1);
            }

            rs.close();
            stmt.close();

            return listEsp;
            
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public int AdicionarEsp(Especialidade esp){
        try {
            String sql = "insert into especialidade values(null, ?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, esp.getNome());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }
    
    public int AlterarEsp(Especialidade esp, String nome){
        try {
            String sql = "update especialidade set nome = ? where id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nome);
            stmt.setLong(2, esp.getId());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }
    
    public int ExcluirEsp(Long esp){
        try {
            String sql = "delete from especialidade where id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setLong(1, esp);

            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(EspecialidadeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }
}
