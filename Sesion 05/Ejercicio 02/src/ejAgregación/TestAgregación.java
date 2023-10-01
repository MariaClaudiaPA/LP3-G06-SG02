package ejAgregaci�n;
import java.util.Scanner;

public class TestAgregaci�n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automovil automovil = null;

        while (true) {
            System.out.println("\n----------------Menú:---------------");
            System.out.println("1. Crear automóvil");
            System.out.println("2. Asignar motor al automóvil");
            System.out.println("3. Mostrar información del automóvil");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); 
                    System.out.println("\nIngrese la placa del automóvil:");
                    String placa = scanner.nextLine();
                    System.out.println("\nIngrese el número de puertas:");
                    int numPuertas = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.println("\nIngrese la marca del automóvil:");
                    String marca = scanner.nextLine();
                    System.out.println("\nIngrese el modelo del automóvil:");
                    String modelo = scanner.nextLine();
                    automovil = new Automovil(placa, numPuertas, marca, modelo);
                    break;
                case 2:
                    if (automovil != null) {
                        System.out.println("\nIngrese el número de motor:");
                        int numMotor = scanner.nextInt();
                        System.out.println("\nIngrese las revoluciones por minuto (RPM):");
                        int revPorMin = scanner.nextInt();
                        Motor motor = new Motor(numMotor, revPorMin);
                        automovil.setMotor(motor);
                        System.out.println("\nMotor asignado al automóvil.");
                    } else {
                        System.out.println("\nPrimero cree un automóvil.");
                    }
                    break;
                case 3:
                    if (automovil != null) {
                        System.out.println("\nInformación del Automóvil:");
                        System.out.println(automovil);
                    } else {
                        System.out.println("\nNo se ha creado un automóvil aún.");
                    }
                    break;
                case 4:
                    System.out.println("\nSaliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n Intente de nuevo.");
            }
        }
    }
}
