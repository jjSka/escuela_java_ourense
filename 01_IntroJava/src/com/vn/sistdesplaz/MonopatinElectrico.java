/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sistdesplaz;

import com.vn.introjava.interfaces.Desplazable;
import com.vn.introjava.interfaces.Electrico;

/**
 *
 * @author PC
 */
public class MonopatinElectrico extends Monopatin implements Electrico {
    
    
    @Override
    public void cargarBateria(double voltios){
        System.out.println("Cargando bateria del monopatin...");
}
    
    @Override
    public void mover(float metros){
        System.out.println("El monopatin se mueve");
    }
}
