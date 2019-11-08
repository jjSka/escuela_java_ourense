/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;


/**
 *
 * @author PC
 */
public class Tractor extends Vehiculo{
    
    public Tractor(){
        
        tipo= TipoVehiculo.TRACTOR;
    }
    
    @Override
    public void avanzar(){
        //System.out.println("Not supported yet in class "+Tractor.class);
    }

    @Override
    public void mover(float metros){
        System.out.println("El monopatin se mueve");
    }
    
    
    @Override
    public String toString(){
        return "Tractor: "+getTipo();
    }
    
}
