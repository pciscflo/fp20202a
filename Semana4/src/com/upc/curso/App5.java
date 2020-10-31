package com.upc.curso;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(String cadena=""; !cadena.equals("fin"); ){//mientras la cadena sea diferente de fin repite
            System.out.println("Ingresa cadena:");
            cadena = sc.nextLine();//para leer una cadena del teclado (string:texto)
        }
        System.out.println("Continua program....");
        System.out.println("");
        String nombre="";
        while (!nombre.equals("fin")){
            System.out.println("Nombre:");
            nombre = sc.nextLine();//para leer una cadena del teclado (string:texto)
        }
    }
}
