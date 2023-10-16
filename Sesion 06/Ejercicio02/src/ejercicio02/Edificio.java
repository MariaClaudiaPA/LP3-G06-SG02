package ejercicio02;

class Edificio implements ImpactoEcologico {

    private final double consumoCombustible;
    private final int numeroPersonas; // Atributo �nico para el c�lculo del DATO_ACTIVIDAD
    private final double factorDeEmision = 0.5; // Factor de emisi�n en GEI

    public Edificio(double consumoCombustible, int numeroPersonas) {
        this.consumoCombustible = consumoCombustible;
        this.numeroPersonas = numeroPersonas;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // F�rmula ficticia para el DATO_ACTIVIDAD
        double datoActividad = consumoCombustible * numeroPersonas / 1000;
        return datoActividad * factorDeEmision;
    }
}

