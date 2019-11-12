/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;

import com.sun.istack.internal.logging.Logger;
import com.vn.excepciones.UsoNormalExcepciones;
import static com.vn.introjava.funcionesbasicas.Ordenamiento.*;
import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.FabricaCoches;
import java.util.Arrays;
import java.util.logging.Level;

/**
 * Clase Principal del proyecto Ejemplos Java
 *
 * @author PC
 */
public class Main {

    /**
     * Función que se ejecuta al arrancar el programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("tipos de datos:");
            Coche c = FabricaCoches.crear("Seat en main");
            c.mostrarEstado();
            c = FabricaCoches.crear(null);
            c.mostrarEstado();
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligroso();
            Object objNulo = null;
            System.out.println(objNulo.toString());
        } catch (Exception ex) {

        }
        CocheRally cr = new CocheRally();
        cr.mostrarEstadoAntiguo();
        cr.mostrarEstado();
        cr.avanzar();

        try {
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligroso();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepcion " + ex.getMessage());
            System.out.println("\nPila de llamadas " + Arrays.toString(ex.getStackTrace()));
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Object objNulo = null;
            System.out.println(objNulo.toString());
        }
         catch (IllegalArgumentException ex) {
            System.out.println("Excepcion " + ex.toString());
            System.out.println("\nPila de llamadas " + Arrays.toString(ex.getStackTrace()));
          //  Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (RuntimeException ex) {
            System.out.println("Excepcion " + ex.getMessage());
            System.out.println("\nPila de llamadas " + Arrays.toString(ex.getStackTrace()));
          //  Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("Excepcion " + ex.getMessage());
            System.out.println("\nPila de llamadas " + Arrays.toString(ex.getStackTrace()));
          //  Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            System.out.println("Fin del programara trycatch");
        }
    }

}
