/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medico.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;

/**
 *
 * @author celso
 */
public class Utils {

    public static Integer getIdate(String dataNasc) throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Calendar dtNasc = Calendar.getInstance();
        dtNasc.setTime(formato.parse(dataNasc));

        Date dataAtual = new Date(System.currentTimeMillis());
        Calendar dtAtual = Calendar.getInstance();
        dtAtual.setTime(dataAtual);

        int idade = dtAtual.get(Calendar.YEAR) - dtNasc.get(Calendar.YEAR);

        if (dtAtual.get(Calendar.MONTH) < dtNasc.get(Calendar.MONTH)) {
            idade--;
        } else if (dtAtual.get(Calendar.MONTH) == dtNasc.get(Calendar.MONTH)) {
            if (dtAtual.get(Calendar.DAY_OF_MONTH) < dtNasc.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }

        return idade;
    }

    public static boolean soNumero(String texto) {
        //return texto.matches("[0-9]");
        for (char letra : texto.toCharArray()) {
            if (letra < '0' || letra > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean validaCpf(String texto) {
        String cpf1 = texto.replace(".", "");
        String cpf = cpf1.replace("-", "");

        if (cpf.equals("00000000000") || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {
            return false;
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        // Calculando o primeiro digito verificador
        try {
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48);
            }

            // Calculando o segundo digito verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Valida os digitos verificadores
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
                return true;
            } else {
                return false;
            }

        } catch (InputMismatchException ex) {
            System.out.println("Erro ao validar CPF: " + ex.getMessage());
            return false;
        }
        //return false;
    }
}
