package actividades;

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;
    // Constructor
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }

    // M�todos get y set para salarioSemanal
    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }
    // M�todo privado para establecer el Salario Semanal
    private void establecerSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    // Calcula los ingreso e implemente el m�todo de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        return obtenerSalarioSemanal();
    }

    // Sobreescribir el m�todo toString para mostrar la informaci�n del empleado asalariado
    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s %s\nN�mero de Seguro Social: %s\nSalario Semanal: $%,.2f",
            getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), obtenerSalarioSemanal());
    }
}
