package cuadroscombinados;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MarcoCuadroCombinado extends JFrame {

    private final JComboBox<String> imagenesJComboBox; // contiene los nombres de los iconos
    private final JLabel etiqueta; // muestra el icono seleccionado

    private static final String nombres[] = {
        "conejo.gif", "leonmarino.gif", "mariposa.gif", "perro.gif"
    };
    private final Icon[] iconos = {
        new ImageIcon(MarcoCuadroCombinado.class.getResource(nombres[0])),
        new ImageIcon(MarcoCuadroCombinado.class.getResource(nombres[1])),
        new ImageIcon(MarcoCuadroCombinado.class.getResource(nombres[2])),
        new ImageIcon(MarcoCuadroCombinado.class.getResource(nombres[3]))
    };
    // El constructor de MarcoCuadroCombinado agrega un objeto JComboBox a JFrame
    public MarcoCuadroCombinado() {
        super("Prueba de JComboBox - (María Panclas - Kevin Paredes) ");
        setLayout(new FlowLayout()); // establece el esquema del marco

        imagenesJComboBox = new JComboBox<String>(nombres); // establece JComboBox
        imagenesJComboBox.setMaximumRowCount(3); // muestra tres filas

        imagenesJComboBox.addItemListener(
                new ItemListener() // clase interna anónima
        {
            // maneja evento de JComboBox
            @Override
            public void itemStateChanged(ItemEvent evento) {
                // determina si está seleccionado el elemento
                if (evento.getStateChange() == ItemEvent.SELECTED) {
                    etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);
                }
            }
        }
        );

        add(imagenesJComboBox); // agrega cuadro combinado a JFrame
        etiqueta = new JLabel(iconos[0]); // muestra el primer icono
        add(etiqueta); // agrega etiqueta a JFrame
    }
}
