package actividad02;

public class Persona {

    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "[Persona: Nombre = " + nombre + ", Direccion = " + direccion + ", Telefono = " + telefono + "]";
    }
}
