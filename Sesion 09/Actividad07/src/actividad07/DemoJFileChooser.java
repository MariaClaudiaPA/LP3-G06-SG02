package actividad07;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.*;

public class DemoJFileChooser extends JFrame {

    private final JTextArea areaSalida;

    public DemoJFileChooser() throws IOException {
        super("Demo de FileChooser");
        areaSalida = new JTextArea();
        add(new JScrollPane(areaSalida)); // JScrollPane para areaSalida con desplazamiento
        analizarRuta(); // Obtener la ruta del usuario y mostrar información
    }

    public void analizarRuta() throws IOException {
        // Crear un objeto Path con la ruta seleccionada por el usuario
        Path ruta = obtenerRutaArchivoDirectorio();

        if (ruta != null && Files.exists(ruta)) {
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("Nombre del archivo o directorio: %s%n", ruta.getFileName()));
            builder.append(String.format("¿Es un directorio? %s%n", Files.isDirectory(ruta) ? "Sí" : "No"));
            builder.append(String.format("¿Es una ruta absoluta? %s%n", ruta.isAbsolute() ? "Sí" : "No"));
            builder.append(String.format("Última modificación: %s%n", Files.getLastModifiedTime(ruta)));
            builder.append(String.format("Tamaño: %s bytes%n", Files.size(ruta)));
            builder.append(String.format("Ruta: %s%n", ruta));
            builder.append(String.format("Ruta absoluta: %s%n", ruta.toAbsolutePath()));

            if (Files.isDirectory(ruta)) {
                builder.append("Contenido del directorio:\n");
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);
                for (Path entrada : flujoDirectorio) {
                    builder.append(String.format("%s%n", entrada.getFileName()));
                }
            }
            areaSalida.setText(builder.toString()); // Mostrar el contenido del StringBuilder en el JTextArea
        } else {
            JOptionPane.showMessageDialog(this, "El archivo o directorio no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Path obtenerRutaArchivoDirectorio() {
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = selectorArchivos.showOpenDialog(this);

        if (resultado == JFileChooser.CANCEL_OPTION) {
            System.exit(1); // Salir de la aplicación si el usuario hace clic en Cancelar
        }

        // Devolver el objeto Path que representa el archivo o directorio seleccionado
        return selectorArchivos.getSelectedFile().toPath();
    }
}
