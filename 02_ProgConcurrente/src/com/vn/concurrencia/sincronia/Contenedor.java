package com.vn.concurrencia.sincronia;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Contenedor {

    // Normalmente será un array, lista, bb.dd., 
    // mapa, fichero, DAO, servicio web, cualquier recurso compartido...
    int dato;
    // Semáforo
    boolean hayDato = false;

    public synchronized int get() {
        System.out.println("contenedor. al principio del get: ");
        while (!hayDato) {
            System.out.println("Get: Esperando, hayDato = " + hayDato);
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        hayDato = false;
        System.out.println("Contenedor. al final del get(): " + dato);
        this.notifyAll();
        return dato;
    }

    public synchronized void put(int valor) {
        System.out.println("Contenedor.al principio del put(): " + valor);
        dato = valor;
        while (hayDato) {
            System.out.println("get esperando, hay dato= " + hayDato);
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        hayDato = true;
        System.out.println("contenedor. al final del put(): " + valor);
        this.notifyAll();
    }
}
