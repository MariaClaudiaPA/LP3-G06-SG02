package ejercicio01;

class Esfera extends FiguraTridimensional {
    double radio;

    Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }
    @Override
    double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
    
    @Override
    public String toString() {
        return "Esfera con radio --> " + radio;
    }
}
