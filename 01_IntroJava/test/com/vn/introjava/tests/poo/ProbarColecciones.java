/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.*;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbarColecciones {

    @Test
    public void testArrayListNoGenerica() {
        ArrayList lista = new ArrayList();
        // con el arrayList podemos mezclar todo. puede llevar a problemas debido a su flexibilidad.
        // no usar nunca
        lista.add(new Object());
        lista.add(new Coche("Coche"));
        lista.add("texto");
        lista.add(5);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("elemento [" + i + "] = " + lista.get(i).toString());
        }
    }

    @Test
    public void testArrayListGenericoOK() {
        ArrayList<CocheRally> misCochesRally = new ArrayList<CocheRally>();
        misCochesRally.add(new CocheRally("Subaru Impreza"));
        misCochesRally.add(new CocheRally("Toyota"));
        misCochesRally.add(new CocheRally("Hammer"));
        misCochesRally.get(2).arrancar();
        
        for (CocheRally cocheRally : misCochesRally) {
            cocheRally.arrancar();
        }
    }
}
