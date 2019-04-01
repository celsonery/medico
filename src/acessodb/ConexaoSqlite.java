/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acessodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celso
 */
public class ConexaoSqlite {
 
    public static Connection getConexao(){
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:medico.db");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexaoSqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
