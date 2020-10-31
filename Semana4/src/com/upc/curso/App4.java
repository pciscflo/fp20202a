package com.upc.curso;

public class App4 {
    public static void main(String[] args) {

        for(int i=0; i<10 ; i++){// inicio con inicialización de variables(una sola vez al inicio); condición; contador
            System.out.println(i);//0,1,2,....9
        }
        System.out.println("Continua el program....");
        for(int i=0; i<10 ; i+=2){
            System.out.println(i);//0,2,4,....8
        }
        System.out.println("------------------");
        for (int i=1 ;i <=10; i++){
            System.out.println(i);//1, 2,...., 10
        }
        System.out.println("==================");
        for(int i=2; i< 15; i+=3){
            System.out.println(i);//2, 5, 8,....,14
        }
    }
}
