package flowlayout;
// FlowLayout permite que los componentes fluyan a trav�s de varias l�neas.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame {
    private final JButton botonJButtonIzquierda;// bot�n para establecer la alineaci�n a la izquierda
    private final JButton botonJButtonCentro;// bot�n para establecer la alineaci�n al centro
    private final JButton botonJButtonDerecha; // bot�n para establecer la alineaci�n a la derecha
    private final FlowLayout esquema; // objeto esquema
    private final Container contenedor; // contenedor para establecer el esquema
    // establece la GUI y registra los componentes de escucha de botones
    public MarcoFlowLayout() {
        super("Demostraci�n de FlowLayout - (Mar�a Panclas - Kevin Paredes) ");

        esquema = new FlowLayout();
        contenedor = getContentPane();
        setLayout(esquema);

        // Bot�n "Izquierda" y registra componente de escucha
        botonJButtonIzquierda = new JButton("Izquierda");
        add(botonJButtonIzquierda); // agrega bot�n Izquierda al marco
        botonJButtonIzquierda.addActionListener(new ActionListener() { // clase interna an�nima
            // procesa evento de botonJButtonIzquierda
            @Override
            public void actionPerformed(ActionEvent evento) {
                // Cambia la alineaci�n a la izquierda
                esquema.setAlignment(FlowLayout.LEFT);
                // Realinea los componentes adjuntos
                esquema.layoutContainer(contenedor);
            }
        });

        // Bot�n "Centro"  y registra componente de escucha
        botonJButtonCentro = new JButton("Centro");
        add(botonJButtonCentro); //agrega bot�n Centro al marco
        botonJButtonCentro.addActionListener(new ActionListener() { // clase interna an�nima
            // procesa evento de botonJButtonCentro
            @Override
            public void actionPerformed(ActionEvent evento) {
                // Cambia la alineaci�n al centro
                esquema.setAlignment(FlowLayout.CENTER);
                // Realinea los componentes adjuntos
                esquema.layoutContainer(contenedor);
            }
        });

        // Bot�n "Derecha"  y registra componente de escucha
        botonJButtonDerecha = new JButton("Derecha");
        add(botonJButtonDerecha);// agrega bot�n Derecha al marco
        botonJButtonDerecha.addActionListener(new ActionListener() { // clase interna an�nima
            // procesa evento de botonJButtonDerecha
            @Override
            public void actionPerformed(ActionEvent evento) {
                // Cambia la alineaci�n a la derecha
                esquema.setAlignment(FlowLayout.RIGHT);
                // Realinea los componentes adjuntos
                esquema.layoutContainer(contenedor);
            }
        });
    }
}
