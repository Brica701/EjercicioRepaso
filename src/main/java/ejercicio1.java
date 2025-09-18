import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pido las dos notas
        System.out.print("Primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Segunda nota: ");
        double nota2 = sc.nextDouble(); 

        // Hago la media
        double media = (nota1 + nota2) / 2;
        double notaFinal = 0;

        // Si la media es mayor o igual a 5, aprueba
        if (media >= 5) {
            System.out.println("Aprobado :)");
            notaFinal = media;
        } else {
            // Si no, pregunto por la recuperación
            System.out.print("¿Has aprobado la recuperación? (si/no): ");
            String recupera = sc.next();

            if (recupera.equals("si") || recupera.equals("SI")) {
                notaFinal = 5;
                System.out.println("Aprobado en recuperación!");
            } else {
                notaFinal = media;
                System.out.println("No aprobaste la recuperación :(");
            }
        }

        // Enseño la nota final
        System.out.println("Tu nota final es: " + notaFinal);

        sc.close();
    }
}