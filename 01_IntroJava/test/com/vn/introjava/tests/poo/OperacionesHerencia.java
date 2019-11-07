/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.TipoVehiculo;
import com.vn.introjava.poo.Tractor;
import com.vn.introjava.poo.Vehiculo;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class OperacionesHerencia {

    static CocheRally supra;
    static Coche turismo;

    @BeforeClass
    public static void setUpClass() throws Exception {
        supra = new CocheRally();
    }

    @Test
    public void testSobreescrituraMetodos() throws Exception {
        supra.setMarca("Toyota");
        supra.setRozamiento(7f);
        assertTrue(supra.getRozamiento() == 7f);
        assertTrue(supra.arrancar("arrancar"));
        // Usando TDD TEST DRIVEN DEVELOPMENT
        assertTrue(supra.arrancar("ARRANCAR"));
        assertTrue(supra.arrancar("ENCENDER"));

        supra.mostrarEstado();
    }

    @Test
    public void testPolimorfismo() {

        supra.setRozamiento(15f);
        //no se puede pq coche no tiene rozamiento ni set
        //turismo.setRozamiento(15f);
        //en java todos los metodos virtuales. si un hijo tiene un metodo se invoca al del hijo
        turismo = supra;
        turismo.mostrarEstado();

    }

    @Test
    public void testEnumerado() {
        supra.setTipo(TipoVehiculo.TURISMO);
        System.out.println(" Tipo: " + supra.getTipo().toString());
        System.out.println(" Valor tipo: " + supra.getTipo().ordinal());

        Tractor miTractorAmarillo = new Tractor();
        miTractorAmarillo.setTipo(TipoVehiculo.valueOf("TRACTOR"));
        System.out.println("Valor tipo: " + miTractorAmarillo.getTipo());
        miTractorAmarillo.setTipo(TipoVehiculo.values()[2]);
        System.out.println("Valor tipo: " + miTractorAmarillo.getTipo());
    }

    @Test
    public void testClasesAbstractas() {
        //Vehiculo v= new Vehiculo(); no se puede, es abstracto
        Vehiculo v = new Coche("Dacia");
        Vehiculo tractor = new Tractor();
        Vehiculo subaru = new CocheRally("Subaru");
        v.avanzar();
        tractor.avanzar();
        //casting explicito podemos invocar a metodos hijos
        assertEquals(((CocheRally)subaru).getMarca(), "Subaru");
        Vehiculo [] misVehiculos = new Vehiculo[]{
            v,
            tractor,
            new Coche("Electrico"),
            subaru
        };
        for(Vehiculo vehiculo: misVehiculos){
            System.out.println(vehiculo.getTipo());
           // vehiculo.avanzar();
            vehiculo.mostrarEstado();
        }
        
    }
}
