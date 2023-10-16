package ejercicio02;

class Auto implements ImpactoEcologico {

    private final double kilometraje;
    private final String tipoCombustible; // Atributo único para el cálculo del DATO_ACTIVIDAD
    private final double factorDeEmision = 0.3; // Factor de emisión en GEI

    public Auto(double kilometraje, String tipoCombustible) {
        this.kilometraje = kilometraje;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para el DATO_ACTIVIDAD
        double datoActividad = (kilometraje / 100) * (tipoCombustible.equals("gasolina") ? 2 : 1);
        return datoActividad * factorDeEmision;
    }
}
