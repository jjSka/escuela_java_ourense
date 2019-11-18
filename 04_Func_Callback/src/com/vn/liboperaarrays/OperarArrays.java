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
        double operar(double x,double y);
    }

    public static double[] operarArrays(double[] x, double[] y, FunCallBackOperarArrays operaCallBack) {
        double[] arrayResult = null;
        if (x.length == y.length) {
            arrayResult = new double[x.length];
            for (int i = 0; i < x.length; i++) {
                arrayResult[i]= operaCallBack.operar(x[i],y[i]);
            }
        }
        return arrayResult;
    }
}
