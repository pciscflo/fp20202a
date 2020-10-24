package com.upc.datos;

public class App6 {

    public static String obtenerNivel(int examenEscrito, int examenOral){
        String resultado =null;
        if(examenEscrito>95 && examenOral>75){
            resultado = "Nivel3";
        }else if (examenEscrito>75 && examenOral<=75){
            resultado = "Nivel2";
        }else if (examenEscrito<=95){
            resultado = "Nivel1";
        }
        return resultado;
    }

    public static double obtenerPago(String nivel){
        double monto=0;
        if(nivel.equals("Nivel1")){
            monto = 150;
        } else if (nivel.equals("Nivel2")){
            monto = 250;
        } else if (nivel.equals("Nivel3")){
            monto = 400;
        }
        return monto;
    }

    public static double obtenerPago(int examenEscrito, int exameOral){ //sobrecarga de métodos
        String nivel=null; //null a las variables tipo String y cero a los numéricos double o int
        double total;
        nivel = obtenerNivel(examenEscrito, exameOral);
        total = obtenerPago(nivel);
        return total;
    }
    public static void main(String[] args) {
        System.out.println(obtenerNivel(98,80));
        System.out.println(obtenerPago("Nivel1"));
        System.out.println(obtenerPago(100,75));
    }
}
