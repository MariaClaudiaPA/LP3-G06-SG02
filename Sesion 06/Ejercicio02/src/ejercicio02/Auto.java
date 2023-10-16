package ejercicio02;

class Auto implements ImpactoEcologico {

    private final double kilometraje;
    private final String tipoCombustible; // Atributo �nico para el c�lculo del DATO_ACTIVIDAD
    private final double factorDeEmision = 0.3; // Factor de emisi�n en GEI

    public Auto(double kilometraje, String tipoCombustible) {
        this.kilometraje = kilometraje;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // F�rmula ficticia para el DATO_ACTIVIDAD
        double datoActividad = (kilometraje / 100) * (tipoCombustible.equals("gasolina") ? 2 : 1);
        return datoActividad * factorDeEmision;
    }
}
