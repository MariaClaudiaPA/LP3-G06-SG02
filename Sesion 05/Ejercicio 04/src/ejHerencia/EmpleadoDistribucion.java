package ejHerencia;

public class EmpleadoDistribucion extends Asalariado {

    private String zona;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase, String zona) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.zona = zona;
    }

    public String getZona() {
        return this.zona;
    }

    public void setZona(String nueva_zona) {
        this.zona = nueva_zona;
    }

    @Override
    public double calcularNomina() {
        // Incremento del 10% para empleados de distribución
        return getSalarioBase() * 1.10;
    }

    @Override
    public String toString() {
        return "Empleado de Distribucion\nDNI: " + getDni() + "\nNombre: " + getNombre()
                + "\nVacaciones: " + getDiasVacaciones() + " dias\nZona: " + this.zona
                + "\nSalario Base: " + getSalarioBase() + "\nSalario Total: " + calcularNomina();
    }
}
