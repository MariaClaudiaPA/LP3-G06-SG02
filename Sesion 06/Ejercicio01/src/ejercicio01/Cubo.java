package ejercicio01;

class Cubo extends FiguraTridimensional {
    double lado;

    Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    double obtenerArea() {
        return 6 * lado * lado;
    }
    @Override
    double obtenerVolumen() {
        return Math.pow(lado, 3);
    }
    
    @Override
    public String toString() {
        return "Cubo con lado --> " + lado;
    }
}
