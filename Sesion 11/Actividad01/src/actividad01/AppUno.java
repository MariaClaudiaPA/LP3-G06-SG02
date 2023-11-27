package actividad01;
import java.util.Scanner;

public class AppUno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Persona[] personas = {
            new Persona("Juan", "Miraflores", "923456789"),
            new Persona("Alicia", "Paucarpata", "987654321")
        };
        Goodies[] goodies = {
            new Goodies(1, "Golosina", 10.5f),
            new Goodies(2, "Chocolate", 20.0f)
        };
        Procedencia procedencia1 = new Procedencia("Arequipa", "Arequipa");
        Procedencia procedencia2 = new Procedencia("Lima", "Lima");
        Estudiante[] estudiantes = {
            new Estudiante("Carlos", "Santa Marta", "936582147", "Informatica", procedencia1),
            new Estudiante("Ana", "Cayma", "987456231", "Fisica", procedencia2)
        };

        System.out.print("Ingrese el nombre a verificar en personas: ");
        String nombrePersona = scanner.nextLine();
        Verificadora<Persona> verificadoraPersonas = new Verificadora<>(personas);
        System.out.println("¿" + nombrePersona + " está en personas? "
                + verificadoraPersonas.contiene(new Persona(nombrePersona, "", "")));

        System.out.print("Ingrese el número de item a verificar en goodies: ");
        int numeroItem = scanner.nextInt();
        Verificadora<Goodies> verificadoraGoodies = new Verificadora<>(goodies);
        System.out.println("¿Item " + numeroItem + " está en goodies? "
                + verificadoraGoodies.contiene(new Goodies(numeroItem, "", 0.0f)));
        scanner.nextLine();
        
        System.out.print("Ingrese el nombre a verificar en estudiantes: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la ciudad de procedencia del estudiante: ");
        String ciudadEstudiante = scanner.nextLine();
        
        Verificadora<Estudiante> verificadoraEstudiantes = new Verificadora<>(estudiantes);
        Estudiante estudianteBuscado = new Estudiante(nombreEstudiante, "", "", "", new Procedencia(ciudadEstudiante, ""));
        System.out.println("¿" + nombreEstudiante + " de " + ciudadEstudiante + " está en estudiantes? "
                + verificadoraEstudiantes.contiene(estudianteBuscado));
        scanner.close();
    }
}
