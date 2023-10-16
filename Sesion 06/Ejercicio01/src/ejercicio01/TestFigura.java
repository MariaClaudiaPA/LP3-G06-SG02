package ejercicio01;
import java.util.Scanner;
public class TestFigura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio Nro 1 --> Jerarquia de Figuras:");
        Figura[] figuras = new Figura[6];
        System.out.println("Ingrese los valores para cada figura (puede cambiarlos si desea)");
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("------------------------------------------------");
            System.out.println("Ingrese la figura #" + i + ":");
            System.out.println("[1] <- Circulo");
            System.out.println("[2] <- Cuadrado");
            System.out.println("[3] <- Triangulo");
            System.out.println("[4] <- Esfera");
            System.out.println("[5] <- Cubo");
            System.out.println("[6] <- Tetraedro");
            System.out.println("------------------------------------------------");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    figuras[i] = new Circulo(radio);
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    figuras[i] = new Cuadrado(lado);
                    break;
                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    figuras[i] = new Triangulo(base, altura);
                    break;
                case 4:
                    System.out.print("Ingrese el radio de la esfera: ");
                    double radioEsfera = scanner.nextDouble();
                    figuras[i] = new Esfera(radioEsfera);
                    break;
                case 5:
                    System.out.print("Ingrese el lado del cubo: ");
                    double ladoCubo = scanner.nextDouble();
                    figuras[i] = new Cubo(ladoCubo);
                    break;
                case 6:
                    System.out.print("Ingrese la arista del tetraedro: ");
                    double aristaTetraedro = scanner.nextDouble();
                    figuras[i] = new Tetraedro(aristaTetraedro);
                    break;
                default:
                    System.out.println("Opción INVALIDA");
                    i--;
                    break;
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("Resultados de las figuras:");

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura[" + i + "]: " + figuras[i]);

            if (figuras[i] instanceof FiguraBidimensional figuraBidimensional) {
                System.out.println("----> Es una figura bidimensional");
                System.out.println("--> Área de la figura: " + figuraBidimensional.obtenerArea());
                System.out.println("------------------------------------------------");
            } else if (figuras[i] instanceof FiguraTridimensional) {
                System.out.println("----> Es una figura tridimensional");
                System.out.println("--> Área superficial: " + ((FiguraTridimensional) figuras[i]).obtenerArea());
                System.out.println("Volumen de la figura: " + ((FiguraTridimensional) figuras[i]).obtenerVolumen());
                System.out.println("------------------------------------------------");
            }
            System.out.println();
        }
    }

}
