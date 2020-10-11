package programas;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Ingresa tu edad:");
        int edad =0;
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
        if(edad<18){
            System.out.println("Eres un niño!!!");
        }else {
            System.out.println("Eres mayor de edad!!");
        }
    }
}
