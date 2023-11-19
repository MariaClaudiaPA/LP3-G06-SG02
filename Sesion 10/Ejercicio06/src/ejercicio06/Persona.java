package ejercicio06;

public class Persona {
    String nombre;
    String dni;
    String direccion;

    Persona(String nombre, String dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return nombre.equals(persona.nombre) && dni.equals(persona.dni) 
                && direccion.equals(persona.direccion);
    }

    @Override
    public String toString() {
        return "Persona: Nombre= " + nombre + ", dni= " + dni + ", direccion= " + direccion + "\n";
    }
}