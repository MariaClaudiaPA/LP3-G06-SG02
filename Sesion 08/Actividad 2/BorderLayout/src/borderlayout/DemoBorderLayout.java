package borderlayout;
import javax.swing.JFrame;

public class DemoBorderLayout {
    public static void main(String[] args) {
        MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();
        marcoBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBorderLayout.setSize(600, 200);
        marcoBorderLayout.setVisible(true);
    }
}
