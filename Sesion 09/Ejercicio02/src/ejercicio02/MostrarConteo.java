package ejercicio02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MostrarConteo extends javax.swing.JFrame {

    private Conteo resultado;
    private String fileName;  // Variable para almacenar el nombre del archivo

    public MostrarConteo() {
        initComponents();
        Conteo resultado = new Conteo(0, 0, 0);

    }
    public void setResultado(Conteo resultado) {
        this.resultado = resultado;
        updateLabels();
    }
    private void updateLabels() {
        archivo.setText(fileName);
        lineas.setText(String.valueOf(resultado.getLineas()));
        palabra.setText(String.valueOf(resultado.getPalabras()));
        caracter.setText(String.valueOf(resultado.getCaracteres()));
    }
    private Conteo contarPalabrasLineasCaracteres(String fileName) {
        int lineas = 0;
        int palabras = 0;
        int caracteres = 0;
        try ( BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas++;
                caracteres += linea.length();
                String[] palabrasArray = linea.split("\\s+");
                palabras += palabrasArray.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Conteo(lineas, palabras, caracteres);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        arch = new javax.swing.JLabel();
        lin = new javax.swing.JLabel();
        pal = new javax.swing.JLabel();
        caract = new javax.swing.JLabel();
        archivo = new javax.swing.JLabel();
        lineas = new javax.swing.JLabel();
        palabra = new javax.swing.JLabel();
        caracter = new javax.swing.JLabel();
        scrollbar1 = new java.awt.Scrollbar();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        arch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arch.setText("Archivo:");

        lin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lin.setText("Lineas:");

        pal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pal.setText("Palabras:");

        caract.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        caract.setText("Caracteres");

        archivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        archivo.setForeground(new java.awt.Color(0, 0, 204));
        archivo.setText(" ");

        lineas.setText(" ");

        palabra.setText(" ");

        caracter.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pal)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caract)
                            .addComponent(lin)
                            .addComponent(arch))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(archivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(palabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caracter, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(scrollbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arch)
                            .addComponent(archivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lin)
                            .addComponent(lineas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pal)
                            .addComponent(palabra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caract)
                            .addComponent(caracter))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addComponent(scrollbar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarConteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarConteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarConteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarConteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarConteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MostrarConteo frame = new MostrarConteo();
                frame.setTitle("Hecho por: Kevin Paredes Rojas y Maria Panclas Aliaga:");
                // Use JFileChooser to select a file
                JFileChooser fileChooser = new JFileChooser();
                int res = fileChooser.showOpenDialog(null);
                if (res == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    frame.fileName = selectedFile.getAbsolutePath();  // Asignar el nombre del archivo
                    Conteo resultado = frame.contarPalabrasLineasCaracteres(frame.fileName);
                    frame.setResultado(resultado);
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Elija un archivo", "-Error-", JOptionPane.ERROR_MESSAGE);
                }

                frame.setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arch;
    private javax.swing.JLabel archivo;
    private javax.swing.JLabel caract;
    private javax.swing.JLabel caracter;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lin;
    private javax.swing.JLabel lineas;
    private javax.swing.JLabel pal;
    private javax.swing.JLabel palabra;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables
}
