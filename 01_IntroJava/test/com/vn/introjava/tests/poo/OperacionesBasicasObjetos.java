/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class OperacionesBasicasObjetos {

    @Test
    public void creandoObjetos() {
        Coche miCoche = null;

        miCoche = new Coche();
        System.out.println("Texto de coche: " + miCoche.toString());

        Coche miCocheFindes = new Coche();
        assertNotNull(miCoche);
        assertNotNull(miCocheFindes);
        assertNotEquals(miCoche, miCocheFindes);

        miCoche.setMarca("Kia");
        miCocheFindes.setMarca("Hammer");
        System.out.println("Marca de mi coche: " + miCoche.getMarca());
        System.out.println("Marca de mi coche de los findes: " + miCocheFindes.getMarca());

        miCocheFindes = miCoche;
        assertEquals(miCoche, miCocheFindes);
        miCoche.setMarca("Hammer Limusina");
        System.out.println("Marca de mi coche: " + miCoche.getMarca());
        System.out.println("Marca de mi coche de los findes: " + miCocheFindes.getMarca());

        //Intro polimorfismo
        Object refAmiCoche = miCoche;
        //no podemos por que no tiene la forma de coche
        //System.out.println("Marca de mi coche: " + refAmiCoche.getMarca());
        //si podemos..
        assertTrue(refAmiCoche.equals(miCoche));
        
        Object objeto= new Object();
        miCoche=(Coche) objeto;
        assertTrue(objeto.equals(miCoche));
        
    }
}
