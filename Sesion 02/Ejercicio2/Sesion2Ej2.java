/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion2ej2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sesion2Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su sexo: ");
        char sexo = scanner.nextLine().charAt(0);

        System.out.print("Ingrese su dia de nacimiento: ");
        int diaN = scanner.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        int mesN = scanner.nextInt();

        System.out.print("Ingrese su anio de nacimiento: ");
        int anioN = scanner.nextInt();

        System.out.print("Ingrese la altura (en cm): ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el peso (en kg): ");
        double peso = scanner.nextDouble();

        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, diaN, mesN,anioN, altura, peso);

        System.out.println("\nInformación del Perfil Medico:");
        System.out.println("Nombre: " + perfil.getNombre() + " " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de nacimiento: " + perfil.getDiaNacimiento() + "/" + perfil.getMesN() + "/" + perfil.getAnioN());
        System.out.println("Altura: " + perfil.getAltura() + " cm");
        System.out.println("Peso: " + perfil.getPeso() + " kg");

        System.out.println("\nCalculos sobre el paciente");
        System.out.println("\nEdad: " + perfil.calcular_edad() + " anios");
        System.out.println("IMC: " + perfil.calcular_IMC());
        System.out.println("FCM: " + perfil.calcular_FCM() + " bpm");
    }
}
