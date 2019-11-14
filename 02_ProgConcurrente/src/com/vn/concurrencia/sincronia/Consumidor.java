package com.vn.concurrencia.sincronia;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread {

    private Contenedor contenedor;

    public Consumidor(Contenedor c) {
        contenedor = c;
    }

    public void run() {
        for (int i = 10; i >= 1; i--) {
            int value = 0;
            value = contenedor.get();
            System.out.println("Consumidor. GET: " + value);
            try {
                Thread.sleep((3000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
