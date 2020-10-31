package com.upc.curso;

import java.util.Enumeration;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        String empresa, paquete;
        double precioVenta, descuento, precioFinal;
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese empresa de telecomunicaciones:");
        empresa = sc.nextLine();
        System.out.println("Ingrese paquete adquirido:");
        paquete = sc.nextLine();
        System.out.println("Ingrese número de celulares");
        numero = sc.nextInt();

        precioVenta = calcularPrecioPaquete(empresa, paquete);
        descuento = calcularDescuento(numero);
        precioFinal = precioVenta - descuento * precioVenta;

        System.out.println("El precio de venta es: " + precioVenta);
        System.out.println("El descuento es de: " + descuento);
        System.out.println("El precio final a pagar es: " + precioFinal);

    }

    static double calcularPrecioPaquete(String empresa, String paquete){
        double precio = 0.0;
        if (empresa.equals("Telecom1") && paquete.equals("Paquete1")){
            precio = 70.40;
        } else if (empresa.equals("Telecom1") && paquete.equals("Paquete2")){
            precio = 110.40;
        } else if (empresa.equals("Telecom1") && paquete.equals("Paquete3")){
            precio = 150.50;
        } else if (empresa.equals("Telecom2") && paquete.equals("Paquete1")){
            precio = 61.10;
        } else if (empresa.equals("Telecom2") && paquete.equals("Paquete2")){
            precio = 105.60;
        } else if (empresa.equals("Telecom2") && paquete.equals("Paquete3")){
            precio = 146.80;
        } else if (empresa.equals("Telecom3") && paquete.equals("Paquete1")){
            precio = 68.45;
        } else if (empresa.equals("Telecom3") && paquete.equals("Paquete2")){
            precio = 107.10;
        } else if (empresa.equals("Telecom3") && paquete.equals("Paquete3")){
            precio = 141.90;
        }
        return precio;
    }

    static double calcularDescuento(int numero){
        double descuento = 0.0;
        if (numero >= 1 && numero <= 2){
            descuento = 0.05;
        } else if (numero >= 3 && numero <= 4){
            descuento = 0.10;
        } else {
            descuento = 0.15;
        }
        return descuento;
    }
}
