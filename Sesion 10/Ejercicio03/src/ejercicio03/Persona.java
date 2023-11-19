package ejercicio03;
import java.util.Objects;

public class Persona {

    private String dni;
    private String nombre;
    private int edad;

    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }
    // Implementaci�n del m�todo equals para comparar objetos Persona por la edad
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return edad == persona.edad;
    }
    // Tambi�n es recomendable implementar el m�todo hashCode cuando se implementa equals
    @Override
    public int hashCode() {
        return Objects.hash(edad);
    }
}
