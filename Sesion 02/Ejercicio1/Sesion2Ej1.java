/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion2ej1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sesion2Ej1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular\n ");
        String titular = scanner.nextLine();

        double cantInicial = 0;
        System.out.print("Desea ingresar una cantidad inicial? Escriba SI o NO: ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("SI")) {
            System.out.print("Ingrese la cantidad inicial: ");
            cantInicial = scanner.nextDouble();
        } else {
            System.out.print("La cantidad iniciara en 0 ");
        }

        CuentaBanco cuenta;
        if (cantInicial > 0) {
            cuenta = new CuentaBanco(titular, cantInicial);
        } else {
            cuenta = new CuentaBanco(titular);
        }

        System.out.println("Datos de la cuenta\n");
        System.out.println(cuenta);

        int op;
        do {
            System.out.println("\n------------Menu----------:");
            System.out.println("1- Ingresar dinero");
            System.out.println("2- Retirar dinero");
            System.out.println("3- Mostrar saldo actual en la cuennta");
            System.out.println("4- Salir de la cuenta y cierra la aplicacion");
            System.out.print("Selecciona la opcion que quieras realizar \n");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese la cantidad que desea ingresar:\n ");
                    double cantidadIngresar = scanner.nextDouble();
                    cuenta.ingresar(cantidadIngresar);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad que desee retirar:\n");
                    double cantidadRetirar = scanner.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    System.out.println("Actualmente el saldo es:\n " + cuenta.getCantidad() + " soles");
                    break;
                case 4:
                    System.out.println("Ha salido de la aplicacion");
                    break;
                default:
                    System.out.println("Esa opcion no es valida, marque de nuevo\n");
            }
        } while (op != 4);
    }
}
