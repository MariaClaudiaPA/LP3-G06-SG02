package ejAgregaci髇;
import java.util.Scanner;

public class TestAgregaci髇 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automovil automovil = null;

        while (true) {
            System.out.println("\n----------------Men煤:---------------");
            System.out.println("1. Crear autom贸vil");
            System.out.println("2. Asignar motor al autom贸vil");
            System.out.println("3. Mostrar informaci贸n del autom贸vil");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opci贸n: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); 
                    System.out.println("\nIngrese la placa del autom贸vil:");
                    String placa = scanner.nextLine();
                    System.out.println("\nIngrese el n煤mero de puertas:");
                    int numPuertas = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.println("\nIngrese la marca del autom贸vil:");
                    String marca = scanner.nextLine();
                    System.out.println("\nIngrese el modelo del autom贸vil:");
                    String modelo = scanner.nextLine();
                    automovil = new Automovil(placa, numPuertas, marca, modelo);
                    break;
                case 2:
                    if (automovil != null) {
                        System.out.println("\nIngrese el n煤mero de motor:");
                        int numMotor = scanner.nextInt();
                        System.out.println("\nIngrese las revoluciones por minuto (RPM):");
                        int revPorMin = scanner.nextInt();
                        Motor motor = new Motor(numMotor, revPorMin);
                        automovil.setMotor(motor);
                        System.out.println("\nMotor asignado al autom贸vil.");
                    } else {
                        System.out.println("\nPrimero cree un autom贸vil.");
                    }
                    break;
                case 3:
                    if (automovil != null) {
                        System.out.println("\nInformaci贸n del Autom贸vil:");
                        System.out.println(automovil);
                    } else {
                        System.out.println("\nNo se ha creado un autom贸vil a煤n.");
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
