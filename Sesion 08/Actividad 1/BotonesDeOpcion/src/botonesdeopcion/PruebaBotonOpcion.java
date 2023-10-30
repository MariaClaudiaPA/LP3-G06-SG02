package botonesdeopcion;
import javax.swing.JFrame;

public class PruebaBotonOpcion {

    public static void main(String[] args) {
        MarcoBotonOpcion marcoBotonOpcion = new MarcoBotonOpcion();
        marcoBotonOpcion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBotonOpcion.setSize(500, 120);
        marcoBotonOpcion.setVisible(true);
    }

}
