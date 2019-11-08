/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.Tractor;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbarGenericos {

    @Test
    public void probarMetodosGenericos() {
        ArrayList<Integer> listIn = new ArrayList<Integer>();
        int tres = 3, cinco = 5;
        insertarIntegerDuplicado(listIn, tres);
        insertarIntegerDuplicado(listIn, cinco);
        insertarDuplicado(listIn, cinco);
        insertarDuplicado(listIn, cinco);
        System.out.println("Tres sigue siendo " + tres);
        for (Integer integer : listIn) {
            System.out.println(" - " + integer);
        }
        // infiere el tipo por su declaración
        ArrayList<String> listStr = new ArrayList<>();
        insertarDuplicado(listStr, "tres");
        insertarDuplicado(listStr, "cinco");
        for (String string : listStr) {
            System.out.println("** " + string);
        }
        ArrayList<Coche> listCoches = new ArrayList<>();
        insertarDuplicado(listCoches, new Coche("Subaru"));
        insertarDuplicado(listCoches, new Coche("Mazda"));
        for (Coche coche : listCoches) {
            coche.mostrarEstado();
        }
        ArrayList<CocheRally> listRally = new ArrayList<>();
        listRally.add(new CocheRally("Subaru Impreza"));
        listRally.add(new CocheRally("Ferrari F50"));

        CocheRally cr = visualizarListaDevolverUltimo(listRally);
        System.out.println(cr.toString());

    }

    static void insertarIntegerDuplicado(ArrayList<Integer> listaInt, int i) {
        listaInt.add(i);
        listaInt.add(i);
        System.out.println(i + " añadido dos veces");
        i += 10;
    }

    static void insertarIntegerDuplicado(ArrayList<String> listaString, String str) {
        listaString.add(str);
        listaString.add(str);
        System.out.println(str + " añadido dos veces");
        str += "10";

    }

    //métodos genéricos
    //entre < y > ponemos el tipo génerico.esto convierte el metodo en generico.
    static <Tipo> void insertarDuplicado(ArrayList<Tipo> listaGenerica, Tipo objeto) {
        listaGenerica.add(objeto);
        listaGenerica.add(objeto);
        System.out.println(objeto + " añadido dos veces");
        if (objeto instanceof Integer) {
            Integer i = (Integer) objeto;
            i += 2;
        }
    }

    static <Tipo> Tipo visualizarListaDevolverUltimo(ArrayList<Tipo> listaGenerica) {
        for (Tipo objeto : listaGenerica) {
            System.out.println(objeto.toString());
        }
        return listaGenerica.get(listaGenerica.size() - 1);
    }

    
    public void testearClaseAnidada(){
        ProbarClaseInterfazGenericaYAnidadas.ClasePeque c;
        c= new ProbarClaseInterfazGenericaYAnidadas.ClasePeque(1f,2f);
    }
}
