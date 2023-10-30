package borderlayout;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoBorderLayout extends JFrame implements ActionListener {
    private final JButton botones[];  // arreglo de botones para ocultar porciones
    private static final String nombres[] = { "Ocultar Norte", "Ocultar Sur", "Ocultar Este", "Ocultar Oeste", "Ocultar Centro" };
    private final BorderLayout esquema;

    public MarcoBorderLayout() {
        super("Demostracion de BorderLayout - (María Panclas - Kevin Paredes)");

        esquema = new BorderLayout(5, 5); // Crea un BorderLayout con espacios de 5 píxeles
        setLayout(esquema);
        botones = new JButton[nombres.length];

        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }

        // Agrega los botones a las distintas regiones del BorderLayout
        add(botones[0], BorderLayout.NORTH); // Región Norte
        add(botones[1], BorderLayout.SOUTH); // Región Sur
        add(botones[2], BorderLayout.EAST);  // Región Este
        add(botones[3], BorderLayout.WEST);  // Región Oeste
        add(botones[4], BorderLayout.CENTER); // Región Centro
    }
    // maneja los eventos de botón
    @Override
    public void actionPerformed(ActionEvent evento) {
        // comprueba el origen del evento y distribuye el panel de contenido de manera acorde
        for (JButton boton : botones) {
            if (evento.getSource() == boton)
                boton.setVisible(false); // Oculta el botón presionado
            else
                boton.setVisible(true);  // Muestra los demás botones
        }

        esquema.layoutContainer(getContentPane()); // Distribuye el panel de contenido
    }
}