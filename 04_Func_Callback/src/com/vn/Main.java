/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn;

import com.vn.liboperaarrays.OperarArrays;
import java.io.PrintStream;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] array_A = {1, 2, 3, 4, 5};
        double[] array_B = {2, 3, 4, 5, 6};
        double[] arraySumaAB = OperarArrays.operarArrays(array_A, array_B, Main::suma);
        mostrar(System.out, arraySumaAB);
        OperarArrays.FunCallBackOperarArrays divide = (double x, double y) -> {
            return x/y;
        };
        double[] arrayDivAB = OperarArrays.operarArrays(array_A, array_B, (double x, double y)->{
            return x/y;
        });
        mostrar(System.out, arrayDivAB);
       /* OperarArrays.FunCallBackOperarArrays resta = (double x, double y) -> {
            return x/y;
        };     */   
    }

    public static double suma(double x, double y) {
        return x + y;
    }
    public static double divide(double x, double y) {
        return x / y;
    }    

    public static void mostrar(PrintStream salida, double[] a) {
        String tabla = "<table border=2><tr>";
        for (int i = 0; i < a.length; i++) {
            final double element = a[i];
            tabla += "<td>&nbsp; " + element + " &nbsp;</td>\n";
        }
        salida.println(tabla + "</tr></table>");
    }

}
