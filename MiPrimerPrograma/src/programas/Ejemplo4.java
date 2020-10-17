package programas;

import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        double a, b, c, area;
        a =3;
        b =4;
        c =5;
        area = b*c + (a-c)*b/2;
        System.out.println("Area total:" + area);
        System.out.printf("Area total:%.2f", area);
    }
}
