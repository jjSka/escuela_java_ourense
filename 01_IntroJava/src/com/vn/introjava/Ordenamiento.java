/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;

/**
 *
 * @author PC
 */
public class Ordenamiento {

    public static void ordenarArray() {
        //declarar array enteros
        //programar todo lo que haga falta para ordenarlo
        int arrayOriginal[] = {3, 5, 3, 8, 1, 4};
        int arrayOrdenado[] = {0, 0, 0, 0, 0, 0};
        int maximoTemp = arrayOriginal[0];
        for (int j = 0; j < arrayOrdenado.length; j++) {
            for (int i = 0; i < arrayOriginal.length; i++) {
                if (arrayOriginal[i] > maximoTemp) {
                    maximoTemp = arrayOriginal[i];
                }
            }
            for (int i = 0; i < arrayOriginal.length; i++) {
                if (maximoTemp == arrayOriginal[i]) {
                    arrayOriginal[i] = Integer.MIN_VALUE;
                    break;
                }
            }
            arrayOrdenado[j] = maximoTemp;
            maximoTemp = 0;
            System.out.println(arrayOrdenado[j]);
        }
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println(arrayOriginal[i]);
        }
    }

    public static int[] ordenarArrayBurbuja(int[] array) {
        int[] arrOrd = new int[array.length];
        int inicio = 0;
        int menor, posMenor;
        do {
            menor = array[inicio];
            posMenor = inicio;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < menor) {
                    menor = array[i];
                    posMenor = i;
                }
            }
            array[posMenor] = Integer.MAX_VALUE;
            arrOrd[inicio] = menor;

            System.out.println("Menor: " + menor);
            inicio++;
        } while (inicio < array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(arrOrd[i] + " ");

        }

        //System.out.println("Menor: " + menor);
        return arrOrd;
    }

    public static int[] ordenarPorSeleccion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index  
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);    
        }
        return arr;
    }
    
    int metodoPolimorfico(int a , int b){
        return a;
    }
    float metodoPolimorfico(float a, float b){
        return a;
    }

}
