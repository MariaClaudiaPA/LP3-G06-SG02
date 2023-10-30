package casillasdeverificaci�n;
// Botones JCheckBox y eventos de elementos.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class MarcoCasillaVerificacion extends JFrame {

    private JTextField campoTexto; // muestra el texto en tipos de letra cambiantes
    private JCheckBox negritaJCheckBox; // para seleccionar/deseleccionar negrita
    private JCheckBox cursivaJCheckBox; // para seleccionar/deseleccionar cursiva

    // El constructor de MarcoCasillaVerificacion agrega objetos JCheckBox a JFrame
    public MarcoCasillaVerificacion() {
        super("Prueba de JCheckBox - (Mar�a Panclas - Kevin Paredes) ");
        setLayout(new FlowLayout());

        campoTexto = new JTextField("Observe como cambia el estilo de tipo de letra", 20);
        campoTexto.setFont(new Font("Serif", Font.PLAIN, 14));
        add(campoTexto); // agrega campoTexto a JFrame

        negritaJCheckBox = new JCheckBox("Negrita");
        cursivaJCheckBox = new JCheckBox("Cursiva");
        add(negritaJCheckBox); // agrega casilla de verificaci�n "negrita" a JFrame
        add(cursivaJCheckBox); // agrega casilla de verificaci�n "cursiva" a JFrame

        // registra componentes de escucha para objetos JCheckBox
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        negritaJCheckBox.addItemListener(manejador);
        cursivaJCheckBox.addItemListener(manejador);
    }

    // clase interna privada para el manejo de eventos ItemListener
    private class ManejadorCheckBox implements ItemListener {

        // responde a los eventos de casilla de verificaci�n
        @Override
        public void itemStateChanged(ItemEvent evento) {
            Font tipoLetra = null; // almacena el nuevo objeto Font

            // determina cu�les objetos CheckBox est�n seleccionados y crea el objeto Font
            if (negritaJCheckBox.isSelected() && cursivaJCheckBox.isSelected()) {
                tipoLetra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (negritaJCheckBox.isSelected()) {
                tipoLetra = new Font("Serif", Font.BOLD, 14);
            } else if (cursivaJCheckBox.isSelected()) {
                tipoLetra = new Font("Serif", Font.ITALIC, 14);
            } else {
                tipoLetra = new Font("Serif", Font.PLAIN, 14);
            }

            campoTexto.setFont(tipoLetra);
        }
    }
} // fin de la clase MarcoCasillaVerificacion
