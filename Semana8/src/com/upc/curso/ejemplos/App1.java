package com.upc.curso.ejemplos;
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
    public static void main(String[] args) {
        String[] placas = {"ABC123", "PQR222", "AMD980", "BBC222","AAA111"};
        String[] tipos = {"Auto", "Camion","Auto", "Bus", "Bus"};
        //leer del teclado el dígito o asumir un dígito constante
        int digito = 1; //sc.nextInt()...
        System.out.println("Cantidad de vehiculos:" + obtenerCantidadVehiculos(digito, placas));


    }

}
