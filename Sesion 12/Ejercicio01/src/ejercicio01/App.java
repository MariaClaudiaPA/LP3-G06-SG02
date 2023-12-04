package ejercicio01;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

public class App extends JFrame {

    private JTextField text;
    private JButton click;
    private JTable datos;
    private JTextField textFiltro;
    private JButton botonFiltro;

    public App() {

        super("Hecho por: Kevin Paredes Rojas y Maria Panclas Aliaga");

        text = new JTextField(30);
        click = new JButton("Enviar Consulta");
        datos = new JTable();
        textFiltro = new JTextField(10);
        botonFiltro = new JButton("Aplicar Filtro");

        setLayout(new BorderLayout());
        JPanel panelConsulta = new JPanel();
        panelConsulta.add(new JLabel("Ingrese una sentencia SQL -> "));
        panelConsulta.add(text);
        panelConsulta.add(click);
        add(panelConsulta, BorderLayout.NORTH);
        add(new JScrollPane(datos), BorderLayout.CENTER);
        JPanel panelFiltro = new JPanel();

        panelFiltro.add(new JLabel("Filtrar -> "));
        panelFiltro.add(textFiltro);
        panelFiltro.add(botonFiltro);
        add(panelFiltro, BorderLayout.SOUTH);

        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consulta();
            }
        });

        botonFiltro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                aplicarFiltro();
            }
        });
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void Consulta() {
        String sql = text.getText();
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Autores", "root", "root");  Statement statement = connection.createStatement()) {
            if (sql.toUpperCase().startsWith("SELECT")) {
                ResultSet resultSet = statement.executeQuery(sql);
                Resultados(resultSet);
            } else {
                int rowCount = statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "!Operación Exitosa cantidad de filas afectadas¡ -> " + rowCount);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR -> " + ex.getMessage());
        }
    }

    private void Resultados(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        Vector<String> columnNames = new Vector<>();

        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<>();
        while (resultSet.next()) {
            Vector<Object> row = new Vector<>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                row.add(resultSet.getObject(columnIndex));
            }
            data.add(row);
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        datos.setModel(model);
    }

    private void aplicarFiltro() {
        String filtroTexto = textFiltro.getText();
        String sql = "SELECT * FROM Autores WHERE name = ?";
        consultarConFiltro(sql, filtroTexto);
    }

    private void consultarConFiltro(String sql, String filtro) {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Autores", "root", "root");  PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, filtro);

            ResultSet resultSet = preparedStatement.executeQuery();
            Resultados(resultSet);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR -> " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
