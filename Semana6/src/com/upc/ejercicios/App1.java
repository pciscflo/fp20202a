package com.upc.ejercicios;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0, contadorMayores=0, contadorTotal=0;
        double porcentajeMayores;
        String nombre = "";
        String opcion="";
        //captura de datos
        while(!nombre.equals("Ana")){
            System.out.print("\nIngrese su nombre:");
            nombre = sc.nextLine();
            System.out.print("Ingrese su edad:");
            edad = sc.nextInt();
            sc.nextLine();
            contadorTotal++;
            //hacer estadisticas, contar, sumar....
            if(edad>=18){
                contadorMayores++;
            }
            //
        }
        System.out.println("Mayores son:" + contadorMayores);
        porcentajeMayores = (double) contadorMayores/contadorTotal;
        System.out.println("Porcentaje de Mayores de Edad:" + porcentajeMayores*100);
    }
}
