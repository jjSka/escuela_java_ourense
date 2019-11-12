/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;

/**
 *
 * @author PC
 */
public interface IDaoCoche extends IGenericDao<Coche>{
    
    
    
    public abstract void crear(String marca) throws Exception;
    public abstract void crear(Coche c) throws Exception;

    public abstract Coche obtenerPorIndex(int index);

    public abstract Coche obtenerPorMarca(String marca);
}
