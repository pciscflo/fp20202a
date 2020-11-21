package com.upc.cadenas;

public class App3 {
    static String [] codigos = {"MO00100614520170013", "SI12011519220140012", "SM05122514520162573",
            "VI01061917120127351", "SM02053210220180312", "MO08041908820169815" };

    public static void main(String[] args) {

        System.out.println("Cantidad de Figuras tipos Jugadores:" + cantidadFigurasJugadores("20127351"));
        System.out.println("Cantidad de Albums de una sede dada:"+ obtenerCantidadAlbums("MO"));
        System.out.println("Albums con menos de 250 figuras:"+obtenerCantidadAlbumsMenosde250Figuras());
        System.out.println(".................Jugando con la data....................");
        obtener();

    }

    static void obtener(){
        for(int i=0; i<codigos.length;i++){
            System.out.println(codigos[i]);
            System.out.println(codigos[i].substring(0,2));
            System.out.println(codigos[i].substring(8,11));
        }
    }
    static int cantidadFigurasJugadores(String codigoAlumno){

        int dato=0 ;
        for (int i=0; i<codigos.length; i++){
            if (codigos[i].substring(11,19).equals(codigoAlumno)){
                dato = Integer.parseInt(codigos[i].substring(8,11));
                break;
            }
        }
        return dato;
    }

    static int obtenerCantidadAlbums(String sede){
        int contador=0;
        for(int i=0; i<codigos.length;i++){
            if (codigos[i].substring(0,2).equals(sede)){
                contador++;
            }
        }
        return contador;
    }

    static int obtenerCantidadAlbumsMenosde250Figuras(){
        int cantidadFiguras=0, cantidadAlbums=0;
        for(int i=0; i< codigos.length;i++){
           //calcular cuantas figuras tiene
            cantidadFiguras = Integer.parseInt(codigos[i].substring(2,4)) +
                    Integer.parseInt(codigos[i].substring(4,6))+
                    Integer.parseInt(codigos[i].substring(6,8))+
                    Integer.parseInt(codigos[i].substring(8,11));
            if(cantidadFiguras<250){
                cantidadAlbums++;
            }
        }
        return cantidadAlbums;
    }
}
