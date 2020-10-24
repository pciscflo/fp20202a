package com.upc.ejercicios;

public class App1 {

    public static int sumadora(int a , int b){ //método o función(antiguamente:estructurada)
        int s;//variable auxiliar válida dentro de sumadora nada más!
        s = a + b;
        return s;
    }
    public static String bienvenida(String nombre){
       return "Hola " + nombre;
    }

    public static double cuadrado(double x){
        return (x*x);
    }

    public static void main(String[] args) { //pantalla Windows Consola
        int a =3, b=3;  //solo valen para main a, b
        int suma =0;
        System.out.println(bienvenida("Pepe"));
        suma = sumadora(a, b);//a + b
        System.out.println(suma);
        int p;
        p = a + 2*b;
        suma = sumadora(p,a); //a + p, a y p le pasan el valor que contienen a sumadora
        System.out.println(suma);
        System.out.println(cuadrado(2));
        System.out.println(cuadrado(3));
    }
}
