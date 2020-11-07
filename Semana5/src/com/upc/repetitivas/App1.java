package com.upc.repetitivas;

import java.util.Scanner;

public class App1 {
    /*
     Dado un número calcular su factorial, utilizar un subprograma
     */
    static int factorial(int n){ //subprograma, metodo, funcion, módulo
        int f=1; //1x2x3....xn
        for (int i=1; i<=n;i++){ //bucle
             f = f * i; // s*=i  1x2x ...n
        }
        return f;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valor de n:");
        n = sc.nextInt();
        System.out.println("El factorial es:" + factorial(n));
        int m;
        m = factorial(4) + 100;
        System.out.println(m);
    }
}
