package actividad06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial5 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;
        try {
            fos = new FileOutputStream("/ficheros/alumnos.dat");
            salida = new ObjectOutputStream(fos);

            f = new Fecha(5, 9, 2011);
            a = new Alumno("12345678", "Lucas Connalen", 20, f);
            salida.writeObject(a);

            f = new Fecha(7, 9, 2011);
            a = new Alumno("987654328", "Anacleto Jiménez", 19, f);
            salida.writeObject(a);

            f = new Fecha(8, 9, 2011);
            a = new Alumno("782342122", "Maria Zapata", 21, f);
            salida.writeObject(a);
            
            System.out.println("Información de alumnos guardada correctamente en el archivo.");
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) fos.close();
                if (salida != null) salida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
