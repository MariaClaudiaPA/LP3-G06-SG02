/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String color;
    private static String[] colores = {"Verde", "Amarillo", "Rojo"};
    private static int colorIndex = 0;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        esquina1 = c1;
        esquina2 = c2;
        ColorSgte();
    }

    public Rectangulo(double base, double altura) {
        esquina1 = new Coordenada(0, 0);
        esquina2 = new Coordenada(base, altura);
        ColorSgte();
    }

    private void ColorSgte() {
        color = colores[colorIndex];
        colorIndex = (colorIndex + 1) % colores.length;
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public void setEsquina1(Coordenada c) {
        esquina1 = c;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina2(Coordenada c) {
        esquina2 = c;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Esquina Nro 1: " + esquina1 + ", Esquina Nro 2: " + esquina2 + ", Color --> " + color;
    }
}