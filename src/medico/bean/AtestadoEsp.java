/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medico.bean;

/**
 *
 * @author celso
 */
public class AtestadoEsp {

    private int id;
    private String paciente;
    private String end;
    private String prescricao;
    private String tels;
    private String data;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the paciente
     */
    public String getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the end
     */
    public String getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * @return the prescricao
     */
    public String getPrescricao() {
        return prescricao;
    }

    /**
     * @param prescricao the prescricao to set
     */
    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    /**
     * @return the tels
     */
    public String getTels() {
        return tels;
    }

    /**
     * @param tels the tels to set
     */
    public void setTels(String tels) {
        this.tels = tels;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

}
