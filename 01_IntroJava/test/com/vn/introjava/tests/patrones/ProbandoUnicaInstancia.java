/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.patrones;

import com.vn.introjava.patrones.CocheEspecialUnico;
import com.vn.introjava.patrones.TractorSingleton;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbandoUnicaInstancia {
    
    @Test
    public void intentarUnicaInsTrisTras() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //miUnicoCoche.setMarca("UNICO COCHE 3");
        miUnicoCoche.mostrarEstado();
        TractorSingleton miUnicoTractor= TractorSingleton.getInstancia();
        miUnicoTractor.setMarca("Barreiros");
        System.out.println(miUnicoTractor.toString());
    }  
    @Test
    public void intentarUnicaIns() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //miUnicoCoche.setMarca("UNICO COCHE 1");
        miUnicoCoche.mostrarEstado();
        TractorSingleton miUnicoTractor= TractorSingleton.getInstancia();
        miUnicoTractor.setMarca("Barreiros");
        System.out.println(miUnicoTractor.toString());
    }

    @Test
    public void intentarUnicaInsBis() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("UNICO COCHE 2");
        miUnicoCoche.mostrarEstado();
        TractorSingleton miUnicoTractor= TractorSingleton.getInstancia();
        miUnicoTractor.setMarca("Barreiros");
        System.out.println(miUnicoTractor.toString());
    }

    @Test
    public void intentarUnicaInsTris() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //miUnicoCoche.setMarca("UNICO COCHE 3");
        miUnicoCoche.mostrarEstado();
        TractorSingleton miUnicoTractor= TractorSingleton.getInstancia();
        miUnicoTractor.setMarca("Barreiros");
        System.out.println(miUnicoTractor.toString());
    }    

}
