package com.upc.cadenas;

public class App0 {


    public static void main(String[] args) {
        String nombre;
        nombre = "Francisco";//la longitud de la cadena es 9, se cueta desde 1
        //cada caracter está ubicado en una pisición desde cero por ejemplo F está en la posición 0
        //se puede acceder a un caracter de la cadena de la misma manera que se hace con un arreglo
        //nombre[0] sería la "F", nombre[4] sería "c", sin embargo java utiliza la funcion
        //substring(posición inicial, posicion inicial + cantidad de caracteres)
        //Ejemplo:
        //System.out.println(nombre[0]);//da error
        System.out.println(nombre.substring(0, 1));//F
        System.out.println(nombre.substring(0,2));//Fr
        System.out.println(nombre.substring(4,7));//cis
        System.out.println(nombre.substring(7,9));//co, se cuenta la posicion inicial

    }
}
