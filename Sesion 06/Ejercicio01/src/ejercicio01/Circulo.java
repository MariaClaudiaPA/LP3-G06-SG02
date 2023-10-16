package ejercicio01;

class Circulo extends FiguraBidimensional {
    double radio;
    final String color = "Rojo";

    Circulo(double radio) {
        this.radio = radio;
    }
   
    String obtenerColor() {
        return color;
    }
    @Override
    double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Círculo con radio --> " + radio;
    }
}


