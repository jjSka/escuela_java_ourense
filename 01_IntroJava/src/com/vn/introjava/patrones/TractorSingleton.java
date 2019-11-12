/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.patrones;

import com.vn.introjava.poo.Tractor;

/**
 *
 * @author PC
 */
public class TractorSingleton extends Tractor{
    
    private static TractorSingleton tractorUnico;
    String marca;
    
    private TractorSingleton(){
        super();
    }
    
    public static TractorSingleton getInstancia(){
        if(tractorUnico==null){
            tractorUnico=new TractorSingleton();
            tractorUnico.avanzar();
        }
        return tractorUnico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString(){
        return "Tractor: "+getTipo()+" Marca: "+getMarca();
    }
    
}
