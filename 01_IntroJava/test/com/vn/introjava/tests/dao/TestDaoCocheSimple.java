/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.dao;

import com.vn.introjava.dao.DaoCocheList;
import com.vn.introjava.dao.DaoCocheMap;
import com.vn.introjava.dao.IDaoCoche;
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
    }
    @Test
    public void testDaoCocheMap() throws Exception{
        testInterfaceDaoCoche(new DaoCocheMap());
    }
}
