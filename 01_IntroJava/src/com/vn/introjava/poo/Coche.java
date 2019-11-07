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
    private boolean arrancado;

    //En el momento que creamos un constructor, el de por defecto
    //Deja de ser implementado por Java
    public Coche() {
        numRuedas = 4;
        marca = "SIN MARCA";
    }

    public Coche(String marca) {
        numRuedas = 4;
        this.marca = marca;
        this.arrancado = false;
    }

    public void arrancar() {
        System.out.println(this.marca + " ha arrancado.");
        arrancado = true;
    }

    // Sobrecarga de método arrancar()
     /** Si la posicion de la llave es 4, arranca. si no, no arranca.
     * 
     * @param posicionLlave
     * @return si se ha arrancado devuelve true
     */
    public void arrancar(int posicionLlave) {
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
        System.out.println("Coche" + getMarca() + ", " + (arrancado ? " ha arrancado." : "fallo al arrancar"));
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

}
