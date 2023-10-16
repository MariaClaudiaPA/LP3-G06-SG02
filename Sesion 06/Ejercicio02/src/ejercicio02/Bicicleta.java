package ejercicio02;

class Bicicleta implements ImpactoEcologico {

    private final int distanciaRecorrida;
    private final boolean esElectrica; // Atributo �nico para el c�lculo del DATO_ACTIVIDAD
    private final double factorDeEmision = 0.05; // Factor de emisi�n en GEI

    public Bicicleta(int distanciaRecorrida, boolean esElectrica) {
        this.distanciaRecorrida = distanciaRecorrida;
        this.esElectrica = esElectrica;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // F�rmula ficticia para el DATO_ACTIVIDAD
        double datoActividad = distanciaRecorrida / (esElectrica ? 3 : 1);
        return datoActividad * factorDeEmision;
    }
}
