/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.interfaces;

/**
 *
 * @author PC
 */
public interface Desplazable {
    
    // No se deben usar variables miembro en interfaces
    // int propiedadNoApropiada = 4;
    
    // Únicamente declaración de métodos
    public void mover(float metros);
    
    // void mover(int metros);
    
    // void detener();
}
