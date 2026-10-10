import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // 1. Registrar productos
        System.out.print("Nombre del producto 1: ");
        String prod1 = leer.next();
        System.out.print("Precio: ");
        double precio1 = leer.nextDouble();

        System.out.print("Nombre del producto 2: ");
        String prod2 = leer.next();
        System.out.print("Precio: ");
        double precio2 = leer.nextDouble();

        // 2. Mostrar productos
        System.out.println("\nPRODUCTOS DISPONIBLES:");
        System.out.println("1. " + prod1 + " = $" + precio1);
        System.out.println("2. " + prod2 + " = $" + precio2);

        // 3. Crear pedido
        System.out.print("\n¿Cuantos quiere del producto 1? ");
        int cant1 = leer.nextInt();

        System.out.print("¿Cuantos quiere del producto 2? ");
        int cant2 = leer.nextInt();

        // 4. Calcular total
        double total = (precio1 * cant1) + (precio2 * cant2);

        System.out.println("\n--- TOTAL A PAGAR ---");
        System.out.println("Total: $" + total);

        leer.close();
    }
}