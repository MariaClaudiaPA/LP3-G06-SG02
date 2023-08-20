import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = 25;
        int vidas = 5;
        
        System.out.println("¡Bienvenido al juego de adivina el numero!");
        while (vidas > 0) {
            System.out.printf("Tienes %d %s. Introduce tu suposicion: ", vidas, (vidas == 1) ? "vida" : "vidas");
            int suposicion = scanner.nextInt();
            
            if (suposicion == numeroAdivinar) {
                String premio = determinarPremio(vidas);
                System.out.println("Has adivinado el numero y ganaste un " + premio + "!");
                break;
            } else {
                System.out.println("Incorrecto. El numero no es " + suposicion + ".");
                vidas--;
            }
        }
        
        if (vidas == 0) {
            System.out.println("Se te acabaron las vidas. - Sigue intentando.");
        }
        
        scanner.close();
    }
    
    public static String determinarPremio(int vidas) {
        if (vidas >= 4) {
            return "Premio Grande";
        } else if (vidas >= 2) {
            return "Premio mediano";
        } else {
            return "Pequeño premio";
        }
    }
}