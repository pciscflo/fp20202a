package com.upc.curso.ejemplos;

import java.util.Arrays;

/*
El municipio de Lima pretende implementar un sistema que permita restringir el acceso
de los vehículos en las principales vías dependiendo de ciertos criterios, para esto va a utilizar
una serie de stickers a manera de prueba de concepto, los cuales van a variar en color dependiendo
del número de digito en que terminan las placas.
Se sabe que el color de sticker y digito final de la placa están relacionados de la siguiente manera:
       DÍGITO			COLOR
       1 o 2			amarillo
       3 o 4			rosa
       5 o 6			rojo
       7 o 8			verde
       9 o 0			azul
Se ha hecho un levantamiento de información en base a una muestra tomada durante una semana
en la panamericana sur, norte y carretera central. De esa muestra se obtuvo tanto el número
de placas de los vehículos así como el tipo de vehículo que circulaba.
Adicionalmente se sabe que existen los siguientes tipos de vehículos: “Camion”, “Auto”, “Bus”
Con los datos obtenidos se solicita lo siguiente:
-	Dado un dígito, determinar cuántos vehículos tienen la placa que termina con dicho dígito.
-	Cuál es el tipo de vehículos que menos transita en estas vías (Nota: Considerar que sólo
   habrá 1 tipo de vehículo que menos transite).
-	Devolver un listado con las placas de todos aquellos vehículos que tengan sticker verde o rojo.
*/
public class App1 {

    static int obtenerCantidadVehiculos(int digito, String[] placas){
        int cantidadVehiculos=0;
         for(int i=0; i < placas.length; i++){
             if (Integer.parseInt(placas[i].substring(5,6))==digito){
                 cantidadVehiculos++;
             }
         }
        return cantidadVehiculos;
    }
    static String obtenerTipoVehiculo(String[] tipos){
        String tipo=null;
        int autos=0, camiones=0, buses=0; //contadores
        for(int i=0; i < tipos.length; i++){
            if(tipos[i].equals("Auto")){
                autos++;
            }
            if(tipos[i].equals("Camion")){
                camiones++;
            }
            if(tipos[i].equals("Bus")){
                buses++;
            }
        }
        if(autos<camiones && autos<buses){
            tipo = "Auto";
        }else  if(camiones<autos && camiones<buses){
            tipo="Camion";
        } else if(buses<autos && buses<camiones){
            tipo="Bus";
        }
        return tipo;
    }
    static String[] obtenerPlacasStickerVerdeRojo(String[] placas){
        String[] placasVerdesRojas = new String[placas.length];
        int p, j=0;
        for(int i=0; i<placas.length; i++){
            p = Integer.parseInt(placas[i].substring(5,6));
            if(p>=5 && p<=8){
                placasVerdesRojas[j] = placas[i];
                j++;//posicion de la placa seleccionada
            }
        }
        return placasVerdesRojas;
    }
    public static void main(String[] args) {
        String[] placas = {"ABC123", "PQR222", "AMD988", "BBC222","AAA111"};
        String[] tipos = {"Auto", "Bus","Camion", "Auto", "Bus"}; //a:2, c:1, b:2
        //leer del teclado el dígito o asumir un dígito constante
        int digito = 1; //sc.nextInt()...
        System.out.println("Cantidad de vehiculos:" + obtenerCantidadVehiculos(digito, placas));
        System.out.println("Circula menos:" + obtenerTipoVehiculo(tipos));
        System.out.println("Placas Verdes o Rojas:" +
                Arrays.toString(obtenerPlacasStickerVerdeRojo(placas)));

    }

}
