/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class FabricaCoches {
    
    public static Coche crear(String marca)throws Exception{
        Coche c= new Coche();
            c.setMarca(marca);
        return c;
    }
}
