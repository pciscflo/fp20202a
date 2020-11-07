package com.upc.repetitivas;

public class App2 {
    /*
     Ingresar un número entero y calcular cuantos digitos pares tiene.
     Ejm: 452  tiene 2 digitos pares
     */
    static int contarDigitosPares(int n){//43
        int digito, contadorPares=0;
        while(n>0){
            digito = n % 10;//2,3,4
            if (digito % 2 == 0 && digito!=0){
                contadorPares++;
            }
            n = n / 10; //cociente 43,4,0
        }
        return contadorPares;
    }
    public static void main(String[] args) {
        System.out.println(contarDigitosPares(1444));
    }
}
