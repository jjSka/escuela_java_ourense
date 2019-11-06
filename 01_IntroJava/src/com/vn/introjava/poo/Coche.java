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
public class Coche extends Object {
    
    private int numRuedas = 4;
    private String marca;
    
    
    public String getMarca(){
        return this.marca;
        
    }
    public void setMarca(String marca){
        //cuando existe una variable local con el mismo nombre
        //obliga a usar this para acceder a la variable miembro
        this.marca= marca;
    }
    
}
