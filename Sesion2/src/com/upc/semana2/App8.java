package com.upc.semana2;

public class App8 {
    public static void main(String[] args) {
        /*
        Determinar el sueldo de un trabajador de acuerdo
        a las horas que trabaja y el pago por hora que recibe.
        Tener en cuenta que se le descuenta el 10% de su sueldo.
        Desarrollar un programa que determine el importe a recibir

        Entrada: horasTrabajadas, pagoPorHora

         sueldo = horasTrabajadas*pagoPorHora
         descuento = 0.10*sueldo
         sueldoNeto = sueldo - descuento;

        Salida: SueldoNetoTrabajador

         */
        double horasTrabajadas, pagoPorHora, sueldo,descuento,sueldoNeto;
        pagoPorHora = 25;
        horasTrabajadas = 40;
        sueldo = horasTrabajadas*pagoPorHora;
        descuento = 0.10*sueldo;
        sueldoNeto= sueldo - descuento;
        System.out.println("El sueldo neto del trabajador es:" + sueldoNeto);
    }
}
