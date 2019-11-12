/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

/**
 *
 * @author PC
 */
public interface IDaoUsuario extends IGenericDao<Usuario>{
    
   /* @Override
    public abstract void crear(String nombre,int edad)throws Exception;*/
    public abstract Usuario obtenerPorNombre(String nombre);
   /* @Override
    public abstract Usuario obtenerPorIndex(int index);  */  
    public abstract Usuario obtenerPorEdad(int edad);
    
}
