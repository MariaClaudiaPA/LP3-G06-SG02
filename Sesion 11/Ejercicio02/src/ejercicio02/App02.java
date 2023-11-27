package ejercicio02;

import java.util.Scanner;

public class App02 {

 public static void main(String[] args) {
        Dictionary<String, Integer> diccionario = new Dictionary<>();
        Scanner scanner = new Scanner(System.in);

        diccionario.add("a", 1);
        diccionario.add("b", 2);
        diccionario.add("c", 3);

        // Añadir entrada
        System.out.print("Ingrese la clave para añadir: ");
        String claveAgregar = scanner.nextLine();
        System.out.print("Ingrese el valor: ");
        int valorAgregar = scanner.nextInt();
        diccionario.add(claveAgregar, valorAgregar);
        System.out.println(diccionario);

        // Eliminar entrada
        System.out.print("Ingrese la clave a eliminar: ");
        scanner.nextLine();
        String claveEliminar = scanner.nextLine();
        boolean eliminado = diccionario.delete(claveEliminar);
        System.out.println("Eliminado '" + claveEliminar + "': " + eliminado);
        System.out.println(diccionario);

        // Obtener valor
        System.out.print("Ingrese la clave para obtener el valor: ");
        String claveObtener = scanner.nextLine();
        try {
            Integer valorObtenido = diccionario.getValue(claveObtener);
            System.out.println("Valor de '" + claveObtener + "': " + valorObtenido);
        } catch (ObjectNotExist e) {
            System.out.println(e.getMessage());
        }

        // Mostrar diccionario
        System.out.println("Diccionario:");
        System.out.println(diccionario);

        scanner.close();
    }
}
