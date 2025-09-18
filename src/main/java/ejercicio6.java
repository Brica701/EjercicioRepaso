import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la posición del alfil (ej. d4): ");
        String pos = entrada.nextLine();

        char letra = pos.charAt(0); // columna: a-h
        int numero = Character.getNumericValue(pos.charAt(1)); // fila: 1-8

        System.out.println("Movimientos posibles del alfil:");

        // Diagonal arriba derecha
        for (int i = 1; i < 8; i++) {
            char nuevaLetra = (char)(letra + i);
            int nuevoNumero = numero + i;
            if (nuevaLetra <= 'h' && nuevoNumero <= 8) {
                System.out.println(nuevaLetra + "" + nuevoNumero);
            }
        }

        // Diagonal arriba izquierda
        for (int i = 1; i < 8; i++) {
            char nuevaLetra = (char)(letra - i);
            int nuevoNumero = numero + i;
            if (nuevaLetra >= 'a' && nuevoNumero <= 8) {
                System.out.println(nuevaLetra + "" + nuevoNumero);
            }
        }

        // Diagonal abajo derecha
        for (int i = 1; i < 8; i++) {
            char nuevaLetra = (char)(letra + i);
            int nuevoNumero = numero - i;
            if (nuevaLetra <= 'h' && nuevoNumero >= 1) {
                System.out.println(nuevaLetra + "" + nuevoNumero);
            }
        }

        // Diagonal abajo izquierda
        for (int i = 1; i < 8; i++) {
            char nuevaLetra = (char)(letra - i);
            int nuevoNumero = numero - i;
            if (nuevaLetra >= 'a' && nuevoNumero >= 1) {
                System.out.println(nuevaLetra + "" + nuevoNumero);
            }
        }

        entrada.close();
    }
}
