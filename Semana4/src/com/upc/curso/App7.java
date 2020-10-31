package com.upc.curso;

public class App7 {
    public static void main(String[] args) {
        //cuantos múltiplos de 3 hay entre el 1 y el 100
        int contador=0;
        for(int i=1; i<=100;i++){
            if (i%3==0){
                contador++;
            }
        }
        System.out.println("Existen:" + contador+ " numeros multiplos de 3");
    }
}
