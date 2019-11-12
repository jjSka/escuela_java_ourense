/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sistdesplaz;

import com.vn.introjava.interfaces.Desplazable;
import com.vn.introjava.interfaces.Electrico;
import com.vn.introjava.poo.Coche;

/**
 *
 * @author PC
 */
public class CocheElectrico extends Coche implements Electrico{
    
    
    @Override
    public void cargarBateria(double voltios){
        ;
    }
    
    @Override
    public void mover(float metros){
        
    }
    
}
