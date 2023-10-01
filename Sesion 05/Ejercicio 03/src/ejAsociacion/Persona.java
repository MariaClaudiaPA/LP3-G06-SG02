package ejAsociacion;

public class Persona {

    private String dni;
    private String nombre;
    private char tipo;

    public Persona(String dni, String nombre, char tipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public char getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return dni.equals(persona.dni);
    }

    @Override
    public String toString() {
        return "\nDNI: " + dni + "\nNombre: " + nombre + "\nTipo: " + tipo;
    }
}
