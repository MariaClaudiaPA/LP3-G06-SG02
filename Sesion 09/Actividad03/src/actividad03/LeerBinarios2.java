package actividad03;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerBinarios2 {
    public static void main(String[] args) {
        try (DataInputStream entrada = new DataInputStream(new FileInputStream("/ficheros/matriz.dat"))) {
            // Leer el número de filas y columnas
            int filas = entrada.readInt();
            int columnas = entrada.readInt();
            // Crear una matriz para almacenar los números
            double[][] matriz = new double[filas][columnas];
            // Leer la matriz desde el archivo
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = entrada.readDouble();
                }
            }
            // Mostrar la matriz en la consola
            System.out.println("Matriz almacenada en el archivo 'matriz.dat':");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
