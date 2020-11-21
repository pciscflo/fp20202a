package com.upc.cadenas;

public class App2 {

    static String [] codigos = {"AR000101","PE125610","CH452315","BR521317","BR123620","PE752124","AR124511","PE562405","PE562405","BR452102","AR455210"};

    public static void main(String[] args) {
        String nacionalidad = "CH";
        System.out.println(calcularTotalProductos(nacionalidad));
        System.out.println(obtenerMayorCorrelativo("AR"));
        System.out.println(obtenerValorTotalAlmacenaje());
    }

    static int calcularTotalProductos(String nacionalidad){
        int suma =0;
        for(int i=0; i < codigos.length; i++){
            if(codigos[i].substring(0,2).equals(nacionalidad)){
                  suma+=Integer.parseInt(codigos[i].substring(2,6));//no puedes sumar una cadena a un entero, entonces lo debes convertir a entero
            }
        }
        return suma;
    }
    static int obtenerMayorCorrelativo(String nacionalidad){
       int maximo=0, valor = 0;
       for(int i=0; i < codigos.length; i++){
           valor = Integer.parseInt(codigos[i].substring(2,6));
           if (valor > maximo && codigos[i].substring(0,2).equals(nacionalidad)){
               maximo = valor;
           }
       }
       return maximo;
    }
    static int obtenerValorTotalAlmacenaje(){
        int correlativo=0, costo=0, monto = 0, suma = 0;
        for(int i=0; i < codigos.length; i++){
             correlativo = Integer.parseInt(codigos[i].substring(2,6));
             costo = Integer.parseInt(codigos[i].substring(6,8));
             monto = correlativo*costo;
             suma+=monto;
        }
        return suma;
    }

}
