package com.upc.curso.ejemplos;

import java.util.Scanner;

/*
La feria de Móviles se lleva a cabo anualmente en Barcelona. Para dicho evento existen 3 tipos
de entrada (normal, silver, gold) y los precios son respectivamente (700, 1700, 2700 euros).
Para las empresas que tienen stands dentro de la feria se les da la facilidad para que puedan
tener códigos promocionales que otorga un monto de descuento. Dicho código puede ser utilizado
por cualquier persona asistente a la feria y es utilizado al momento de su registro. Dichos
códigos son cadenas de texto de 10 caracteres.
Se le pide desarrollar funciones que serán utilizadas durante el registro de los usuarios y
usted apoyará en las siguientes funcionalidades:
a)	Determinar cuál es el monto a pagar dado un tipo de entrada.
b)	Dado un código promocional que ingresa un usuario al momento de su registro, validar si
    es que dicho código cuenta con el formato de 10 caracteres y está dentro de la lista de
    códigos promocionales.
c)	Determinar cuánto es el descuento que tiene asignado un determinado código promocional válido.
d)	Determinar cuánto es lo que finalmente tiene que pagar el asistente que se registra si es
    que ingresa un código promocional. Si el descuento es mayor al costo de la entrada entonces
    el monto a pagar será 0.
 */
public class App3 {
    static String[] tipos = {"normal", "silver", "gold"};
    static double[] precios = {770, 1700, 2700};
    static String[] codigosPromocionales = {"A234567890","F888888888", "T777777777"};
    static double[] descuentosPromocionales= {1200, 100, 200};

    public static void main(String[] args) {
        String tipo;
        tipo = "silver";
        //Scanner sc = new Scanner(System.in);
        //tipo = sc.nextLine();
        System.out.println("El monto a pagar es:" + obtenerMontoPagar(tipo));
        String codigo;
        codigo = "F888888888";
        tipo = "gold";
        System.out.println("Validacion:" + verificar(codigo));
        System.out.println("Descuento:" + obtenerDescuento(codigo));
        System.out.println("Neto a pagar:" + calcularMontoTotalPagar(codigo, tipo));
    }
    static double calcularMontoTotalPagar(String codigoPromocionalTentativo, String tipo){
        double monto = obtenerMontoPagar(tipo);
        double descuento = obtenerDescuento(codigoPromocionalTentativo);
        double neto=0;
        if(descuento>monto){
            neto = 0;
        }
        else
        {
            neto = monto -descuento;
        }
        return neto;
    }

    static double obtenerDescuento(String codigoPromocionalTentativo){
        double descuento=0;
        if(verificar(codigoPromocionalTentativo)==true){
            for(int i=0; i<codigosPromocionales.length;i++){
                if (codigosPromocionales[i].equals(codigoPromocionalTentativo)){
                   descuento = descuentosPromocionales[i];
                   break;//sale de for, while, do while, switch
                }
            }
            return descuento;
        }else{
            return descuento;
        }
    }
    static boolean verificar(String codigoPromocionalTentativo){
        for(int i=0; i<codigosPromocionales.length;i++){
            if (codigosPromocionales[i].equals(codigoPromocionalTentativo) &&
                    codigoPromocionalTentativo.length()==10){
                return true;
            }
        }
        return false;
    }
    static double obtenerMontoPagar(String tipo){
        double precio=0;
        for(int i=0; i< tipos.length; i++ ){
            if (tipos[i].equals(tipo)){
                precio = precios[i];
            }
        }
        return precio;
    }

}
