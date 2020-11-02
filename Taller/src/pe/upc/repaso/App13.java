package pe.upc.repaso;

public class App13 {
    public static void main(String[] args) {
        //sentencia es una instruccion que le das al computador
        int n = 0;
        if (n > 0) {
            System.out.println("Positivo");
        }
        else if (n == 0) {
            System.out.println("Cero");
        } else if (n < 0) {
            System.out.println("Negativo");
        }

        //una sentencia se separa de otra con un punto y coma
        //un bloque de sentencias se puede agrupar con llaves y sirve para que se aplique if, else, switch, for, while

        int edad = 10;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            System.out.println("Ya listo para la vida");
            edad++;
        }
        // punto y coma indica fin de sentencia


    }
}
