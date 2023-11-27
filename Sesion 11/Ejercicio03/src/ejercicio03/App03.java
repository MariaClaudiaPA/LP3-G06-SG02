package ejercicio03;

import java.util.Scanner;

public class App03 {

    public static void main(String[] args) {
        Dictionary<String, String> contactosDictionary = new Dictionary<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de Contactos:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Buscar contacto por DNI");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el DNI del contacto: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese los datos del contacto: ");
                    String datos = scanner.nextLine();
                    contactosDictionary.add(dni, datos);
                    System.out.println("Contacto agregado con éxito.");
                    break;

                case 2:
                    System.out.print("\nIngrese el DNI del contacto a eliminar: ");
                    String dniEliminar = scanner.nextLine();
                    boolean eliminado = contactosDictionary.delete(dniEliminar);
                    if (eliminado) {
                        System.out.println("Contacto eliminado con éxito.");
                    } else {
                        System.out.println("No se encontró el contacto con ese DNI.");
                    }
                    break;

                case 3:
                    System.out.println("\nLista de contactos:");
                    System.out.println(contactosDictionary);
                    break;

                case 4:
                    System.out.print("\nIngrese el DNI del contacto a buscar: ");
                    String dniBuscar = scanner.nextLine();
                    try {
                        String datosContacto = contactosDictionary.getValue(dniBuscar);
                        System.out.println("Datos del contacto con DNI " + dniBuscar + ": " + datosContacto);
                    } catch (ObjectNotExist e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("\n¡Hasta luego!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("\nPor favor, seleccione una opción valida.");
            }
        }
    }
}
