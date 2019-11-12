/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.interfaces.Desplazable;
import com.vn.introjava.interfaces.Electrico;
import com.vn.introjava.poo.*;
import com.vn.sistdesplaz.Avion;
import com.vn.sistdesplaz.BicicletaElectrica;
import com.vn.sistdesplaz.Monopatin;
import com.vn.sistdesplaz.MonopatinElectrico;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbarInterfaces {
    

    @Test
    public void creandoDesplazables() {
        Avion miAvionDeLosLunes = new Avion();
        miAvionDeLosLunes.mover(50.1f);
        
        Desplazable dl = new Avion();
        dl.mover(0);
        Avion avionD1 = (Avion) dl;
        //avionD1.volar(20f);
        
        Monopatin miMonopatinDeLosMartes = new Monopatin();
        //miMonopatinDeLosMartes.mover();
    }
    
    @Test
    public void moviendoVehiculosDesplazables(){
        CocheRally cocheRally = new CocheRally("COCHE RALLY PROPIO 3D");
        Coche cocheR= cocheRally;
        Vehiculo vehiculoR= cocheRally;
        cocheR.arrancar();
        vehiculoR.mostrarEstado();
        
    }
    
    @Test
    void arrayInterfaces(){
        Electrico[] cosasElectricas = new Electrico[]{
            new MonopatinElectrico(),
            new BicicletaElectrica()};
        cosasElectricas[0].cargarBateria(10f);
        cosasElectricas[1].cargarBateria(20f);
        if(cosasElectricas.length!=5){
            fail("no tiene 2 elementos");
        }
    }
}
