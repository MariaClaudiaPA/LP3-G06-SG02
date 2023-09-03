/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;

public class Principal {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer punto:");
        System.out.println("Ingrese la coordenada para x:");
        double x1 = scanner.nextDouble();
        System.out.println("Ingrese la coordenada para y:");
        double y1 = scanner.nextDouble();
        Coordenada c1 = new Coordenada(x1, y1);
        System.out.println("..............................................................................");
        
        System.out.println("Segundo punto:");
        System.out.println("Ingrese la coordenada para x:");
        double x2 = scanner.nextDouble();
        System.out.println("Ingrese la coordenada para y:");
        double y2 = scanner.nextDouble();
        Coordenada c2 = new Coordenada(x2, y2);
        
        System.out.println("..............................................................................");
        System.out.println("Ingrese la base del primer rectangulo:");
        double baseRectangulo1 = scanner.nextDouble();
        System.out.println("Ingrese la altura del primer rectangulo:");
        double alturaRectangulo1 = scanner.nextDouble();
        System.out.println("..............................................................................");
        System.out.println("Ingrese la base del segundo rectangulo:");
        double baseRectangulo2 = scanner.nextDouble();
        System.out.println("Ingrese la altura del segundo rectangulo:");
        double alturaRectangulo2 = scanner.nextDouble();
        
        scanner.close(); 
        System.out.println(".............................................................................."); 
        System.out.println("La Distancia de los puntos es: " + Coordenada.distancia(c1, c2));
        System.out.println("..............................................................................");

        Rectangulo rectangulo1 = new Rectangulo(baseRectangulo1, alturaRectangulo1);
        Rectangulo rectangulo2 = new Rectangulo(baseRectangulo2, alturaRectangulo2);
        Rectangulo rectangulo3 = new Rectangulo(baseRectangulo1, alturaRectangulo1);
        Rectangulo rectangulo4 = new Rectangulo(baseRectangulo2, alturaRectangulo2);

        System.out.println("Color del primer rectangulo: " + rectangulo1.getColor());
        System.out.println("Color del segundo rectangulo: " + rectangulo2.getColor());
        System.out.println("Color del tercer rectangulo: " + rectangulo3.getColor());
        System.out.println("Color del cuarto rectangulo: " + rectangulo4.getColor());

        
        
        System.out.println(rectangulo1);
        System.out.println(rectangulo2);
        System.out.println("..............................................................................");
        System.out.println("El area del primer rectangulo es: " + Manejador.area(rectangulo1));
        System.out.println("El perimetro del primer rectangulo es: " + Manejador.perímetro(rectangulo1));
        System.out.println("..............................................................................");
       
        System.out.println("El area del segundo rectangulo es: " + Manejador.area(rectangulo2));
        System.out.println("El perimetro del segundo rectangulo es: " + Manejador.perímetro(rectangulo2));
        System.out.println("..............................................................................");

        Manejador.moverX(rectangulo1, 3);
        Manejador.moverY(rectangulo2, 2);

        System.out.println(rectangulo1);
        System.out.println(rectangulo2);
    }
    
}
