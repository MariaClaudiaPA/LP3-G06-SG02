package ejercicio01;

class Tetraedro extends FiguraTridimensional {
    double arista;
    final String aplicacion = "EGYPTO";

    Tetraedro(double arista) {
        this.arista = arista;
    }
    
    String obtenerAplicacion() {
        return aplicacion;
    }
    @Override
    double obtenerArea() {
        return Math.sqrt(3) * arista * arista;
    }
    @Override
    double obtenerVolumen() {
        return (Math.pow(arista, 3)) / (6 * Math.sqrt(2));
    }
    
    @Override
    public String toString() {
        return "Tetraedro con arista --> " + arista;
    }    
}
