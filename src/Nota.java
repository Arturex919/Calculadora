import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota;
        boolean acaba = false;
        System.out.println("Añade un nota,toca -1 para salir");
        do {
            System.out.println("Añade una nota");
            nota = in.nextInt();
            if (nota == -1) {
                acaba = true;
            } else if (nota >= 5) {
                System.out.println("Suficiente");
            } else {
                System.out.println("Insuficiente");
            }
        } while (!acaba);
        System.out.println("adios");

    }
}
