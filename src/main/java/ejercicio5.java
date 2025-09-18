import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            if (i == 1) {
                System.out.println("******");
            } else if (i % 2 == 0 && i < altura) {
                System.out.println("**  **");
            } else if (i % 2 == 1 && i < altura) {
                int length = 6 + 2 * ((i - 1) / 2);
                for (int j = 0; j < length; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else if (i == altura) {
                int length = 6 + 2 * ((altura - 1) / 2);
                for (int j = 0; j < length; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
