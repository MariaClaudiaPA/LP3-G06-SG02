/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

public class Coordenada {
    private double  x;
    private double y;

    public Coordenada() {
        x = 0;
        y = 0;
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c) {
        x = c.x;
        y = c.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(c.x - x, 2) + Math.pow(c.y - y, 2));
    }

    public static double distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

