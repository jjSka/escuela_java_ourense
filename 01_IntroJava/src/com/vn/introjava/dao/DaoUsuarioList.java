/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class DaoUsuarioList implements IDaoUsuario{

    private List<Usuario> listaUsuarios;

    public DaoUsuarioList() {
        listaUsuarios = new ArrayList<>();
    }
@Override
    public void crear(Usuario nuevoUsuario) throws Exception {
        listaUsuarios.add(nuevoUsuario);
    }

    public void crear(String nombre,int edad) throws Exception {
        listaUsuarios.add(new Usuario(nombre,edad));
    }    

    public Usuario obtenerPorIndex(int index) {
        return listaUsuarios.get(index);
    }

    public Usuario obtenerPorNombre(String nombre) {
        for (Usuario user : listaUsuarios) {
            if (user.getNombre().equals(nombre)) {
                return user;       
            }
        }
        return null;
    }
    
    public Usuario obtenerPorEdad(int edad) {
        for (Usuario user : listaUsuarios) {
            if (user.getEdad()==edad) {
                return user;       
            }
        }
        return null;
    }

    @Override
    public void modificar(int index, Usuario objetoDatosNuevos){
        listaUsuarios.get(index).setNombre(objetoDatosNuevos.getNombre());
        listaUsuarios.get(index).setEdad(objetoDatosNuevos.getEdad());
    } 
    

    @Override
    public void borrar(int index){
        listaUsuarios.remove(index);        
    }


}
