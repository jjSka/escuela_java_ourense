/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbarClaseInterfazGenericaYAnidadas {

    public static class ClasePeque <T>{ //static para usarlo en cualquier parte

        T x, y;

        public ClasePeque(T x, T y) {
            this.x = x;
            this.y = y;
        }
            @Override
        public String toString() {
            return "(x= " +x.toString() +", y = " + y.toString() + ")";
        }
    }

    @Test
    public void probarClaseAnidada() {
        ClasePeque unPunto2D = new ClasePeque(3f,5f);
        System.out.println("Punto 2D: " + unPunto2D.toString());
    }
    @Test
    public void stprobarClaseAnidada() {
        ClasePeque unPunto2D = new ClasePeque(3f,5f);
        System.out.println("Punto 2D: " + unPunto2D.toString());
    }

}
