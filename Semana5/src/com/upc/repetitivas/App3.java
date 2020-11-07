package com.upc.repetitivas;

public class App3 {
    /*
    Un banco establece que la clave secreta para acceso a sus cajeros automáticos
    debe ser un número de cuatro o más dígitos y que la suma de los dos dígitos que
    se encuentran en la 3 y 4 posición (posición de centena y millar) sea par.
    Determinar si una clave cumple con la condición.
     */

    public static void main(String[] args) {
        //dato de entrada numero n
         int n = 12456;
        System.out.println(validadorClave(n));

    }

    static int contadorDigitos(int n){
        int digito, contadorDigitos=0;
        while(n>0){
            digito = n % 10;
            contadorDigitos++;
            n = n / 10;
        }
        return contadorDigitos;
    }

    static boolean verificaSumaDigitos(int n){
        int digito, contadorDigitos=0, suma=0;
        while(n>0){
            digito = n % 10;
            contadorDigitos++;//indica la posicion del digito
            if(contadorDigitos==3 || contadorDigitos==4){
                suma = suma + digito;
            }
            n = n / 10;
        }
        if (suma % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    static String validadorClave(int n){
        //llamar a los anteriores aplicando las reglas que dice el ejercicio
        if(contadorDigitos(n) >=4 && verificaSumaDigitos(n)==true){ //AMBOS DEBEN CUMPLIR
            return "La clave es válida!";
        }else{
            return "La Clave No cumple las reglas!";
        }
    }


}
