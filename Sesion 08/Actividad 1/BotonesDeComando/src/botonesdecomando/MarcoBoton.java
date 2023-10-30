package botonesdecomando;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame {

    private final JButton botonJButtonSimple; // Botón con texto solamente
    private final JButton botonJButtonElegante; // Botón con iconos

    //MarcoBoton agrega objetos de tipo JButton a JFrame
    public MarcoBoton() {
        super("Prueba de botones (Maria Panclas - Kevin Paredes) ");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Boton simple"); // Botón con texto
        add(botonJButtonSimple); // Se agrega botonJButtonSimple a JFrame

        Icon insecto1 = new ImageIcon(getClass().getResource("insecto1.gif"));
        Icon insecto2 = new ImageIcon(getClass().getResource("insecto2.gif"));
        botonJButtonElegante = new JButton("Boton elegante", insecto1); // Establece la imagen
        botonJButtonElegante.setRolloverIcon(insecto2); // Establece la imagen de sustitución
        add(botonJButtonElegante); // Agrega botonJButtonElegante a JFrame

        //Crea nuevo ManejadorBoton para manejar los eventos de botón
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }

    //La clase interna para manejar eventos de botón
    private class ManejadorBoton implements ActionListener {

        // Maneja evento de botón
        @Override
        public void actionPerformed(ActionEvent evento) {
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimio: %s", 
                    evento.getActionCommand()));
        }
    }
}
