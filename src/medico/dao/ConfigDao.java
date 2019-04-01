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
import java.util.logging.Level;
import java.util.logging.Logger;
import medico.bean.Config;

/**
 *
 * @author celso
 */
public class ConfigDao {

    Connection conn;
    
    public ConfigDao(){
        conn = ConexaoSqlite.getConexao();
    }
    
    public int ModificaConfig(Config conf){
        try {
            String sql = "update config set end = ?, tels = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, conf.getEnd());
            stmt.setString(2, conf.getTels());
            
            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConfigDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConfigDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public Config BuscaConfig(){
        try {
            String sql = "select * from config";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Config conf = new Config();
            
            while(rs.next()){
                conf.setId(rs.getLong("id"));
                conf.setEnd(rs.getString("nome"));
                conf.setTels(rs.getString("tels"));
            }
            
            return conf;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConfigDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConfigDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
