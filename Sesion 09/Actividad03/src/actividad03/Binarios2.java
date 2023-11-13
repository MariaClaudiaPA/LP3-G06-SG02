package actividad03;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binarios2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        
        double[][] matriz;
        int filas, columnas;
        do {
            System.out.print("Número de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);

        do {
            System.out.print("Número de columnas: ");
            columnas = sc.nextInt();
        } while (columnas <= 0);

        matriz = new double[filas][columnas]; // se crea la matriz

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) { // lectura de datos por teclado
                System.out.print("matriz[" + i + "][" + j + "]= ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        try {
            // crear el fichero de salida
            fos = new FileOutputStream("/ficheros/matriz.dat");
            salida = new DataOutputStream(fos);

            // escribir el número de filas y columnas en el fichero
            salida.writeInt(filas);
            salida.writeInt(columnas);

            // escribir la matriz en el fichero
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    salida.writeDouble(matriz[i][j]);
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
