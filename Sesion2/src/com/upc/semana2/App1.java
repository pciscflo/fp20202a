package com.upc.semana2;

public class App1 {
    public static void main(String[] args) {
        double numero1=3, numero2=5;
        double suma, resta, multiplicacion, division, potencia;
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        potencia = Math.pow(numero1, numero2);
        System.out.println("Suma:" + suma);
        System.out.println("Resta:" + resta);
        System.out.println("Multiplicación:" + multiplicacion);
        System.out.println("División:" + division);
    }
}
