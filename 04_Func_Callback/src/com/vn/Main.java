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
        Object[] array_A = {new Double(1),new Double(2),new Double(3),new Double(4),new Double(5)};
        Object[] array_B = {new Double(2),new Double(3),new Double(4),new Double(5),new Double(6)};
        Object[] arraySumaAB = OperarArrays.operarArrays(array_A, array_B, Main::suma);
        mostrar(System.out, arraySumaAB);
        /*OperarArrays.FunCallBackOperarArrays divide = (Object x, Object y) -> {
            return x/y;
        };
        double[] arrayDivAB = OperarArrays.operarArrays(array_A, array_B, (Object x, Object y)->{
            return x/y;
        });
        mostrar(System.out, arrayDivAB);*/
       /* OperarArrays.FunCallBackOperarArrays resta = (double x, double y) -> {
            return x/y;
        };     */  
       
       
    }

    public static Object suma(Object x, Object y) {
        return (Double)x + (Double)y;
    }
    public static Object divide(double x, double y) {
        return x / y;
    }    

    public static void mostrar(PrintStream salida, Object[] a) {
        String tabla = "<table border=2><tr>";
        for (int i = 0; i < a.length; i++) {
            final Object element = a[i];
            tabla += "<td>&nbsp; " + element + " &nbsp;</td>\n";
        }
        salida.println(tabla + "</tr></table>");
    }

}
