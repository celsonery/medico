/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medico.util;

import medico.gui.FrmFerramentas;
import medico.gui.FrmImpressos;
import medico.gui.FrmPacientes;
import medico.gui.FrmPrecos;

/**
 *
 * @author celso
 */
public class guis {

    private static FrmPacientes iPac = null;
    private static FrmImpressos iPrint = null;
    private static FrmFerramentas iFerr = null;
    private static FrmPrecos iPrecos = null;
    
    public static FrmPacientes getiPac() {
        return iPac;
    }

    public static void setiPac(FrmPacientes iPac) {
        guis.iPac = iPac;
    }

    public static FrmImpressos getiPrint() {
        return iPrint;
    }

    public static void setiPrint(FrmImpressos iPrint) {
        guis.iPrint = iPrint;
    }

    public static FrmFerramentas getiFerr() {
        return iFerr;
    }

    public static void setiFerr(FrmFerramentas iFerr) {
        guis.iFerr = iFerr;
    }

    public static FrmPrecos getiPrecos() {
        return iPrecos;
    }

    public static void setiPrecos(FrmPrecos aiPrecos) {
        iPrecos = aiPrecos;
    }
}
