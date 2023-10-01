package testAsociacion;
public class Persona {

    private String dni;
    private String nombre;
    private char tipo;

    public Persona(String dni, String nombre, char tipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters y Setters para dni, nombre y tipo
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    // Método equals para comparar dos personas por DNI
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

    // Método toString para mostrar información de la persona
    @Override
    public String toString() {
        return "\nDNI: " + dni + "\nNombre: " + nombre + "\nTipo: " + tipo;
    }
}
