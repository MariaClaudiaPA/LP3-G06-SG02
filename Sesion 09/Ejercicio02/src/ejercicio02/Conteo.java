package ejercicio02;

public class Conteo {

    private final int lineas;
    private final int palabras;
    private final int caracteres;
    private String archivo;

    public Conteo(int lineas, int palabras, int caracteres) {
        this.lineas = lineas;
        this.palabras = palabras;
        this.caracteres = caracteres;
    }

    public int getLineas() {
        return lineas;
    }

    public int getPalabras() {
        return palabras;
    }

    public int getCaracteres() {
        return caracteres;
    }

}
