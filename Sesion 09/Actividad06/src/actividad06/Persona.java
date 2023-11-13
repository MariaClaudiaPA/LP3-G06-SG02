package actividad06;

import java.io.Serializable;

public class Persona implements Serializable{

    protected String nif;
    protected String nombre;
    protected int edad;

    public Persona(String nif, String nombre, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
