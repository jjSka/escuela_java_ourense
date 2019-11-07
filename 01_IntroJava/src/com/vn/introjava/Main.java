/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;

import static com.vn.introjava.funcionesbasicas.Ordenamiento.*;
import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.FabricaCoches;

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

        /*DatosBasicos.mostrarTiposDatos();
        EstructurasControl.ejecutarBucles();
        EstructurasControl.ejecutarCondiciones();
        DatosBasicos.probarOperadores();
        ordenarArray();*/
 /*int a=4;
        int x=a!=4?Integer.MAX_VALUE:Integer.MIN_VALUE;
         System.out.println(x);
        ordenarPorSeleccion(new int[]{1,3,4,5});*/
        /*Coche c = FabricaCoches.crear("Seat en main");
        c.mostrarEstado();
        c = FabricaCoches.crear(null);
        c.mostrarEstado();*/
        CocheRally cr= new CocheRally();
        cr.mostrarEstado();
        cr.mostrarEstadoAntiguo();
    }

}
