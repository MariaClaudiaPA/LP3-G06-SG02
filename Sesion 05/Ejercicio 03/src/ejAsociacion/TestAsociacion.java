package ejAsociacion;
import java.util.Scanner;

public class TestAsociacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco bcp = new Banco("BCP",30);
        Banco bbva = new Banco("BBVA", 30);

        while (true) {
            System.out.println("\n-------------Menú-------------");
            System.out.println("1. Agregar cliente a BCP");
            System.out.println("2. Agregar cliente a BBVA");
            System.out.println("3. Dar de baja cliente de BCP");
            System.out.println("4. Dar de baja cliente de BBVA");
            System.out.println("5. Listar clientes de BCP");
            System.out.println("6. Listar clientes de BBVA");
            System.out.println("7. Buscar cliente en BCP");
            System.out.println("8. Buscar cliente en BBVA");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Agregar cliente a BCP
                    System.out.print("Ingrese el DNI del cliente: ");
                    String dniBCP = scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreBCP = scanner.nextLine();

                    char tipoBCP;
                    do {
                        System.out.print("Ingrese el tipo del cliente (C, B, E): ");
                        tipoBCP = scanner.nextLine().toUpperCase().charAt(0);
                    } while (tipoBCP != 'C' && tipoBCP != 'B' && tipoBCP != 'E');

                    Persona nuevoClienteBCP;
                    nuevoClienteBCP = new Persona(dniBCP, nombreBCP, tipoBCP);
                    bcp.agregarCliente(nuevoClienteBCP);
                    break;
                case 2:
                    // Agregar cliente a BBVA
                    System.out.print("Ingrese el DNI del cliente: ");
                    String dniBBVA = scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreBBVA = scanner.nextLine();

                    char tipoBBVA;
                    do {
                        System.out.print("Ingrese el tipo del cliente (C, B, E): ");
                        tipoBBVA = scanner.nextLine().toUpperCase().charAt(0);
                    } while (tipoBBVA != 'C' && tipoBBVA != 'B' && tipoBBVA != 'E');

                    Persona nuevoClienteBBVA;
                    nuevoClienteBBVA = new Persona(dniBBVA, nombreBBVA, tipoBBVA);
                    bbva.agregarCliente(nuevoClienteBBVA);
                    break;
                case 3:
                    // Dar de baja cliente de BCP
                    System.out.print("Ingrese el DNI del cliente a dar de baja en BCP: ");
                    dniBCP = scanner.nextLine();
                    Persona clienteABajaBCP = new Persona(dniBCP, "", ' ');
                    bcp.darBajaCliente(clienteABajaBCP);
                    break;
                case 4:
                    // Dar de baja cliente de BBVA
                    System.out.print("Ingrese el DNI del cliente a dar de baja en BBVA: ");
                    dniBBVA = scanner.nextLine();
                    Persona clienteABajaBBVA = new Persona(dniBBVA, "", ' ');
                    bbva.darBajaCliente(clienteABajaBBVA);
                    break;
                case 5:
                    // Listar clientes de BCP
                    System.out.println("\nClientes del Banco BCP:");
                    System.out.println(bcp);
                    break;
                case 6:
                    // Listar clientes de BBVA
                    System.out.println("\nClientes del Banco BBVA:");
                    System.out.println(bbva);
                    break;
                case 7:
                    // Buscar cliente en BCP
                    System.out.print("Ingrese el DNI del cliente a buscar en BCP: ");
                    dniBCP = scanner.nextLine();
                    Persona clienteABuscarBCP = new Persona(dniBCP, "", ' ');
                    boolean encontradoBCP = bcp.buscarCliente(clienteABuscarBCP);
                    if (encontradoBCP) {
                        System.out.println("Cliente encontrado en el Banco BCP.");
                    } else {
                        System.out.println("Cliente no encontrado en el Banco BCP.");
                    }
                    break;
                case 8:
                    // Buscar cliente en BBVA
                    System.out.print("Ingrese el DNI del cliente a buscar en BBVA: ");
                    dniBBVA = scanner.nextLine();
                    Persona clienteABuscarBBVA = new Persona(dniBBVA, "", ' ');
                    boolean encontradoBBVA = bbva.buscarCliente(clienteABuscarBBVA);
                    if (encontradoBBVA) {
                        System.out.println("Cliente encontrado en el Banco BBVA.");
                    } else {
                        System.out.println("Cliente no encontrado en el Banco BBVA.");
                    }
                    break;
                case 9:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
