package actividad06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerAlumno {
    public static void main(String[] args) {
        try ( FileInputStream fileIn = new FileInputStream("/ficheros/alumnos.dat");  
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            while (fileIn.available() > 0) {
                Alumno a = (Alumno) objectIn.readObject();
                mostrarInformacionAlumno(a);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void mostrarInformacionAlumno(Alumno a) {
        System.out.println("NIF: " + a.getNif());
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Fecha de Matrícula: " + obtenerFechaFormateada(a.getFechaMatricula()));
        System.out.println();
    }
    private static String obtenerFechaFormateada(Fecha fecha) {
        return String.format("%02d/%02d/%04d", fecha.getDia(), fecha.getMes(), fecha.getAño());
    }
}

