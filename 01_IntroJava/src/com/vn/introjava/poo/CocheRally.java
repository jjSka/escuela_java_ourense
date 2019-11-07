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
     * constructor sin params
     */
    public CocheRally() {
        super();
        rozamiento= 5f;
        tipo= TipoVehiculo.RALLY;
    }
    
    /**
     * constru con param marca
     * @param marca 
     */
    public CocheRally(String marca) {
        super(marca);
        tipo= TipoVehiculo.RALLY;
    }

    
    /**
     * constru con rozamiento y marca
     * @param rozamiento
     * @param marca 
     */
    public CocheRally(float rozamiento, String marca) {
        super(marca);
        this.rozamiento = rozamiento;
        tipo= TipoVehiculo.RALLY;
    }

    
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
        } else if ("arrancar".equalsIgnoreCase(orden)) {
            return true;
        } else {
            return "encender".equals(orden.toLowerCase());
        }
    }

    //Ejercicio: sobreescribir el metodo mostrarEstado para que tambien muestre el rozamiento
    
    public void mostrarEstadoAntiguo() {
        super.mostrarEstado();
        System.out.println("  Rozamiento: " + getRozamiento());
    }
    
    @Override
    public void mostrarEstado() {
       
        System.out.println(this.toString());

    }
    
    @Override
    public String toString(){
        return tipo+" -  "+ getMarca() + " , " + getRozamiento() 
                + " ," + (isArrancado() ? " arrancado." : " apagado.");
    }

}
