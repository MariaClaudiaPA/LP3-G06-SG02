package testAbstracto;

public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(double largo, double ancho) {
        super("Rectangulo");
        this.base = largo;
        this.altura = ancho;
    }

    public double area() {
        return this.base * this.altura;
    }
}
