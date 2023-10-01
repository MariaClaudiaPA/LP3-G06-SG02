package ejHerencia;

public class EmpleadoProduccion extends Asalariado {

    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, double salarioBase, String turno) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.turno = turno;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String nuevo_turno) {
        this.turno = nuevo_turno;
    }

    @Override
    public double calcularNomina() {
        // Incremento del 15% para empleados de producción
        return getSalarioBase() * 1.15;
    }

    @Override
    public String toString() {
        return "Empleado de Produccion\nDNI: " + getDni() + "\nNombre: " + getNombre()
                + "\nVacaciones: " + getDiasVacaciones() + " dias\nTurno: " + this.turno
                + "\nSalario Base: " + getSalarioBase() + "\nSalario Total: " + calcularNomina();
    }
}
