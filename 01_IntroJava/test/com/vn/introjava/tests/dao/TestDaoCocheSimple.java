/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.dao;

import com.vn.introjava.dao.DaoCocheList;
import com.vn.introjava.dao.DaoCocheMap;
import com.vn.introjava.dao.IDaoCoche;
import com.vn.introjava.poo.Coche;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TestDaoCocheSimple {
    

    @Test
    public void PruebaDaoCoche() throws Exception {
        DaoCocheList dcl= new DaoCocheList();
        dcl.crear("Seat");
        dcl.crear("Mazda");
        dcl.crear("Fiat");
        dcl.obtenerPorIndex(1);
        assertEquals(dcl.obtenerPorIndex(1).getMarca(),"Mazda");
        assertEquals(dcl.obtenerPorMarca("Fiat").getMarca(), "Fiat");
        dcl.obtenerPorMarca("Mazda");
        dcl.obtenerPorMarca("Ferrari");
        DaoCocheMap dcm= new DaoCocheMap();
        dcm.crear("Volkwswagen");
        dcm.crear("BMW");
        dcm.crear("Seat");
        dcm.obtenerPorKey("Mazda");
        dcm.obtenerPorMarca("Volkwswagen");
        assertEquals(dcm.obtenerPorMarca("BMW").getMarca(), "BMW");
        assertEquals(dcm.obtenerPorIndex(2).getMarca(), "Seat");
        
        
    }
    
    void testInterfaceDaoCoche(IDaoCoche daoCoche)throws Exception{
        DaoCocheList dcl= new DaoCocheList();
        dcl.crear("Seat");
        dcl.crear("Mazda");
        dcl.crear("Fiat");
        dcl.obtenerPorIndex(1);
        assertEquals(dcl.obtenerPorIndex(1).getMarca(),"Mazda");
        assertEquals(dcl.obtenerPorMarca("Fiat").getMarca(), "Fiat");
        dcl.obtenerPorMarca("Mazda");
        dcl.obtenerPorMarca("Ferrari");
        DaoCocheMap dcm= new DaoCocheMap();
        dcm.crear("Volkwswagen");
        dcm.crear("BMW");
        dcm.crear("Seat");
        dcm.obtenerPorKey("Mazda");
        dcm.obtenerPorMarca("Volkwswagen");
        assertEquals(dcm.obtenerPorMarca("BMW").getMarca(), "BMW");
        assertEquals(dcm.obtenerPorIndex(2).getMarca(), "Seat");
        
        Coche modificar= new Coche("Ahora Citroen");
        daoCoche.modificar(1, modificar);
        System.out.println(modificar.getMarca());
        
        modificar.arrancar();
        daoCoche.modificar(2,modificar);
        assertEquals(modificar.isArrancado(),modificar.isArrancado());
        
        daoCoche.borrar(1);
        daoCoche.borrar(daoCoche.obtenerPorMarca("Coche A"));
        if(daoCoche instanceof DaoCocheList)
            assertEquals("Coche C",daoCoche.obtenerPorIndex(0));
        
    }
    @Test
    public void testDaoCocheMap() throws Exception{
        testInterfaceDaoCoche(new DaoCocheMap());
    }
}
