package com.upc.semana2;

public class App2 {
    public static void main(String[] args) {
        double radio; //es variable que recibirá el dato de entrada 10.0.....
        double area; // variable que almacena el dato de salida o resultado
        radio = 4;
        final double PI = 3.1416;
        area = PI*Math.pow(radio,2);
        System.out.println("Area:" + area);
        //imprimiendo con formato
        System.out.printf("Area:%.2f", area);
    }
}
