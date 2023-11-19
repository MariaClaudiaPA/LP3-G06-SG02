package ejercicio04;
import java.util.Scanner;

public class AppMG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Producto[] productos = {
            new Producto(0001, "Peras", 10.99),
            new Producto(0002, "Manzanas", 20.50),
            new Producto(0003, "Sandías", 15.75)
        };

        Persona[] personas = {
            new Persona("78965231", "Julian", "Av Dolores"),
            new Persona("87654321", "Andrea", "San Martín")
        };

        Estudiante[] estudiantes = {
            new Estudiante("98765432", "Carlos", "Cayma", "Sistemas"),
            new Estudiante("23456789", "Miguel", "Miraflores", "Medicina")
        };

        while (true) {
            System.out.println("Seleccione el tipo de búsqueda:");
            System.out.println("1. Búsqueda de Producto por código");
            System.out.println("2. Búsqueda de Persona por nombres");
            System.out.println("3. Búsqueda de Estudiante por nombres y carrera");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el código del producto a buscar:");
                    int codigoProducto = scanner.nextInt();
                    int indiceProducto = buscarElemento(productos, new Producto
                                (codigoProducto, "", 0), "codigo");
                    System.out.println("Producto encontrado en la posición: " + indiceProducto + " \n");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la persona a buscar:");
                    String nombresPersona = scanner.nextLine();
                    int indicePersona = buscarElemento(personas, new Persona
                                ("", nombresPersona, ""), "nombres");
                    System.out.println("Persona encontrada en la posición: " + indicePersona + " \n");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del estudiante a buscar:");
                    String nombresEstudiante = scanner.nextLine();
                    System.out.println("Ingrese la carrera del estudiante a buscar:");
                    String carreraEstudiante = scanner.nextLine();
                    int indiceEstudiante = buscarElemento(estudiantes, new Estudiante
                                ("", nombresEstudiante, "", carreraEstudiante), "nombres_carrera");
                    System.out.println("Estudiante encontrado en la posición: " + indiceEstudiante + " \n");
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida, ingresa de nuevo");
            }
        }
    }

    public static <T> int buscarElemento(T[] array, T busq, String atributo) {
        for (int i = 0; i < array.length; i++) {
            if (atributo.equals("codigo") && array[i] instanceof Producto) {
                if (((Producto) array[i]).getCodigo() == ((Producto) busq).getCodigo()) {
                    return i;
                }
            } else if (atributo.equals("nombres") && array[i] instanceof Persona) {
                if (((Persona) array[i]).getNombres().equals(((Persona) busq).getNombres())) {
                    return i;
                }
            } else if (atributo.equals("nombres_carrera") && array[i] instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) array[i];
                if (estudiante.getNombres().equals(((Estudiante) busq).getNombres())
                        && estudiante.getCarrera().equals(((Estudiante) busq).getCarrera())) {
                    return i;
                }
            }
        }
        return -1;
    }
}
