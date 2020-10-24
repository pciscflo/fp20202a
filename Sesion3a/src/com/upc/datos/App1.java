package com.upc.datos;

public class App1 {

    public static String obtenerMensaje(int edad){ //1
        if(edad>=18){
            return "Es mayor de edad";
        }else{
            return "Es menor de edad";
        }
    }
    public static String obteneMensaje2(int edad){ //2
        String cadena;
        if(edad>=18){
            cadena = "Es mayor de edad";
        }else{
            cadena = "Es menor de edad";
        }
        return  cadena;
    }

    public static void main(String[] args) {
        System.out.println(obtenerMensaje(20));
        String r;
        r = obteneMensaje2(20);
        System.out.println(r);
    }
}
