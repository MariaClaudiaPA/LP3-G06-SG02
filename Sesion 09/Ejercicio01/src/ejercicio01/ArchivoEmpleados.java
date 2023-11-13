package ejercicio01;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ArchivoEmpleados {

    private static final String RUTA_ARCHIVO = "src/ejercicio01/empleados.dat";

    public static void agregarEmpleado(List<Empleados> listaEmpleados, Empleados empleado) {
        try ( ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(new RandomAccessFile(RUTA_ARCHIVO, "rw").getFD()))) {
            listaEmpleados.add(empleado);
            oos.writeObject(listaEmpleados);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar el empleado",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static List<Empleados> leerEmpleados() {
        List<Empleados> empleados = new ArrayList<>();

        try ( ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(new RandomAccessFile(RUTA_ARCHIVO, "r").getFD()))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof List) {
                        List<Empleados> listaEmpleados = (List<Empleados>) obj;
                        empleados.addAll(listaEmpleados);
                    } else if (obj instanceof Empleados) {
                        empleados.add((Empleados) obj);
                    }
                } catch (EOFException e) {
                    System.out.println("Se alcanzo el final del archivo: " + e.getMessage());
                    break;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo, se creará uno",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        return empleados;
    }
}
