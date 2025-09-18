import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int contador = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Introduce un número (negativo para terminar): ");
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            contador++;
            if (num % 2 == 0) {
                if (num > mayorPar) {
                    mayorPar = num;
                }
            } else {
                sumaImpares += num;
                contadorImpares++;
            }
        }

        System.out.println("Cantidad de números introducidos: " + contador);
        if (contadorImpares > 0) {
            double mediaImpares = (double) sumaImpares / contadorImpares;
            System.out.println("Media de los impares: " + mediaImpares);
        } else {
            System.out.println("No se introdujeron números impares.");
        }
        if (mayorPar != Integer.MIN_VALUE) {
            System.out.println("Mayor de los pares: " + mayorPar);
        } else {
            System.out.println("No se introdujeron números pares.");
        }
        sc.close();
    }
}