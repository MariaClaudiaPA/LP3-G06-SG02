/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

public class Manejador {
    public static double area(Rectangulo rectangulo) {
        double base = rectangulo.getEsquina2().getX();
        double altura = rectangulo.getEsquina2().getY();
        return base * altura;
    }

    public static double perímetro(Rectangulo rectangulo) {
        double base = rectangulo.getEsquina2().getX();
        double altura = rectangulo.getEsquina2().getY();
        return 2 * (base + altura);
    }

    public static void moverX(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        esquina1.setX(esquina1.getX() + puntos);
        esquina2.setX(esquina2.getX() + puntos);
    }

    public static void moverY(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        esquina1.setY(esquina1.getY() + puntos);
        esquina2.setY(esquina2.getY() + puntos);
    }
}
