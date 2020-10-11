package programas;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        double celsius,f;
        Scanner sc = new Scanner(System.in); //objeto que permitira leer dato del teclado
        System.out.println("Ingresa temperatura en Grados Celsius:");
        celsius = sc.nextDouble();
        f = celsius*9/5 + 32;
        System.out.println("Grados Fahrenheit:" + f);
    }

}
