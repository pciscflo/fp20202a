package com.upc.datos;

public class App5 {

    public static double cubo(double x){
        double resultado;
        resultado = x*x*x;
        return resultado;
    }

    public static String obtenerNumeral(double x){
        String cadena;
        if(x>0) {
            cadena = "Positivo";
        }else if (x<0){
            cadena = "Negativo";
        }else{
            cadena = "Nulo";
        }
        return  cadena;
    }

    public static void main(String[] args) {
        System.out.println(cubo(3));
        double y;
        int a = 2;
        y = 1 + cubo(a);
;       System.out.println(obtenerNumeral(y));
    }
}
