package com.upc.semana2;

public class App5 {
    public static void main(String[] args) {
        //Distribuir una cantidad en soles a billetes de 100, 50, 20 y 10
            int cantidad = 1230, billetes100, resto, billetes50, billetes20, billetes10;
            billetes100 = cantidad / 100;
            resto = cantidad % 100;
            billetes50 = resto / 50;
            resto = resto % 50;
            billetes20 = resto / 20;
            resto = resto % 20;
            billetes10 = resto / 10;
            System.out.println("Billetes de 100:" + billetes100);
            System.out.println("Billetes de 50:" + billetes50);
            System.out.println("Billetes de 20:" + billetes20);
            System.out.println("Billetes de 10:" + billetes10);

        }
}
