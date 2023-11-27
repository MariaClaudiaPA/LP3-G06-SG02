package actividad01;
import java.util.Objects;

public class Estudiante extends Persona {

    private String especialidad;
    private Procedencia procedencia;
    
    public Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Estudiante other = (Estudiante) obj;
        return Objects.equals(super.getNombre(), other.getNombre())
                && Objects.equals(procedencia, other.procedencia);
    }
}
