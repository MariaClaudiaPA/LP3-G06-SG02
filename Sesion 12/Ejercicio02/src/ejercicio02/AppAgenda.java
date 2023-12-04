package ejercicio02;

import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class AppAgenda extends javax.swing.JFrame {

    private Connection connection;
    private ResultSet resultSet;

    public AppAgenda() {
        super("Agenda (Marìa Panclas - Kevin Paredes)");

        initComponents();
        if (establecerConexion()) {
            try {
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                resultSet = statement.executeQuery("SELECT * FROM Agenda");

                if (resultSet.next()) {
                    mostrarRegistroActual();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean establecerConexion() {
        String url = "jdbc:mysql://localhost:3306/contactos";
        String usuario = "root";
        String contraseña = "root";

        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void mostrarRegistroActual() {
        try {
            direccion_id.setText(resultSet.getString("ID"));
            nombre.setText(resultSet.getString("Nombre"));
            apellido.setText(resultSet.getString("Apellido"));
            email.setText(resultSet.getString("Email"));
            telefono.setText(resultSet.getString("Telefono"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarSiguienteRegistro() {
        try {
            if (resultSet.next()) {
                mostrarRegistroActual();
            } else {
                resultSet.first();
                mostrarRegistroActual();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarRegistroAnterior() {
        try {
            if (resultSet.previous()) {
                mostrarRegistroActual();
            } else {
                resultSet.last();
                mostrarRegistroActual();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void buscarPorApellido() {
        String apellidoABuscar = apellidoBuscar.getText();
        try {
            resultSet.beforeFirst();
            while (resultSet.next()) {
                if (resultSet.getString("Apellido").equalsIgnoreCase(apellidoABuscar)) {
                    mostrarRegistroActual();
                    return;
                }
            }
            // Si no se encontró, mostrar un mensaje
            JOptionPane.showMessageDialog(this, "No se encontró el apellido: " + apellidoABuscar, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void buscarTodos() {
        try {
            resultSet.beforeFirst();
            if (resultSet.next()) {
                mostrarRegistroActual();
            } else {
                JOptionPane.showMessageDialog(this, "No hay registros en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarTodosLosRegistros() {
        try {
            resultSet.beforeFirst();
            StringBuilder todosLosRegistros = new StringBuilder();

            while (resultSet.next()) {
                todosLosRegistros.append("ID: ").append(resultSet.getString("ID")).append(", ")
                        .append("Nombre: ").append(resultSet.getString("Nombre")).append(", ")
                        .append("Apellido: ").append(resultSet.getString("Apellido")).append(", ")
                        .append("Email: ").append(resultSet.getString("Email")).append(", ")
                        .append("Teléfono: ").append(resultSet.getString("Telefono")).append("\n");
            }

            JTextArea areaTexto = new JTextArea(todosLosRegistros.toString());
            JScrollPane scrollPane = new JScrollPane(areaTexto);
            areaTexto.setLineWrap(true);
            areaTexto.setWrapStyleWord(true);
            scrollPane.setPreferredSize(new Dimension(910, 300));

            JOptionPane.showMessageDialog(this, scrollPane, "Todos los registros", JOptionPane.PLAIN_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertarNuevoRegistro() {
        try {
            resultSet.moveToInsertRow();
            resultSet.updateString("ID", direccion_id.getText());
            resultSet.updateString("Nombre", nombre.getText());
            resultSet.updateString("Apellido", apellido.getText());
            resultSet.updateString("Email", email.getText());
            resultSet.updateString("Telefono", telefono.getText());

            resultSet.insertRow();
            resultSet.last();

            mostrarRegistroActual();
            limpiarCampos();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void limpiarCampos() {
        direccion_id.setText("");
        nombre.setText("");
        apellido.setText("");
        email.setText("");
        telefono.setText("");
    }

    private int obtenerNumeroTotalRegistros() {
        try {
            resultSet.last();
            int totalRegistros = resultSet.getRow();
            resultSet.beforeFirst();  // Volver al primer registro
            return totalRegistros;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        previoBoton = new javax.swing.JButton();
        siguienteBoton = new javax.swing.JButton();
        anterior = new javax.swing.JTextField();
        siguiente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dir = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        apel = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        direccion_id = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        apell = new javax.swing.JLabel();
        buscarBoton = new javax.swing.JButton();
        buscarTodoBoton = new javax.swing.JButton();
        insertarBoton = new javax.swing.JButton();
        apellidoBuscar = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        previoBoton.setBackground(new java.awt.Color(255, 153, 102));
        previoBoton.setText("Previo");
        previoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previoBotonActionPerformed(evt);
            }
        });

        siguienteBoton.setBackground(new java.awt.Color(255, 153, 102));
        siguienteBoton.setText("Siguiente");
        siguienteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBotonActionPerformed(evt);
            }
        });

        anterior.setMinimumSize(new java.awt.Dimension(64, 20));
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setMinimumSize(new java.awt.Dimension(64, 20));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        jLabel1.setText("de");

        dir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dir.setText("Dirección ID:");

        nom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nom.setText("Nombre:");

        apel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        apel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apel.setText("Apellido:");

        em.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        em.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        em.setText("Email:");

        num.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num.setText("Número de teléfono ");

        direccion_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion_idActionPerformed(evt);
            }
        });

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        logo.setFont(new java.awt.Font("SansSerif", 3, 10)); // NOI18N
        logo.setText("Encuentra una entrada por el apellido");

        apell.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        apell.setText("Apellido: ");

        buscarBoton.setBackground(new java.awt.Color(204, 255, 102));
        buscarBoton.setText("Buscar");
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        buscarTodoBoton.setBackground(new java.awt.Color(255, 204, 204));
        buscarTodoBoton.setText("Buscar todas las entradas");
        buscarTodoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTodoBotonActionPerformed(evt);
            }
        });

        insertarBoton.setBackground(new java.awt.Color(255, 204, 204));
        insertarBoton.setText("Insertar nueva entrada");
        insertarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBotonActionPerformed(evt);
            }
        });

        apellidoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(apell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(em, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono)
                            .addComponent(direccion_id)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email))
                        .addGap(9, 9, 9))))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscarTodoBoton)
                        .addGap(18, 18, 18)
                        .addComponent(insertarBoton)
                        .addGap(47, 47, 47))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(siguienteBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(previoBoton)
                    .addComponent(anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(siguienteBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dir)
                    .addComponent(direccion_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(em))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logo)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apell)
                    .addComponent(apellidoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBoton))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarTodoBoton)
                    .addComponent(insertarBoton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previoBotonActionPerformed
        // TODO add your handling code here:
        mostrarRegistroAnterior();

    }//GEN-LAST:event_previoBotonActionPerformed

    private void siguienteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBotonActionPerformed
        // TODO add your handling code here:
        mostrarSiguienteRegistro();

    }//GEN-LAST:event_siguienteBotonActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
        try {
            if (resultSet.previous()) {
                mostrarRegistroActual();
                int idActual = resultSet.getInt("ID");
                siguiente.setText(String.valueOf(idActual) + "/" + obtenerNumeroTotalRegistros());
            } else {
                resultSet.last();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        try {
            if (resultSet.next()) {
                mostrarRegistroActual();
                int idActual = resultSet.getInt("ID");
                siguiente.setText(String.valueOf(idActual) + "/" + obtenerNumeroTotalRegistros());
            } else {
                resultSet.first();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void direccion_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion_idActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void apellidoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoBuscarActionPerformed

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        // TODO add your handling code here:
        buscarPorApellido();

    }//GEN-LAST:event_buscarBotonActionPerformed

    private void buscarTodoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTodoBotonActionPerformed
        // TODO add your handling code here:
        mostrarTodosLosRegistros();


    }//GEN-LAST:event_buscarTodoBotonActionPerformed

    private void insertarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBotonActionPerformed
        // TODO add your handling code here:
        insertarNuevoRegistro();

    }//GEN-LAST:event_insertarBotonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AppAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anterior;
    private javax.swing.JLabel apel;
    private javax.swing.JLabel apell;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField apellidoBuscar;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JButton buscarTodoBoton;
    private javax.swing.JLabel dir;
    private javax.swing.JTextField direccion_id;
    private javax.swing.JLabel em;
    private javax.swing.JTextField email;
    private javax.swing.JButton insertarBoton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nom;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel num;
    private javax.swing.JButton previoBoton;
    private javax.swing.JTextField siguiente;
    private javax.swing.JButton siguienteBoton;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
