package com.upc.curso;

public class App8 {
    public static void main(String[] args) {
        int contador=0;
        while(contador<=5){ //  mientras que esta condicion es verdadera repite el bloque y regresa a evaluar la condición
            System.out.println(contador);//0, 1,2,..,5
            contador++;//1,2,3...5, 6
        }
        contador=0;
        System.out.println("******************");
        while(contador<=5){
            contador++;
            System.out.println(contador);//1,2,3,..5,6
        }
        System.out.println("***************");
        contador=0;
        while(true){
            System.out.println(contador);//0, 1,....4
            contador++;//1,2, ... 5
            if (contador==5){
                break; //sale del While
            }
        }
    }
}
