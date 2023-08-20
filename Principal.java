import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = 25;
        int vidas = 5;
        
        System.out.println("¡Bienvenido al juego de adivina el numero!");
        while (vidas > 0) {
            System.out.printf("Tienes %d %s. Ingresa el numero que supones: ", vidas, (vidas == 1) ? "vida" : "vidas");
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
            System.out.println("Se te acabaron las vidas. Vuelve a intentar.");
        }
        
        scanner.close();
    }
    
    public static String determinarPremio(int vidas) {
        if (vidas >= 4) {
<<<<<<< HEAD
            return "Premio Grande";
=======
            return "Recibes un premio mayor";
>>>>>>> rama2
        } else if (vidas >= 2) {
            return "Recibes un premio mayor";
        } else {
<<<<<<< HEAD
            return "Pequeño premio";
=======
            return "Recibes un premio mayor;
>>>>>>> rama2
        }
    }
}