import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        String numero = sc.nextLine();

        System.out.print("Introduce un dígito: ");
        char digito = sc.next().charAt(0);

        boolean encontrado = false;
        System.out.print("Posiciones del dígito '" + digito + "': ");
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == digito) {
                System.out.print((i + 1) + " ");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.print("Ninguna");
        }
        System.out.println();
        sc.close();
    }
}