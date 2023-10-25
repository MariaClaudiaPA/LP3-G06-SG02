package ejercicio03;

import java.io.IOException;

public class App {
    private LeerEntrada lector;

    public App(LeerEntrada lector) {
        this.lector = lector;
    }

    public void procesar(char caracter) throws IOException {
        boolean excepcion = false;

        try {
            if (Character.isDigit(caracter)) {
                throw new ExcepcionNumero();
            } else if (Character.isWhitespace(caracter)) {
                throw new ExcepcionBlanco();
            } else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                throw new ExcepcionVocal();
            } else if (caracter == 'q' || caracter == 'Q') {
                throw new ExcepcionSalida();
            }
        } catch (ExcepcionNumero e) {
            System.out.println("Error --> " + e.getMessage());
            excepcion = true;
        } catch (ExcepcionBlanco e) {
            System.out.println("Error --> " + e.getMessage());
            excepcion = true;
        } catch (ExcepcionVocal e) {
            System.out.println("Error --> " + e.getMessage());
            excepcion = true;
        } catch (ExcepcionSalida e) {
            System.out.println(e.getMessage() + " Fin del Programa ");
            System.exit(0);
        }

        if (!excepcion) {
            System.out.println("Caracter ingresado valido -> Ingrese un nuevo caracter:");
        }
    }

    public static void main(String[] args) {
        LeerEntrada lector = new LeerEntrada(System.in);
        App principal = new App(lector);

        System.out.println("El programa finaliza si ingresa q o Q:");
        System.out.println("Ingrese caracteres:");
        System.out.println("----------------------");

        boolean End = false;

        while (!End) {
            char caracter;

            try {
                caracter = lector.getChar();
                principal.procesar(caracter);
            } catch (IOException e) {
                System.err.println("Error de entrada/salida: " + e.getMessage());
            }
        }
    }
}

