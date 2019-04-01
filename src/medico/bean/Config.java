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
public class Config {
    private Long id;
    private String end;
    private String tels;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
}
