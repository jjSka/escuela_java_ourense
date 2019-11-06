/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;

/**
 *
 * @author PC
 */
public class EstructurasControl {
    
    public static void ejecutarBucles() {
        char arrayChar[] = {'a', 'b', 'c', 'd'};
        System.out.println(arrayChar);
        int index = 0;
        while (index < arrayChar.length) {
            System.out.println("Index=" + index + ",char " + arrayChar[index]);
            index++;
        }
        for (index = 0; index < arrayChar.length; index++) {
            System.out.println("Index=" + index + ",char " + arrayChar[index]);
        }
        index = 0;
        do {
            System.out.println("Index=" + index + ",char " + arrayChar[index]);
            index++;
        } while (index < arrayChar.length);

        for (char caracter : arrayChar) {
            System.out.println("char= " + caracter);
        }

    }

    public static void ejecutarCondiciones() {
        if ("Palabra".length() > 5) {
            System.out.println("Palabra larga");
        }
        if ("Texto".length() > 5); else if ("Texto".length() > 7) {
            System.out.println("miau");
        } else {
            System.out.println("palabra corta");
        }

        if ("en un lugar de la mancha".contains("LUGAR")) {
            System.out.println("LUGAR");
        } else if ("en un lugar de la mancha".contains("MANCHA")) {
            System.out.println("MANCHA");
        } else if ("en un lugar de la mancha".contains("otro")) {
            System.out.println("OTRO");
        } else {
            System.out.println("no hay por mayusculas");
        }

        int numeroPeq = 0;
        switch (numeroPeq + 5) {
            case 0:
                System.out.println("num peq 0");
                break;
            case 1:
                System.out.println("num peq 1");
                break;
            default:
                System.out.println("miau no vale ni 0 ni 1");
                break;

        }
    }
    
}
