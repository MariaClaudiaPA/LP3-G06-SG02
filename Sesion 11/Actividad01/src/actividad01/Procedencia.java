package actividad01;
import java.util.Objects;

public class Procedencia {

    private String departamento;
    private String provincia;

    public Procedencia(String departamento, String provincia) {
        this.departamento = departamento;
        this.provincia = provincia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Procedencia otraProcedencia = (Procedencia) obj;
        return Objects.equals(departamento, otraProcedencia.departamento);
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.departamento);
        return hash;
    }
}
