package listas;
// Selección de colores de un objeto JList.
import javax.swing.JFrame;

public class PruebaLista {
    public static void main(String[] args) {
        MarcoLista marcoLista = new MarcoLista(); // crea objeto MarcoLista
        marcoLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoLista.setSize(500, 150);
        marcoLista.setVisible(true);
    }
}
