/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.funcionesbasicas;

/**
 *
 * @author PC
 */
public class DatosBasicos {
    
    public static void mostrarTiposDatos() {
        System.out.println("Tipos de datos");
        byte unByte = -128;
        int unEntero = 1000000000; // 4 bytes
        long unLong = 1240124017878L; //8 bytes
        System.out.println(unByte + " " + unEntero + " " + unLong);
        float unFloat = 3.23456789f; //4 bytes
        double decimalDoblePrec = 1.234567893456454578; //8 bytes
        boolean cond = true; //1byte
        char caracter = 'j'; //2bytes unicode
        char unCharEntero = 97;
        System.out.println(unFloat + " " + decimalDoblePrec
                + " " + cond + " " + caracter + " "
                + (int) unCharEntero + " " + unCharEntero);
        String unTexto = "asdoijasdioj";
        System.out.println(unTexto);
        System.out.println("concatenado: " + unTexto.concat("AÑADIDO"));
        System.out.println("En mayusculas: " + unTexto.toUpperCase());
    }

    public static void probarOperadores() {
        //Operadores unarios:

        System.out.println("Negacion: " + !true);
        System.out.println("Negativo: " + -(10 + 5));
        System.out.println("Casting:" + (int) 36786876343434L);
        int contador = 10;
        System.out.println("incremento: " + contador++);
        System.out.println("incremento: " + ++contador);

        //Operadores binarios:
        System.out.println("suma y mult " + (5 + 5) * 2);

        //Operadores bit a bit:
        //00010101 = 21
        //00000111 = 7
        //00000101 = 5 AND
        System.out.println("op binatio 21 AND 7 = " + (21 & 7));
        // Reduce memoria en Operaciones de BD.Muy rapida y eficiente.
        //00010111 = 23 OR
        //00010010 = 18 XOR
        System.out.println("op binatio 21 OR 7 = " + (21 ^ 7));
    }

    
}
