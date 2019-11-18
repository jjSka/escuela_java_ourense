/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.liboperaarrays;

/**
 *
 * @author PC
 */
public class OperarArrays {
    
    @FunctionalInterface
    public interface FunCallBackOperarArrays{
        Object operar(Object x,Object y);
    }

    public static Object[] operarArrays(Object[] x, Object[] y, FunCallBackOperarArrays operaCallBack) {
        Object[] arrayResult = null;
        if (x.length == y.length) {
            arrayResult = new Object[x.length];
            for (int i = 0; i < x.length; i++) {
                arrayResult[i]= operaCallBack.operar(x[i],y[i]);
            }
        }
        return arrayResult;
    }
    
}
