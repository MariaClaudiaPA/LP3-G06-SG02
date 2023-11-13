package actividad04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TestFilePrueba {
    public static void main(String[] args) {
        FileInputStream file = null;
        byte[] buffer = new byte[2048];

        try {
            file = new FileInputStream("/LP306/Actividad04/src/actividad04/TestFile.java");
            file.read(buffer);
            String s = new String(buffer);
            
            ViewFile view = new ViewFile(s);
            view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            view.setSize(550, 700);
            view.setVisible(true);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class ViewFile extends JFrame {
    private JTextArea areaTexto;

    public ViewFile(String s) {
        super("Mostrando el contenido de un archivo - María Panclas - Kevin Paredes");
        areaTexto = new JTextArea(s, 5,40);
        add(areaTexto);
    }
}
