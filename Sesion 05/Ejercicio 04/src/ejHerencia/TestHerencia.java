package ejHerencia;
import java.util.Scanner;

public class TestHerencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido!!!!");
        // Obtener datos para el primer empleado
        System.out.println("\nIngrese los datos del primer empleado:");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("DNI: ");
        int dni1 = scanner.nextInt();
        System.out.print("Vacaciones: ");
        int vac1 = scanner.nextInt();
        System.out.print("Salario: ");
        double salario1 = scanner.nextDouble();
        scanner.nextLine();

        Asalariado empleado1 = new Asalariado(nombre1, dni1, vac1, salario1);

        // Obtener datos para el segundo empleado
        System.out.println("\nIngrese los datos del segundo empleado:");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("DNI: ");
        int dni2 = scanner.nextInt();
        System.out.print("Vacaciones: ");
        int vac2 = scanner.nextInt();
        System.out.print("Salario: ");
        double salario2 = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Turno (Mañana/Tarde/Noche): ");
        String turno2 = scanner.nextLine();

        EmpleadoProduccion empleado2 = new EmpleadoProduccion(nombre2, dni2, vac2, salario2, turno2);

        // Obtener datos para el tercer empleado
        System.out.println("\nIngrese los datos del tercer empleado:");
        System.out.print("Nombre: ");
        String nombre3 = scanner.nextLine();
        System.out.print("DNI: ");
        int dni3 = scanner.nextInt();
        System.out.print("Vacaciones: ");
        int vac3 = scanner.nextInt();
        System.out.print("Salario: ");
        double salario3 = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Zona de distribucion: ");
        String area3 = scanner.nextLine();

        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion(nombre3, dni3, vac3, salario3, area3);
        scanner.close();

        System.out.println("\nInformacion de los empleados:");
        System.out.println(empleado1.toString());
        System.out.println();
        System.out.println(empleado2.toString());
        System.out.println();
        System.out.println(empleado3.toString());
    }
}
