/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

/**
 *
 * @author PC
 */
public class HilosSencillos {

    static int contCompartido = 0;
    HiloA hiloA;
    HiloB hiloB;

    public HilosSencillos(){
        this.hiloA = new HiloA();
        this.hiloB = new HiloB();
    }
    class HiloA implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                contCompartido++;
                System.out.println("Instruccion A:     " + i + " - contador = " + contCompartido);
            }
        }
    }

    class HiloB implements Runnable {

        @Override
        public void run() {
            for (int j = 0; j < 8; j++) {
                contCompartido++;
                System.out.println("Ins B:   " + j + " - contador = " + contCompartido);
            }
        }
    }

    public void ejecutarHilosStartAB() {//paralelo
        System.out.println("Esto es  start");
        Thread t = new Thread(hiloA);
        Thread t2 = new Thread(hiloB);
        //t.run();
        t.start();
        t2.start();
        while(t.isAlive() || t2.isAlive());
        System.out.println("Esto es fin de start");
    }
    public void ejecutarHilosRunAB(){//en serie
        System.out.println("Esto es  run");
        Thread t = new Thread(hiloA);
        Thread t2 = new Thread(hiloB);
        //t.run();
        t.run();
        t2.run();     
        System.out.println("Esto es fin de run");  
    }
}
