/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

/**
 * Clase CocheRally para controlar Herencia
 *
 * @author PC
 */
public class CocheRally extends Coche {

    private float rozamiento;

    /**
     * Get the value of rozamiento
     *
     * @return the value of rozamiento
     */
    public float getRozamiento() {
        return rozamiento;
    }

    /**
     * Set the value of rozamiento
     *
     * @param rozamiento new value of rozamiento
     */
    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }

    @Override
    public boolean arrancar(String orden) {
        if (super.arrancar(orden)) {
            return true;
        }
        else if ("arrancar".equalsIgnoreCase(orden))
            return true;
        else return "encender".equals(orden.toLowerCase());
    }
    
    //Ejercicio: sobreescribir el metodo mostrarEstado para que tambien muestre el rozamiento

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("  Rozamiento: " +getRozamiento());
    }
    public void mostrarEstadoAntiguo(){
        System.out.println("Coche de Rally: "+getMarca()+" , "+getRozamiento()+" , "+isArrancado());
        
    }
    
    

}
