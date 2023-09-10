/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        boolean rellenado = false;

        do {
            System.out.println("MENU----------------------");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Calcular la media de la matriz");
            System.out.println("7. Salir");
            System.out.println("Elegir una opcion del 1 al 7");
            int opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        int fila;
                        do {
                            System.out.println("Elige una fila (entre 0 y 3)");
                            fila = sn.nextInt();
                            if (fila < 0 || fila > 3) {
                                System.out.println("Fila fuera de rango. Debe estar entre 0 y 3.");
                            }
                        } while (fila < 0 || fila > 3); 
                        System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        int columna;
                        do {
                            System.out.println("Elige una columna (entre 0 y 3)");
                            columna = sn.nextInt();
                            if (columna < 0 || columna > 3) {
                                System.out.println("Columna fuera de rango. Debe estar entre 0 y 3.");
                            }
                        } while (columna < 0 || columna > 3); 
                        System.out.println("La suma de los valores de la columna " + columna + " es: " + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    if (rellenado) {
                        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal(matriz));
                    } else {
                        System.out.println("Rellena la matriz primero");
                    }
                    break;
                case 5:
                    if (rellenado) {
                        System.out.println("Suma de la diagonal inversa: " + sumaDiagonalInversa(matriz));
                    } else {
                        System.out.println("Rellena la matriz primero");
                    }
                    break;
                case 6:
                    if (rellenado) {
                        double media = calcularMedia(matriz);
                        System.out.println("La media de todos los valores de la matriz es: " + media);
                    } else {
                        System.out.println("Rellena la matriz primero");
                    }
                    break;
                case 7:
                    System.out.println("Acaba el programa. Adios");
                    return;
                default:
                    System.out.println("Tienes que poner un valor entre 1 y 7, por favor");
            }
        } while (true);
    }

    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion: (" + i + " " + j + ")" );
                matriz[i][j] = sn.nextInt();
            }
        }
    }

    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static int sumaDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static int sumaDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }

    public static double calcularMedia(int[][] matriz) {
        double suma = 0;
        int elementos = matriz.length * matriz[0].length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma / elementos;
    }
}
