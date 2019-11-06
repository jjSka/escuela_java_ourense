/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.funcionesbasicas;

import com.vn.introjava.funcionesbasicas.Ordenamiento;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TestOrdenamiento {

    public TestOrdenamiento() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    private void probarOrdenamientoSistemaHumano(int[] array, int[] arrayOrdenadoOk) {

        //int[] array = {4, 2, 3, 1};
        //int[] arrayOrdenadoOk = {1, 2, 3, 4};
        assertArrayEquals(Ordenamiento.ordenarArrayBurbuja(array), arrayOrdenadoOk);

//        assertEquals(10, 10);
        //      assertNotEquals("AA", "OO");
    }

    @Test
    public void probarOrdenamientoSistemaHumano_Array5() {

        int[] array = {5, 4, 3, 2, 1};
        int[] arrayOrdenadoOk = {1, 2, 3, 4, 5};

        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }

    @Test
    public void probarOrdenamientoSistemaHumano_ArrayTocho() {

        int[] array = {5, 4, 3, 2, 1, 6, 9, 7, 8};
        int[] arrayOrdenadoOk = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }

    @Test
    public void probarOrdenamientoSistemaHumano_ArrayCasiTocho() {

        int[] array = {5, 4, 3, 2, 1, 6, 9,};
        int[] arrayOrdenadoOk = {1, 2, 3, 4, 5, 6, 9};

        probarOrdenamientoSistemaHumano(new int[]{4, 5, 2, -2}, new int[]{-2, 2, 4, 5});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_ArrayVACIO() {

        int[] array = {5, 4, 3, 2, 1, 6, 9,};
        int[] arrayOrdenadoOk = {1, 2, 3, 4, 5, 6, 9};

        probarOrdenamientoSistemaHumano(new int[]{}, new int[]{});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_NULL() {

        int[] array = null;
        int[] arrayOrdenadoOk = null;

        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }

    @Test
    public void probarOrdenamientoSistemaHumano_Array_Ordenado() {

        int[] array = null;
        int[] arrayOrdenadoOk = null;

        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }

    @Test
    public void probarOrdenamientoSistemaHumano_MAL() {

        assertEquals(10, 5);
    }

    
    private void probarOrdenamientoSeleccionSistemaHumano(int[] array, int[] arrayOrdenadoOk) {

        assertArrayEquals(Ordenamiento.ordenarPorSeleccion(array), arrayOrdenadoOk);

    }
    
    
    @Test
    public void probarOrdenamientoSeleccion() {
        int[] array = {3,4,1,5};
        int[] arrayOrdenadoOk = {1,3,4,5};

        probarOrdenamientoSeleccionSistemaHumano(array, arrayOrdenadoOk);
    }
    
     @Test
    public void probarOrdenamientoSeleccionArray5() {
        int[] array = {3,4,1,5,243};
        int[] arrayOrdenadoOk = {1,3,4,5,243};

        probarOrdenamientoSeleccionSistemaHumano(array, arrayOrdenadoOk);
    }  

     @Test
    public void probarOrdenamientoSeleccionOrden() {
        int[] array = {1,3,4,5,243};
        int[] arrayOrdenadoOk = {1,3,4,5,243};

        probarOrdenamientoSeleccionSistemaHumano(array, arrayOrdenadoOk);
    } 
    
     @Test
    public void probarOrdenamientoSeleccionInverso() {
        int[] array = {3,4,1,5,243};
        int[] arrayOrdenadoOk = {1,3,4,5,243};

        probarOrdenamientoSeleccionSistemaHumano(array, arrayOrdenadoOk);
    } 
    
     @Test
    public void probarOrdenamientoSeleccionLimite() {
        int a=0,x;
        int[] array = {Integer.MIN_VALUE,Integer.MAX_VALUE};
        int[] arrayOrdenadoOk = {Integer.MIN_VALUE,Integer.MAX_VALUE};
        probarOrdenamientoSeleccionSistemaHumano(array, arrayOrdenadoOk);
    }  
    
    
    
    
}
