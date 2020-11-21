package com.upc.cadenas;

public class App1 {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Juan", "Maria"};//Arreglo de cadenas
        for (int i=0; i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
        System.out.println("----------");
        //accesando a Carlos
        System.out.println(nombres[0]);
        System.out.println(nombres[0].substring(0,1));
        //mostrar la letra u de Juan
        System.out.println(nombres[1].substring(1,2));//posicion inicial + cantidad de caracteres a extraer

    }
}
