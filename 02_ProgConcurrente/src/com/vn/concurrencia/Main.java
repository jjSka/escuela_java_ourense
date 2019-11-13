/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HilosSencillos hs = new HilosSencillos();
        long timeIni = System.currentTimeMillis();
        /* hs.ejecutarHilosRunAB();
        mostrarTiempo(timeIni);
        timeIni = System.currentTimeMillis();*/
        hs.ejecutarArrayHilos();
        mostrarTiempo(timeIni);
    }

    static void mostrarTiempo(long timeInicial) {

        System.out.println("Run en paralelo ha tardado " + ((double) System.currentTimeMillis() - timeInicial) / 1000.0);
    }

}
