package com.upc.ejercicios;

public class App4 {
    //Globales de acceso directo
    static double[] notas = {19.5, 10.5, 20};
    static String[] nombres = {"Luis", "Juan", "Susan"};

    public static void main(String[] args) {
        System.out.println("Suma:" + sumatoria());
        System.out.println("Aprobados:" + obtenerAprobados());
        System.out.println("Nombre del ganador:" + obtenerNombreMayorNota());
    }
    static String obtenerNombreMayorNota(){
        double maximo=0;
        String nom="";
        for(int i=0; i< notas.length; i++){
            if (notas[i]>maximo){
                maximo = notas[i];
                nom = nombres[i];
            }
        }
        return nom;
    }
    static double sumatoria(){
        double suma = 0;
        for(int i=0; i<notas.length;i++){
            suma+=notas[i];
        }
        return suma;
    }

    static int obtenerAprobados(){
        int contadorAprobados = 0;
        for(int i=0; i<notas.length;i++){
            if(notas[i]>=13){
                contadorAprobados++;
            }
        }
        return contadorAprobados;
    }

}
