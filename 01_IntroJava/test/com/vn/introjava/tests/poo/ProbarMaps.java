/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.CocheRally;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbarMaps {
    

    @Test
    public void probarMap() {
        HashMap<Integer,CocheRally> miMapaCoches = new HashMap<Integer,CocheRally>();
        miMapaCoches.put(new Integer(3),new CocheRally("Subaru Impreza"));
        miMapaCoches.put(new Integer(4),new CocheRally("Toyota"));
        miMapaCoches.put(new Integer(5),new CocheRally("Seat Panda"));
        
        for (Object rally : miMapaCoches.values()) {
            System.out.println(rally.toString());
        }
    }
}

