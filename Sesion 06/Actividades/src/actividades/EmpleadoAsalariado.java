package actividades;

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;
    // Constructor
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }

    // Métodos get y set para salarioSemanal
    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }
    // Método privado para establecer el Salario Semanal
    private void establecerSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    // Calcula los ingreso e implemente el método de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        return obtenerSalarioSemanal();
    }

    // Sobreescribir el método toString para mostrar la información del empleado asalariado
    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s %s\nNúmero de Seguro Social: %s\nSalario Semanal: $%,.2f",
            getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), obtenerSalarioSemanal());
    }
}
