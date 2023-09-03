/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");

        // Crear una instancia de la clase Fecha
        Fecha fecha = new Fecha();

        // Leer la fecha
        System.out.println("Fecha a elegir:");
        fecha.leer();

        fecha.larga();
        System.out.println("\nFecha ingresada:");

        // Mostrar la fecha en corto y largo
        fecha.corta();
        fecha.larga();

        // Verificar si el año es bisiesto
        boolean esBisiesto = fecha.bisiesto();

        if (esBisiesto) {
            System.out.println("\nEl anio ingresado es bisiesto.");
        } else {
            System.out.println("\nEl anio ingresado no es bisiesto.");
        }

        // Obtener el número de días de un mes
        int mes = fecha.getMes();
        System.out.println("\nDias en el mes " + mes + ": " + fecha.diasMes(mes));

        // Obtener el día, mes y anio utilizando getters
        int dia = fecha.getDia();
        mes = fecha.getMes();
        int anio = fecha.getAnio();
        System.out.println("\nDia: " + dia + ", Mes: " + mes + ", Anio: " + anio);

        // Calcular el número de días transcurridos desde 1-1-1900
        System.out.println("\nDias transcurridos desde 1-1-1900: " + fecha.diasTranscurridos());

        // Calcular el día de la semana
        System.out.println("\nDia de la semana: " + fecha.diaSemana());

        // Agregar días a la fecha utilizando fechaTras
        System.out.print("\nIngrese la cantidad de dias a agregar: ");
        long dias = scanner.nextLong();
        fecha.fechaTras(dias);
        System.out.println("\nNueva fecha despues de agregar " + dias + " dias:");
        fecha.corta();

        // Crear una instancia de otra Fecha para calcular los días entre ellas
        Fecha otraFecha = new Fecha(1, 2, 2000);
        int diasEntre = fecha.diasEntre(otraFecha);
        System.out.print("Ahora para comparar dias entre con otra fecha:\n");
        otraFecha.corta();
        System.out.println("Dias entre las dos fechas: " + diasEntre);
        System.out.println("Con la fecha despues de agregar " + dias + " dias");

        // Actualiza la fecha
        System.out.println("\nFecha actual:");
        fecha.larga();

        // Avanzar un día
        fecha.siguiente();
        System.out.println("\nFecha siguiente:");
        fecha.corta();

        // Retroceder un día
        fecha.anterior();
        System.out.println("\nFecha anterior:");
        fecha.corta();

        // Retroceder un día
        System.out.println("\nLa fecha ahora es:");
        fecha.larga();

    
        System.out.print("\nIngrese la cantidad de dias a agregar en el futuro: ");
        dias = scanner.nextLong();
        fecha.fechaFutura(dias);

        System.out.println("Fecha en el futuro:");
        fecha.corta();

        // Crear una copia de la fecha
        Fecha copiaFecha = fecha.copia();
        System.out.println("\nCopia de la fecha:");
        copiaFecha.corta();

        // Comparar fechas
        System.out.print("\nAhora para comparar las siguientes dos fechas:\n");
        otraFecha.larga();
        copiaFecha.larga();
        System.out.println("\nEs la fecha igual que?: " + Fecha.igualQue(otraFecha, copiaFecha));
        System.out.println("\nEs la fecha menor que?: " + Fecha.menorQue(otraFecha, copiaFecha));
        System.out.println("\nEs la fecha mayor que?: " + Fecha.mayorQue(otraFecha, copiaFecha));
    }
}

