import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pido la base imponible
        System.out.print("Base imponible: ");
        double base = sc.nextDouble();

        // Pido el tipo de IVA
        System.out.print("Tipo de IVA (general, reducido, superreducido): ");
        String tipoIva = sc.next();

        double iva = 0;
        if (tipoIva.equals("general")) {
            iva = 0.21;
        } else if (tipoIva.equals("reducido")) {
            iva = 0.10;
        } else if (tipoIva.equals("superreducido")) {
            iva = 0.04;
        } else {
            System.out.println("Tipo de IVA no válido.");
            return;
        }

        double precioConIva = base + (base * iva);

        // Pido el código promocional
        System.out.print("Código promocional (nopro, mitad, meno5, 5porc): ");
        String promo = sc.next();

        double descuento = 0;
        if (promo.equals("nopro")) {
            descuento = 0;
        } else if (promo.equals("mitad")) {
            descuento = precioConIva / 2;
        } else if (promo.equals("meno5")) {
            descuento = 5;
        } else if (promo.equals("5porc")) {
            descuento = precioConIva * 0.05;
        } else {
            System.out.println("Código promocional no válido.");
            return;
        }

        double precioFinal;
        if (promo.equals("mitad")) {
            precioFinal = precioConIva / 2;
        } else {
            precioFinal = precioConIva - descuento;
        }

        System.out.println("Base imponible: " + base);
        System.out.println("IVA (" + tipoIva + "): " + (iva * 100) + "%");
        System.out.println("Precio con IVA: " + precioConIva);
        System.out.println("Código promocional: " + promo);
        System.out.println("Precio final: " + precioFinal);

        sc.close();
    }
}