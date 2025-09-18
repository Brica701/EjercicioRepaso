import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca la posición del alfil: ");
        String posicion = sc.nextLine().toLowerCase().trim();

        if (posicion.length() != 2) {
            System.out.println("Posición inválida.");
            return;
        }
        
        char columnaChar = posicion.charAt(0);
        int fila = posicion.charAt(1) - '1'; 

        if (columnaChar < 'a' || columnaChar > 'h' || fila < 0 || fila > 7) {
            System.out.println("Posición inválida.");
            return;
        }
        
        int columna = columnaChar - 'a'; 
        
        System.out.println("El alfil puede moverse a las siguientes posiciones:");

       
        for (int i = 1; fila + i < 8 && columna + i < 8; i++) {
            System.out.print("" + (char)('a' + columna + i) + (fila + i + 1) + " ");
        }
        
        for (int i = 1; fila + i < 8 && columna - i >= 0; i++) {
            System.out.print("" + (char)('a' + columna - i) + (fila + i + 1) + " ");
        }

        for (int i = 1; fila - i >= 0 && columna + i < 8; i++) {
            System.out.print("" + (char)('a' + columna + i) + (fila - i + 1) + " ");
        }

        for (int i = 1; fila - i >= 0 && columna - i >= 0; i++) {
            System.out.print("" + (char)('a' + columna - i) + (fila - i + 1) + " ");
        }

        System.out.println();
        sc.close();
    }
}
