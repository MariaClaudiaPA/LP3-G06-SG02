package ejercicio02;
import java.util.ArrayList;
import java.util.Scanner;
public class AppEcologica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ImpactoEcologico> objetosEcologicos = new ArrayList<>();
        while (true) {
            System.out.println("\nElija una opcion:");
            System.out.println("1. Agregar un edificio");
            System.out.println("2. Agregar un auto");
            System.out.println("3. Agregar una bicicleta");
            System.out.println("4. Calcular impacto ecologico y mostrar resultados");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número de opcion:\n");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el consumo de combustible del edificio: ");
                    double consumoEdificio = scanner.nextDouble();
                    System.out.print("Ingrese el numero de personas en el edificio: ");
                    int personasEdificio = scanner.nextInt();
                    Edificio edificio = new Edificio(consumoEdificio, personasEdificio);
                    objetosEcologicos.add(edificio);
                    System.out.println("Edificio agregado.");
                    break;
                case 2:
                    System.out.print("\nIngrese el kilometraje del auto: ");
                    double kilometrajeAuto = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese el tipo de combustible (gasolina u otro): ");
                    String tipoCombustibleAuto = scanner.nextLine();
                    Auto auto = new Auto(kilometrajeAuto, tipoCombustibleAuto);
                    objetosEcologicos.add(auto);
                    System.out.println("Auto agregado.");
                    break;
                case 3:
                    System.out.print("\nIngrese la distancia recorrida en la bicicleta: ");
                    int distanciaBicicleta = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("¿La bicicleta es eléctrica? (true/false): ");
                    boolean esElectrica = scanner.nextBoolean();
                    Bicicleta bicicleta = new Bicicleta(distanciaBicicleta, esElectrica);
                    objetosEcologicos.add(bicicleta);
                    System.out.println("Bicicleta agregada.");
                    break;
                case 4:
                    // Calcular e imprimir el impacto ecológico de todos los objetos en el ArrayList
                    System.out.println("Resultados del impacto ecológico:");
                    for (ImpactoEcologico objeto : objetosEcologicos) {
                        if (objeto instanceof Edificio) {
                            double impactoEcologico = objeto.obtenerImpactoEcologico();
                            System.out.println("Edificio - Impacto ecológico: " + impactoEcologico + " GEI (Gases de Efecto Invernadero)");
                        } else if (objeto instanceof Auto) {
                            double impactoEcologico = objeto.obtenerImpactoEcologico();
                            System.out.println("Auto - Impacto ecológico: " + impactoEcologico + " GEI (Gases de Efecto Invernadero)");
                        } else if (objeto instanceof Bicicleta) {
                            double impactoEcologico = objeto.obtenerImpactoEcologico();
                            System.out.println("Bicicleta - Impacto ecológico: " + impactoEcologico + " GEI (Gases de Efecto Invernadero)");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no valida.");
            }
        }
    }
}
