/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class DaoCocheList implements IDaoCoche{

    private List<Coche> listaCoches;

    public DaoCocheList() {
        listaCoches = new ArrayList<>();
    }

    public void crear(String marca) throws Exception {
        listaCoches.add(FabricaCoches.crear(marca));
    }
    public void crear(Coche c) throws Exception {
        listaCoches.add(c);
    }
    public Coche obtenerPorIndex(int index) {
        return listaCoches.get(index);
    }

    @Override
    public Coche obtenerPorMarca(String marca) {
        for (Coche coche : listaCoches) {
            if (coche.getMarca().equals(marca)) {
                return coche;       
            }
        }
        return null;
    }
        @Override
    public void modificar(int index, Coche objetoDatosNuevos)throws Exception{
        listaCoches.get(index).setMarca(objetoDatosNuevos.getMarca());
        listaCoches.get(index).setTipo(objetoDatosNuevos.getTipo());
        listaCoches.get(index).arrancar(objetoDatosNuevos.isArrancado() ? 4 : 1);
        
    } 
    
   @Override
    public void borrar(int index){
        listaCoches.remove(index);        
    }
    
   @Override
    public void borrar(Coche c){
        listaCoches.remove(c);        
    }    
}
