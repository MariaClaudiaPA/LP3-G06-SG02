package ejercicio01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeerArchivoEmpleados {

    private static final String RUTA_ARCHIVO = "/ficheros/empleados.dat";

    public static ArrayList<Empleados> leerEmpleados() {
        ArrayList<Empleados> empleados = new ArrayList<>();
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCHIVO))) {
            Object obj = ois.readObject();
            if (obj instanceof ArrayList<?>) {
                empleados = (ArrayList<Empleados>) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error de lectura del archivo: " + e.getMessage());
        }
        return empleados;
    }

    public static void main(String[] args) {
        ArrayList<Empleados> listaEmpleados = leerEmpleados();
        for (Empleados empleado : listaEmpleados) {
            System.out.println(empleado);
        }
    }
}
