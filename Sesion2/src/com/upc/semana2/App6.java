package com.upc.semana2;

public class App6 {
    public static void main(String[] args) {
        //Distribuir una cantidad en soles a billetes de 100,50,20 y 10
        int cantidad = 1200, billetes100, resto1, billetes50, resto2, billetes20 , billetes10, resto;
        int monedasSobrantes;
        billetes100 = cantidad/100;
        resto = cantidad%100 ; //calcular el residuo al dividir;
        billetes50 = resto/50;
        resto1 = resto % 50;
        billetes20= resto1/20;
        resto2 = resto1%20;
        billetes10 = resto2/10;
        monedasSobrantes = resto2 % 10;
        System.out.println("Billetes de 100: "+billetes100);
        System.out.println("Billetes de 50: "+billetes50);
        System.out.println("Billetes de 20: " +billetes20);
        System.out.println("Billetes de 10: " +billetes10);
        System.out.println("Monedas sobrantes:" + monedasSobrantes);
    }

}
