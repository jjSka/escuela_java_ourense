/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author PC
 */
public class DaoCocheMap implements IDaoCoche{

    private int ultimoIndex;
    private Map<String, Coche> mapaCoches;
    private Map<Integer, Coche> mapaIntCoches;

    public DaoCocheMap() {
        mapaCoches = new HashMap<String, Coche>();
        mapaIntCoches=new HashMap<Integer,Coche>();
        ultimoIndex=0;
    }

    public void crear(String marca) throws Exception {
        crear(FabricaCoches.crear(marca));
    }
    public void crear(Coche c) throws Exception {
        mapaCoches.put(c.getMarca(), c);
        mapaIntCoches.put(ultimoIndex, mapaCoches.get(c.getMarca()));
        ultimoIndex++;
    }    

    public Coche obtenerPorKey(String key) {
        return mapaCoches.get(key);
    }

    public Coche obtenerPorIndex(int index) {
        return mapaIntCoches.get(index);

    }

    public Coche obtenerPorMarca(String marca) {
        for (Coche coche : mapaCoches.values()) {
            if (coche.getMarca().equals(marca)) {
                return coche;
            }

        }
        return null;
    }
        @Override
    public void modificar(int index, Coche objetoDatosNuevos)throws Exception{
        mapaCoches.get(index).setMarca(objetoDatosNuevos.getMarca());
        mapaCoches.get(index).setTipo(objetoDatosNuevos.getTipo());
        mapaCoches.get(index).arrancar(objetoDatosNuevos.isArrancado() ? 4 : 1);
        
        
    }    
   @Override
    public void borrar(int index){
        //mapaCoches.repl;        
    } 
}
