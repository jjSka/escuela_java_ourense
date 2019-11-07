/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.FabricaCoches;
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
    public void creandoObjetos() throws Exception {
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
    
    @Test
    public void probandoSobrecarga(){
        Coche miCoche = new Coche();
        Coche miCocheFindes = new Coche();
        
        int posicionLlave=4;
       // miCoche.arrancar(posicionLlave);
        miCocheFindes.arrancar();
        for (int i = -2; i < 6; i++) {
            miCoche.arrancar(i);
            if(i==4)
                assertTrue(miCoche.isArrancado());
            else
                assertFalse(miCoche.isArrancado());
            
        }
        assertEquals(miCoche.isArrancado(),true);
        assertEquals(miCocheFindes.isArrancado(),true);
        
        miCocheFindes.arrancar(3);
        assertEquals(miCocheFindes.isArrancado(),false);
    }
    
    @Test 
    public void usandoConstructoresSobrecargados(){
        Coche c= new Coche("Ferrari");
        assertEquals(c.getMarca(), "Ferrari");
    }
    
    @Test(expected= IllegalArgumentException.class)
    public void gestionExcepciones() throws Exception{
        Coche c = FabricaCoches.crear("");
    }
    @Test
    public void testSobreescrituraMetodos() throws Exception{
        CocheRally supra= new CocheRally();
        supra.setMarca("Toyota");
        supra.setRozamiento(7f);
        assertTrue(supra.getRozamiento()== 7f);
        assertTrue(supra.arrancar("arrancar"));
        // Usando TDD TEST DRIVEN DEVELOPMENT
        assertTrue(supra.arrancar("ARRANCAR"));
        assertTrue(supra.arrancar("ENCENDER"));
        
        
    }
}
