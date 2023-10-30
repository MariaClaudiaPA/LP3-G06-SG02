package gridlayout;
import javax.swing.JFrame;
// Prueba de MarcoGridLayout.
public class DemoGridLayout {
    public static void main(String[] args) {
        MarcoGridLayout marcoGridLayout = new MarcoGridLayout();
        marcoGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoGridLayout.setSize(600, 200);
        marcoGridLayout.setVisible(true);
    }
}

