package com.upc.curso;

public class App1 {
    static double obtenerPorcentaje(String sede) {
        double resultado=0;
        switch (sede) {
            case "Lima":
                resultado = 0.05;
                break;
            case "Lince":
                resultado = 0.10;
                break;
            case "Independencia":
                resultado = 0.15;
                break;
        }
        return resultado;
    }

    static double obtenerMensualidad(String colegio, String categoria) {
        double pension = 0;
        switch (colegio) {
            case "Saco Oliveros":
                switch (categoria) {
                    case "Inicial":
                        pension = 600;
                        break;
                    case "Primaria":
                        pension = 750;
                        break;
                    case "Secundaria":
                        pension = 850;
                        break;
                }
                break;
            case "San Fernando":
                switch (categoria) {
                    case "Inicial":
                        pension = 470;
                        break;
                    case "Primaria":
                        pension = 510;
                        break;
                    case "Secundaria":
                        pension = 650;
                        break;
                }
                break;
            case "Trilce":
                switch (categoria) {
                    case "Inicial":
                        pension = 350;
                        break;
                    case "Primaria":
                        pension = 400;
                        break;
                    case "Secundaria":
                        pension = 450;
                        break;
                }
                break;
        }
        return pension;
    }

    static double obtenerMontoFinal(String colegio, String categoria, String sede){
        double monto=0, mensualidad=0, porcentaje=0;
        mensualidad = obtenerMensualidad(colegio,categoria);
        porcentaje = obtenerPorcentaje(sede);
        monto = mensualidad - mensualidad*porcentaje;
        return monto;
    }

    public static void main(String[] args) {
        //datos de entrada, inputs, ingreso de datos
        //colegio, categoria
        String colegio, categoria;
        colegio = "San Fernando";
        categoria = "Secundaria";
        //Proceso/Subproceso/modulo (llamar a métodos, funciones, subprogramas) y Salida
        System.out.println("Mensualidad:" + obtenerMensualidad(colegio, categoria));
        //datos de entrada : sede
        String sede = "Lince";
        System.out.println("Porcentaje de descuento:" + obtenerPorcentaje(sede));
        System.out.println("Cuota Final:" + obtenerMontoFinal(colegio, categoria, sede));

    }
}
