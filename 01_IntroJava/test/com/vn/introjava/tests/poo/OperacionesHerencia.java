/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.CocheRally;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class OperacionesHerencia {

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
        
        supra.mostrarEstado();
        
        
    }
}
