package com.upc.semana2;

public class App3 {
    public static void main(String[] args) {
        // 23 soles --->  cantidad: 5 soles ??   2 soles ??/ 1 sol??
        int monto = 23, monedas5, resto,monedas2, monedas1;
        monedas5 = monto / 5;
        resto = monto % 5; //calcular el residuo de dividir monto entre 5
        monedas2 = resto /2;
        monedas1 = resto % 2;
        System.out.println("Monedas de 5: " + monedas5);
        System.out.println("Monedas de 2: " + monedas2);
        System.out.println("Monedas de 1: " + monedas1);
    }
}
