package ejercicio03;

public class ExcepcionBlanco extends Exception {
    public ExcepcionBlanco() {
        super("Se ha ingresado un espacio en blanco.");
    }
}