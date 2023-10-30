package cuadroscombinados;
import javax.swing.JFrame;

public class PruebaCuadroCombinado {

    public static void main(String[] args) {
        MarcoCuadroCombinado marcoCuadroCombinado = new MarcoCuadroCombinado();
        marcoCuadroCombinado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoCuadroCombinado.setSize(500, 150);
        marcoCuadroCombinado.setVisible(true);
    }
}

