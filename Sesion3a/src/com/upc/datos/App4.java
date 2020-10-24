package com.upc.datos;

public class App4 {
     /*
        Determinar el sueldo neto de un trabajador de acuerdo
        a las horas que trabaja y el pago por hora que recibe.
        Tener en cuenta que se le descuenta el 10% de su sueldo.
        Desarrollar un programa que determine el importe a recibir

        Entrada:  horasTrabajadas, pagoPorHora

         sueldo = horasTrabajadas*pagoPorHora

         descuento = 0.10*sueldo

         sueldoNeto = sueldo - descuento;

        Salida: SueldoNeto

         */

    public static double calcularSueldoNeto(int horasTrabajadas, double pagoPorHora){
        double sueldoNeto, sueldo, descuento;
        sueldo = horasTrabajadas*pagoPorHora;
        descuento = sueldo*0.10;
        sueldoNeto = sueldo - descuento;
        return sueldoNeto;
    }


    public static void main(String[] args) {

        double total;
        total = calcularSueldoNeto(100,30);
        System.out.println("Total a recibir: " + total);
        System.out.println("Total:"+ calcularSueldoNeto(30, 120));

    }
}
