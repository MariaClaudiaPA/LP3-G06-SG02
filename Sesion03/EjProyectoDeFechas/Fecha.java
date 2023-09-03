/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
    
    private void valida() {
        if (dia < 1 || dia > 31) {
            dia = 1;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
    }    
    
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar un dia de 1 a 31: ");
        dia = scanner.nextInt();
        System.out.print("Ingresar el mes del 1 al 12: ");
        mes = scanner.nextInt();
        System.out.print("Ingresar el anio de 1900 a 2050: ");
        anio = scanner.nextInt();
        valida();
    }
    
    public boolean bisiesto() {
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if (esBisiesto) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
        return esBisiesto;
    }

    
    public int diasMes(int mes) {
        return switch (mes) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> bisiesto() ? 29 : 28;
            default -> 31;
        };
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        valida();
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
        valida();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
        valida();
    }   
    
    public void corta() {
        System.out.printf("Fecha en corto: %02d-%02d-%04d\n", dia, mes, anio);
    }
    
    public int diasTranscurridos() {
        int tDias = 0;
        boolean esBisiesto = bisiesto(); 
        for (int i = 1900; i < anio; i++) {
            tDias += esBisiesto ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            tDias += diasMes(i);
        }
        tDias += dia - 1;
        return tDias;
    }
    
    public int diaSemana() {
        int diasTranscurridos = diasTranscurridos();
        int numeroDia = (diasTranscurridos + 1) % 7;
        System.out.print("Dia de la semana: ");
        switch (numeroDia) {
            case 0 -> System.out.println("Domingo");
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
        }
        return numeroDia;
    }
    
    public void larga() {
        String[] nombresDias = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
        String nombreDia = nombresDias[diaSemana()];
        System.out.printf("Fecha en largo: %s %d de %s de %d\n", nombreDia, dia, nombreMes(), anio);
    }
    private String nombreMes() {
        String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
                "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return nombresMeses[mes - 1];
    }

    public void fechaTras(long dias) {
        int diasTranscurridos = diasTranscurridos() + (int) dias;
        int anios = 1900;
        boolean esBisiesto = bisiesto(); 
        while (diasTranscurridos >= (esBisiesto ? 366 : 365)) {
            diasTranscurridos -= esBisiesto ? 366 : 365;
            anios++;
        }
        anio = anios;
        int mes = 1;

        while (diasTranscurridos >= diasMes(mes)) {
            diasTranscurridos -= diasMes(mes);
            mes++;
        }

        this.mes = mes;
        dia = diasTranscurridos + 1;
    }

    
    public int diasEntre(Fecha otraFecha) {
        int dias1 = this.diasTranscurridos();
        int dias2 = otraFecha.diasTranscurridos();
        return Math.abs(dias1 - dias2);
    }
    
    public void siguiente() {
        dia++;
        if (dia > diasMes(mes)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
    }


    public void anterior() {
       dia -= 2; 
       if (dia < 1) {
           mes--;
           if (mes < 1) {
               mes = 12;
               anio--;
           }
           dia = diasMes(mes) + dia; 
       }
   }
    
    public void fechaFutura(long dias) {
        int diasTranscurridos = diasTranscurridos() + (int) dias;
        int anios = 1900;
        boolean esBisiesto = bisiesto(); 
        while (diasTranscurridos >= (esBisiesto ? 366 : 365)) {
            diasTranscurridos -= esBisiesto ? 366 : 365;
            anios++;
        }
        anio = anios;
        int mes = 1;
        while (diasTranscurridos >= diasMes(mes)) {
            diasTranscurridos -= diasMes(mes);
            mes++;
        }
        this.mes = mes;
        dia = diasTranscurridos + 1;
    }

    public Fecha copia() {
        return new Fecha(dia, mes, anio);
    }
    
    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio;
    }

    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio < fecha2.anio || 
            (fecha1.anio == fecha2.anio && fecha1.mes < fecha2.mes) || 
            (fecha1.anio == fecha2.anio && fecha1.mes == fecha2.mes && fecha1.dia < fecha2.dia)) {
            return true;
        } else if (fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio) {
            return false; // Las fechas son iguales
        } else {
            return false; // Fecha1 es mayor que Fecha2
        }
    }

    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio > fecha2.anio || 
            (fecha1.anio == fecha2.anio && fecha1.mes > fecha2.mes) || 
            (fecha1.anio == fecha2.anio && fecha1.mes == fecha2.mes && fecha1.dia > fecha2.dia)) {
            return true;
        } else if (fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio) {
            return false; // Las fechas son iguales
        } else {
            return false; // Fecha1 es menor que Fecha2
        }
    }
}
