package ejercicio02;

class Bicicleta implements ImpactoEcologico {

    private final int distanciaRecorrida;
    private final boolean esElectrica; // Atributo único para el cálculo del DATO_ACTIVIDAD
    private final double factorDeEmision = 0.05; // Factor de emisión en GEI

    public Bicicleta(int distanciaRecorrida, boolean esElectrica) {
        this.distanciaRecorrida = distanciaRecorrida;
        this.esElectrica = esElectrica;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para el DATO_ACTIVIDAD
        double datoActividad = distanciaRecorrida / (esElectrica ? 3 : 1);
        return datoActividad * factorDeEmision;
    }
}
