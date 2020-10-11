package programas;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        double a, b, c, area;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Ingresa lado a:");
        a  = sc.nextDouble();
        System.out.print("Ingresa lado b:");
        b = sc.nextDouble();
        System.out.println("Ingresa lado c:");
        c = sc.nextDouble();
        area = b*c + (a-c)*b/2;
        System.out.println("Area total:" + area);
        System.out.printf("Area total:%.2f", area);
    }
}
