/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.dao;

import com.vn.introjava.dao.DaoUsuarioList;
import com.vn.introjava.dao.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TestDaoUsuarioSimple {
    

    @Test
    public void probandoDaoUsuario() throws Exception{
        DaoUsuarioList dul= new DaoUsuarioList();
        dul.crear("jose", 28);
        dul.crear("alo",22);
        dul.crear("alba", 31);
        dul.crear(new Usuario("maria",32));
        System.out.println(dul.obtenerPorIndex(2).toString());
        System.out.println(dul.obtenerPorIndex(3).toString());
        assertEquals(dul.obtenerPorEdad(22).getEdad(),22);
        assertEquals(dul.obtenerPorNombre("alba").getNombre(), "alba");
        assertEquals(dul.obtenerPorNombre("maria").getNombre(), "maria");
        
    
    
    }
}
