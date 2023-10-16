package ejercicio01;

class Cuadrado extends FiguraBidimensional {
    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double obtenerArea() {
        return lado * lado;
    }
    
    @Override
    public String toString() {
        return "Cuadrado con lado --> " + lado;
    }
}

