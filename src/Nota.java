import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Añade un nota,toca -1 para salir");
        int nota=in.nextInt();
        notas(nota);
    }
    public static int notas(int nota){

            if (nota >=5 && nota<=6) {
                System.out.println("Suficiente");
            } else if (nota>=7 &&nota<=8) {
                System.out.println("notable");
            } else if (nota >=9 && nota <=10) {
                System.out.println("sobresaliente");
            } else {
                System.out.println("Insuficiente");
            }

        return nota;
    }
}
