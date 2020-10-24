package com.upc.datos;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldoBruto;
        double utilidad;
        double sueldoAnual;
        double sueldoNeto;
        double impuesto;
        System.out.println("Ingrese su sueldo bruto:");
        sueldoBruto = sc.nextDouble();
        System.out.println("Ingrese la utilidad:");
        utilidad = sc.nextDouble();
        sueldoAnual = sueldoBruto*14 + utilidad;
        sueldoNeto = sueldoAnual - 3600*7;
        if (sueldoNeto <0 ){
            impuesto = 0;
        }else
        {
            impuesto = 0.21*sueldoNeto;
        }
        System.out.println("El impuesto es:" + impuesto);
    }
}
