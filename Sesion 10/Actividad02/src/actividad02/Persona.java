package actividad02;

public class Persona implements Comparable<Persona>  {

    private String dni;
    private String nombres;
    private String direccion;

    public Persona(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return this.nombres.compareTo(otraPersona.nombres); //Comparacion por el nombre
    }


    @Override
    public String toString() {
        return "\nPersona: dni=" + dni + ", nombres= " + nombres  + ", direccion= " + direccion;
    }
}
