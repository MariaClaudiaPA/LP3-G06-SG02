package ejHerencia;

public class Asalariado {

    private String nombre;
    private long dni;
    private int diasVacaciones;
    private double salarioBase;

    public Asalariado(String nombre, long dni, int diasVacaciones, double salarioBase) {
        this.nombre = nombre;
        this.diasVacaciones = diasVacaciones;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevo_nombre) {
        this.nombre = nuevo_nombre;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long nuevo_dni) {
        this.dni = nuevo_dni;
    }

    public int getDiasVacaciones() {
        return this.diasVacaciones;
    }

    public void setDiasVacaciones(int nuevo_diasVacaciones) {
        this.diasVacaciones = nuevo_diasVacaciones;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double nuevo_salarioBase) {
        this.salarioBase = nuevo_salarioBase;
    }

    public double calcularNomina() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "\nEmpleado Asalariado\nDNI: " + this.dni + "\nNombre: " + this.nombre
                + "\nVacaciones: " + this.diasVacaciones + " dias\nSalario Base: " + this.salarioBase;
    }
}
