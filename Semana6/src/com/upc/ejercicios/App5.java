package com.upc.ejercicios;

import java.util.Arrays;

public class App5 {
    /*
    Una empresa vendedora de fotocopiadoras necesita calcular cual ha sido el volumen de ventas de cada uno de sus
    agentes comerciales durante el presente mes y en base a eso determinar distintos indicadores, así como montos
    a pagar en comisión de ventas. Se le solicita:
    a) Obtener el total de unidades vendidas durante el presente mes. Para eso se tiene como dato de entrada un
     arreglo con la cantidad de unidades vendidas por cada agente comercial.
    b) Si se sabe que la cuota de venta de cada vendedor es 5 unidades, determinar cuál es el porcentaje de vendedores
     que superaron la cuota de venta. Para eso se tiene como dato de entrada un arreglo con la cantidad de unidades
      vendidas por cada agente comercial.
    c) Se desea saber quién(es) fueron los agentes de ventas que superaron la cuota de venta.
    d) Si se sabe que por cada unidad vendida se tiene que pagar una comisión de ventas de 300 soles, determinar
     cuánto es lo que se tiene que pagar como comisión este mes.
    */

    public static void main(String[] args) {
        int[] ventas = {10, 6, 14, 7, 4, 5, 3};
        String[] vendedores = {"Hugo", "Pepe", "Luis", "Carmen", "Ana", "David", "Rocio"};
        System.out.println("Cantidad de unidades vendidas:" + obtenerCantidadUnidadesVendidas(ventas));//TDD
        System.out.printf("Porcentaje que superaron:%.2f\n", obtenerPorcentajeVendedoresSuperanCuota(ventas)*100);
        String[] superaron = obtenerVendedoresSuperaronCuota(ventas, vendedores);
        System.out.println("Vendedores que superaron la cuota son:" + Arrays.toString(superaron));
        System.out.println("Total de Comisiones:" + obtenerMontoTotalComisiones(ventas));

    }

    static double obtenerMontoTotalComisiones(int[] ventas){
        double resultado;
        resultado = obtenerCantidadUnidadesVendidas(ventas)*300;
        return  resultado;
    }

    static String[] obtenerVendedoresSuperaronCuota(int[] ventas, String[] vendedores){
        String[] temporal = new String[vendedores.length]; //{} no se puede usar por que no sabemos cuantos son
        //entonces se crear un arreglo temporal con a lo más la cantidad de vendedores total
        //{ , , , , , , }
        int j = 0;
        for (int i=0; i<ventas.length; i++){
            if (ventas[i]>=5){
                temporal[j] = vendedores[i];
                j++;
            }
        }
        //opcional, obtener el arreglo sin espacios vacíos si es que quedan
        String [] arrF = new String[j];
        System.arraycopy(temporal, 0, arrF, 0, arrF.length);
        return arrF;///lo clásico es que se ponga return temporal;
    }

    static double obtenerPorcentajeVendedoresSuperanCuota(int[] ventas){
        int cantSuperados=0;
        double porcentaje;
        for(int i=0; i< ventas.length;i++){
            if(ventas[i]>=5){
                cantSuperados++;
            }
        }
        porcentaje = (double)cantSuperados/ventas.length;
        return porcentaje;
    }
    static int obtenerCantidadUnidadesVendidas(int[] ventas) {
        int suma = 0;
        for(int i=0; i<ventas.length;i++){
            suma+=ventas[i];
        }
        return suma;
    }
}
