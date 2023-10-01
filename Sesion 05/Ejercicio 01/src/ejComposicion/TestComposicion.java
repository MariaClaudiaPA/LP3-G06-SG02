package ejComposicion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TestComposicion {
    private static List<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido!!!!");

        while (true) {
            System.out.println("\n-----------Menu:------------");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Mostrar cuentas");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opcion que desee:");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el ID de la persona:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir nueva línea
                    System.out.println("\nIngrese el nombre de la persona:");
                    String nombre = scanner.nextLine();
                    System.out.println("\nIngrese el apellido de la persona:");
                    String apellido = scanner.nextLine();
                    System.out.println("\nIngrese el tipo de cliente (C, B, o E):");
                    char tipoCliente = scanner.next().charAt(0);

                    Persona persona = new Persona(id, nombre, apellido, tipoCliente);
                    personas.add(persona);
                    System.out.println("\nCuenta creada con éxito.");
                    break;
                case 2:
                    System.out.println("\nIngrese el número de cuenta:");
                    String numeroCuentaDeposito = scanner.next();
                    System.out.println("\nIngrese la cantidad a depositar:");
                    double cantidadDeposito = scanner.nextDouble();

                    depositarEnCuenta(numeroCuentaDeposito, cantidadDeposito);
                    break;
                case 3:
                    System.out.println("\nIngrese el número de cuenta:");
                    String numeroCuentaRetiro = scanner.next();
                    System.out.println("\nIngrese la cantidad a retirar:");
                    double cantidadRetiro = scanner.nextDouble();

                    retirarDeCuenta(numeroCuentaRetiro, cantidadRetiro);
                    break;
                case 4:
                    mostrarCuentas();
                    break;
                case 5:
                    System.out.println("\nSaliendo");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\nPor favor, ingrese una opción válida.");
            }
        }
    }

    private static void depositarEnCuenta(String numeroCuenta, double cantidad) {
        for (Persona persona : personas) {
            if (persona.getCuenta().getNumero().equals(numeroCuenta)) {
                persona.depositar(cantidad);
                System.out.println("\nDepósito realizado con éxito.");
                return;
            }
        }
        System.out.println("\nNúmero de cuenta no encontrado.");
    }

    private static void retirarDeCuenta(String numeroCuenta, double cantidad) {
        for (Persona persona : personas) {
            if (persona.getCuenta().getNumero().equals(numeroCuenta)) {
                persona.retirar(cantidad);
                return;
            }
        }
        System.out.println("\nNúmero de cuenta no encontrado.");
    }

    private static void mostrarCuentas() {
        System.out.println("\n----Información de las cuentas:---");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}

