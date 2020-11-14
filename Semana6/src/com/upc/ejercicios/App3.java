package com.upc.ejercicios;

public class App3 {
    public static void main(String[] args) {
        double[] notas = {19.5, 10.5, 20};
        String[] nombres = {"Luis", "Juan", "Susan"};
        System.out.println("Suma:" + sumatoria(notas));
        System.out.println("Aprobados:" + obtenerAprobados(notas));
        System.out.println("Nombre del ganador:" + obtenerNombreMayorNota(notas, nombres));
    }
    static String obtenerNombreMayorNota(double[] notas, String[] nombres){
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
    static double sumatoria(double[] notas){
        double suma = 0;
        for(int i=0; i<notas.length;i++){
            suma+=notas[i];
        }
        return suma;
    }

    static int obtenerAprobados(double[] notas){
        int contadorAprobados = 0;
        for(int i=0; i<notas.length;i++){
            if(notas[i]>=13){
                contadorAprobados++;
            }
        }
        return contadorAprobados;
    }
}
