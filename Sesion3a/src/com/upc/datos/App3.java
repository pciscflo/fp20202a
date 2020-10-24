package com.upc.datos;

import java.util.Scanner;

public class App3 {

    public static double calcularSueldoAnual(double sueldoBruto, double utilidad){
        double sueldoAnual;
        sueldoAnual = sueldoBruto*14 + utilidad;
        return sueldoAnual;
    }
    public static double calcularSueldoNeto(double sueldoAnual){
        return (sueldoAnual - 3600*7);
    }
    public static double calcularImpuesto(double sueldoNeto){
        double impuesto;
        if (sueldoNeto <0 ){
            impuesto = 0;
        }else
        {
            impuesto = 0.21*sueldoNeto;
        }
        return impuesto;
    }
    public static double calcularImpuesto(double sueldoBruto, double utilidad){
        double sueldoAnual, sueldoNeto, impuesto;
        sueldoAnual = calcularSueldoAnual(sueldoBruto, utilidad);
        sueldoNeto  = calcularSueldoNeto(sueldoAnual);
        if (sueldoNeto <0 ){
            impuesto = 0;
        }else
        {
            impuesto = 0.21*sueldoNeto;
        }
        return impuesto;
    }

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
        System.out.println("***************************");
        impuesto = calcularImpuesto(sueldoBruto, utilidad);
        System.out.println("El impuesto es:" + impuesto);
    }

}
