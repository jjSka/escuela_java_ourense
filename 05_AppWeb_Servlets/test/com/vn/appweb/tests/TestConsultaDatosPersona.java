/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.tests;

import com.vn.appweb.modelo.ConsultaSQL;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TestConsultaDatosPersona {

    @Test
    public void testSelectSQL() {
        ConsultaSQL conSQL = new ConsultaSQL();
        assertEquals("Jotafumeiro",conSQL.leerTabla("Jotafumeiro").get(0).getNombre());
        assertEquals(0,conSQL.leerTabla("Jllpotafumeiro").size());


    }
}
