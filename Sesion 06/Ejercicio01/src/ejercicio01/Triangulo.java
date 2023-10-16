package ejercicio01;

class Triangulo extends FiguraBidimensional {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double obtenerArea() {
        return 0.5 * base * altura;
    }
    

    @Override
    public String toString() {
        return "Triángulo con base y altura --> ("  + base + ") ; (" + altura + ")";
    }  
}

