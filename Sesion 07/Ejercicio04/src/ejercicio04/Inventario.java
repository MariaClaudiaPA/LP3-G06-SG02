package ejercicio04;

import java.util.InputMismatchException; 
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de Control de Inventario");
        System.out.println("Datos del producto");
        System.out.println("---------------------------------");

        try {
            System.out.print("Nombre del producto: ");
            String name = scanner.nextLine();

            System.out.print("Precio del producto: ");
            double price = scanner.nextDouble();

            System.out.print("Cantidad en inventario: ");
            int can = scanner.nextInt();

            System.out.println("---------------------------------");

            if (price < 0 || can < 0) {
                throw new IllegalArgumentException("El precio y la cantidad del producto no deben ser negativos.");
            }

            Producto producto = new Producto(name, price, can);
            System.out.println("Información del producto:");
            producto.Info_Producto();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalido: " + e.getMessage());
        } catch (InputMismatchException e) { 
            System.out.println("Error de entrada: Debes ingresar un valor válido.");
        }
    }
}
