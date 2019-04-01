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
import medico.bean.Paciente;

/**
 *
 * @author celso
 */
public class PacienteDao {

    Connection conn;

    public PacienteDao() {
        conn = ConexaoSqlite.getConexao();
    }

    public int AdicionarPaciente(Paciente p1) {
        try {
            String sql = "INSERT INTO pacientes VALUES(null, null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, p1.getNome());
            stmt.setString(2, p1.getCpf());
            stmt.setString(3, p1.getRg());
            stmt.setString(4, p1.getDeclara());
            stmt.setString(5, p1.getSexo());
            stmt.setString(6, p1.getNasc());
            stmt.setString(7, p1.getEnd());
            stmt.setString(8, p1.getComp());
            stmt.setString(9, p1.getBairro());
            stmt.setString(10, p1.getCidade());
            stmt.setString(11, p1.getUf());
            stmt.setInt(12, p1.getCep());
            stmt.setString(13, p1.getTelres());
            stmt.setString(14, p1.getTelcom());
            stmt.setString(15, p1.getTelcel());
            stmt.setString(16, p1.getOp1());
            stmt.setString(17, p1.getTelfax());
            stmt.setString(18, p1.getOp2());
            stmt.setString(19, p1.getTeloutro());
            stmt.setString(20, p1.getEmail());
            stmt.setString(21, p1.getObs());
            stmt.setString(22, p1.getAlerta());
            stmt.setString(23, p1.getDtcadastro());
            stmt.setString(24, p1.getDtupdate());
            stmt.setString(25, p1.getCt());
            stmt.setString(26, p1.getCp());
            stmt.setString(27, p1.getLf());
            stmt.setString(28, p1.getCs());
            stmt.setString(29, p1.getPa());
            stmt.setString(30, p1.getUsg());
            stmt.setString(31, p1.getRx());
            stmt.setString(32, p1.getMgf());
            stmt.setString(33, p1.getTxtdo());
            stmt.setString(34, p1.getOutrotxt());

            stmt.executeUpdate();

            return LastID("pacientes");

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int AlterarPaciente(Paciente p1) {
        try {
            String sql = "UPDATE pacientes SET mat = ?,"
                    + "nome = ?,"
                    + "cpf = ?,"
                    + "rg = ?,"
                    + "declara = ?,"
                    + "sexo = ?,"
                    + "nasc = ?,"
                    + "end = ?,"
                    + "comp = ?,"
                    + "bairro = ?,"
                    + "cidade = ?,"
                    + "uf = ?,"
                    + "cep = ?,"
                    + "telres = ?,"
                    + "telcom = ?,"
                    + "telcel = ?,"
                    + "op1 = ?,"
                    + "telfax = ?,"
                    + "op2 = ?,"
                    + "teloutro = ?,"
                    + "email = ?,"
                    + "obs = ?,"
                    + "alerta = ?,"
                    + "dtcadastro = ?,"
                    + "dtupdate = ?,"
                    + "ct = ?,"
                    + "cp = ?,"
                    + "lf = ?,"
                    + "cs = ?,"
                    + "pa = ?,"
                    + "usg = ?,"
                    + "rx = ?,"
                    + "mgf = ?,"
                    + "do = ?,"
                    + "outrotxt = ? WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, p1.getMat());
            stmt.setString(2, p1.getNome());
            stmt.setString(3, p1.getCpf());
            stmt.setString(4, p1.getRg());
            stmt.setString(5, p1.getDeclara());
            stmt.setString(6, p1.getSexo());
            stmt.setString(7, p1.getNasc());
            stmt.setString(8, p1.getEnd());
            stmt.setString(9, p1.getComp());
            stmt.setString(10, p1.getBairro());
            stmt.setString(11, p1.getCidade());
            stmt.setString(12, p1.getUf());
            stmt.setInt(13, p1.getCep());
            stmt.setString(14, p1.getTelres());
            stmt.setString(15, p1.getTelcom());
            stmt.setString(16, p1.getTelcel());
            stmt.setString(17, p1.getOp1());
            stmt.setString(18, p1.getTelfax());
            stmt.setString(19, p1.getOp2());
            stmt.setString(20, p1.getTeloutro());
            stmt.setString(21, p1.getEmail());
            stmt.setString(22, p1.getObs());
            stmt.setString(23, p1.getAlerta());
            stmt.setString(24, p1.getDtcadastro());
            stmt.setString(25, p1.getDtupdate());
            stmt.setString(26, p1.getCt());
            stmt.setString(27, p1.getCp());
            stmt.setString(28, p1.getLf());
            stmt.setString(29, p1.getCs());
            stmt.setString(30, p1.getPa());
            stmt.setString(31, p1.getUsg());
            stmt.setString(32, p1.getRx());
            stmt.setString(33, p1.getMgf());
            stmt.setString(34, p1.getTxtdo());
            stmt.setString(35, p1.getOutrotxt());
            
            stmt.setLong(36, p1.getId());
            
            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int ExcluirPaciente(Paciente p1) {
        try {
            String sql = "DELETE FROM pacientes WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setLong(1, p1.getId());

            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<Paciente> ListarPaciente(String str, String tipo) {
        String sql = "";

        try {
            switch (tipo) {
                case "Cpf": {
                    sql = "SELECT * FROM pacientes WHERE cpf LIKE ? ORDER BY cpf";
                }
                break;
                case "Matricula": {
                    sql = "SELECT * FROM pacientes WHERE mat LIKE ? ORDER BY mat";
                }
                break;
                case "Nome": {
                    sql = "SELECT * FROM pacientes WHERE nome LIKE ? ORDER BY nome";
                }
                break;

                case "Todos": {
                    sql = "SELECT * FROM pacientes ORDER BY nome";
                }
                break;
            }
            //sql = "SELECT * FROM pacientes WHERE nome LIKE ? ORDER BY nome";
            PreparedStatement stmt = conn.prepareStatement(sql);
            if(!tipo.equals("Todos")){
                stmt.setString(1, str + '%');
            }

            ResultSet rs = stmt.executeQuery();

            System.out.println("Vou procurar por: " + tipo + " onde: " + str);
            System.out.println(sql);

            List<Paciente> pacEncontrados = new ArrayList<>();

            while (rs.next()) {
                Paciente p1 = new Paciente();

                p1.setId(rs.getLong("id"));
                p1.setMat(rs.getLong("mat"));
                p1.setNome(rs.getString("nome"));
                p1.setCpf(rs.getString("cpf"));
                p1.setRg(rs.getString("rg"));
                p1.setDeclara(rs.getString("declara"));
                p1.setSexo(rs.getString("sexo"));
                p1.setNasc(rs.getString("nasc"));
                p1.setEnd(rs.getString("end"));
                p1.setComp(rs.getString("comp"));
                p1.setBairro(rs.getString("bairro"));
                p1.setCidade(rs.getString("cidade"));
                p1.setUf(rs.getString("uf"));
                p1.setCep(rs.getInt("cep"));
                p1.setTelres(rs.getString("telres"));
                p1.setTelcom(rs.getString("telcom"));
                p1.setTelcel(rs.getString("telcel"));
                p1.setOp1(rs.getString("op1"));
                p1.setTelfax(rs.getString("telfax"));
                p1.setOp2(rs.getString("op2"));
                p1.setTeloutro(rs.getString("teloutro"));
                p1.setEmail(rs.getString("email"));
                p1.setObs(rs.getString("obs"));
                p1.setAlerta(rs.getString("alerta"));
                p1.setDtcadastro(rs.getString("dtcadastro"));
                p1.setDtupdate(rs.getString("dtupdate"));
                p1.setCt(rs.getString("ct"));
                p1.setCp(rs.getString("cp"));
                p1.setLf(rs.getString("lf"));
                p1.setCs(rs.getString("cs"));
                p1.setPa(rs.getString("pa"));
                p1.setUsg(rs.getString("usg"));
                p1.setRx(rs.getString("rx"));
                p1.setMgf(rs.getString("mgf"));
                p1.setTxtdo(rs.getString("do"));
                p1.setOutrotxt(rs.getString("outrotxt"));

                pacEncontrados.add(p1);
            }

            rs.close();
            stmt.close();

            return pacEncontrados;

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<Paciente> buscaPacCpf(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int LastID(String Tbl) {
        try {
            String sql = "SELECT * FROM sqlite_sequence WHERE name = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, Tbl);

            ResultSet rs = stmt.executeQuery();

            return rs.getInt("seq");

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean verificaCpf(String cpf) {
        String cpf1 = cpf.replace(".", "");
        String cpf2 = cpf1.replace("-", "");

        try {
            String sql = "SELECT * FROM pacientes WHERE cpf = ?";
            ResultSet rs;
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, cpf2);
                rs = stmt.executeQuery();
            }
            rs.close();
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
