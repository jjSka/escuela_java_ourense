/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

import com.vn.interfaces.Desplazable;


/** no puede ser instanciada por falta de sentido
 *
 * @author PC
 */
public abstract class Vehiculo implements Desplazable{  
    
    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
    public abstract void avanzar(); // ya lo implementaran los hijos
    public void mostrarEstado(){
         System.out.println(this.toString());
    }
    
}
