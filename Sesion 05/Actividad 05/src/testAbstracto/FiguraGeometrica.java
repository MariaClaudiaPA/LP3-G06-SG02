package testAbstracto;

public abstract class FiguraGeometrica {

    private String nombre;

    abstract public double area();

    public FiguraGeometrica(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    final public boolean mayorQue(FiguraGeometrica otra) {
        return this.area() > otra.area();
    }

    final public String toString() {
        return this.nombre + " con area " + this.area();
    }
}
