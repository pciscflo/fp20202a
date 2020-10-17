package com.upc.semana2;

public class App7 {
    public static void main(String[] args) {
        double altura, largo, ancho, costoMetroCubico;
        double volumen, costoTotal;
        costoMetroCubico =2;
        altura =10;
        largo =20;
        ancho=5;
        volumen = altura*largo*ancho;
        costoTotal = volumen*costoMetroCubico;
        System.out.println("Costo total:" + costoTotal);
    }
}
