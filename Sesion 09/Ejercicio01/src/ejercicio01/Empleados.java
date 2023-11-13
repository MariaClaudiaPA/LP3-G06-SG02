package ejercicio01;
import java.io.Serializable;

public class Empleados implements Serializable {
    private int numero;
    private String nombre;
    private double sueldo;

    public Empleados(int numero, String nombre, double sueldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public int getNumero() {
        return numero;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    @Override
    public String toString() {
        return String.format("%d,%s,%.2f", numero, nombre, sueldo);
    }
}
