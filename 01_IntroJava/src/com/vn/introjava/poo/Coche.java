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
public class Coche extends Vehiculo {

    private int numRuedas = 4;
    private String marca;
    protected boolean arrancado;

    //En el momento que creamos un constructor, el de por defecto
    //Deja de ser implementado por Java
    public Coche() {
        numRuedas = 4;
        marca = "SIN MARCA";
        tipo= TipoVehiculo.TURISMO;
    }

    public Coche(String marca) {
        numRuedas = 4;
        this.marca = marca;
        this.arrancado = false;
        tipo= TipoVehiculo.TURISMO;
    }

    public void arrancar() {
        System.out.println(this.marca + " ha arrancado.");
        arrancado = true;
    }

    // Sobrecarga de método arrancar()

    /**arrancar con posicion llave valida. si no falla.
     * 
     * @param posicionLlave uno a 4
     */
    public void arrancar(int posicionLlave) {
        if (posicionLlave < 1 || posicionLlave > 4) {
            throw new IllegalArgumentException("se pasa de rango");
        }
        arrancado = posicionLlave == 4;// ? true: false;
        //if(posicionLlave==4) arrancado = true; else arrancado= false; (tb vale)
        System.out.println(this.marca + (arrancado ? " ha arrancado." : "fallo al arrancar"));

    }

    public boolean arrancar(String orden) {
        arrancado = "arrancar".equals(orden);
        return arrancado;
    }

    /**
     * Simplemente muestra la marca y si está arrancado
     */
    public void mostrarEstado() {
        System.out.println(tipo+" -  " + getMarca() + ", " + (arrancado ? " ha arrancado." : "fallo al arrancar"));
    }
    //utilizar getter cuando puede llevar logica extra en vez del atributo.

    //CLEAN CODE: funciones no deben tener mas de 20 lineas de codigo.
    public String getMarca() {
        return this.marca;

    }

    public void setMarca(String marca) throws Exception {
        if (marca != null || "".equals(marca)) //cuando existe una variable local con el mismo nombre
        //obliga a usar this para acceder a la variable miembro
        {
            this.marca = marca;
        } else {
            throw new IllegalArgumentException("debes asignar una marca.");
        }
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void avanzar(){
        //System.out.println("Not supported yet in class "+Coche.class);
    }
        
    @Override
    public void mover(float metros){
        System.out.println("El monopatin se mueve");
    }
    
    @Override
    public String toString(){
        return super.toString()+tipo+" -  " + getMarca() + ", " + (arrancado ? " ha arrancado." : "fallo al arrancar");
    }
}
