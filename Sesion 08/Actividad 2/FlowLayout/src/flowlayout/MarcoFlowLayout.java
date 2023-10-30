package flowlayout;
// FlowLayout permite que los componentes fluyan a través de varias líneas.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame {
    private final JButton botonJButtonIzquierda;// botón para establecer la alineación a la izquierda
    private final JButton botonJButtonCentro;// botón para establecer la alineación al centro
    private final JButton botonJButtonDerecha; // botón para establecer la alineación a la derecha
    private final FlowLayout esquema; // objeto esquema
    private final Container contenedor; // contenedor para establecer el esquema
    // establece la GUI y registra los componentes de escucha de botones
    public MarcoFlowLayout() {
        super("Demostración de FlowLayout - (María Panclas - Kevin Paredes) ");

        esquema = new FlowLayout();
        contenedor = getContentPane();
        setLayout(esquema);

        // Botón "Izquierda" y registra componente de escucha
        botonJButtonIzquierda = new JButton("Izquierda");
        add(botonJButtonIzquierda); // agrega botón Izquierda al marco
        botonJButtonIzquierda.addActionListener(new ActionListener() { // clase interna anónima
            // procesa evento de botonJButtonIzquierda
            @Override
            public void actionPerformed(ActionEvent evento) {
                // Cambia la alineación a la izquierda
                esquema.setAlignment(FlowLayout.LEFT);
                // Realinea los componentes adjuntos
                esquema.layoutContainer(contenedor);
            }
        });

        // Botón "Centro"  y registra componente de escucha
        botonJButtonCentro = new JButton("Centro");
        add(botonJButtonCentro); //agrega botón Centro al marco
        botonJButtonCentro.addActionListener(new ActionListener() { // clase interna anónima
            // procesa evento de botonJButtonCentro
            @Override
            public void actionPerformed(ActionEvent evento) {
                // Cambia la alineación al centro
                esquema.setAlignment(FlowLayout.CENTER);
                // Realinea los componentes adjuntos
                esquema.layoutContainer(contenedor);
            }
        });

        // Botón "Derecha"  y registra componente de escucha
        botonJButtonDerecha = new JButton("Derecha");
        add(botonJButtonDerecha);// agrega botón Derecha al marco
        botonJButtonDerecha.addActionListener(new ActionListener() { // clase interna anónima
            // procesa evento de botonJButtonDerecha
            @Override
            public void actionPerformed(ActionEvent evento) {
                // Cambia la alineación a la derecha
                esquema.setAlignment(FlowLayout.RIGHT);
                // Realinea los componentes adjuntos
                esquema.layoutContainer(contenedor);
            }
        });
    }
}
