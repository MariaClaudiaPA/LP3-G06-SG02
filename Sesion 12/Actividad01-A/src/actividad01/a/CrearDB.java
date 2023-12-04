package actividad01.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearDB {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/?user=root"; 
        String usuario = "root";
        String contrase�a = "root";

        String nombreBaseDatos = "actividad";

        String sql = "CREATE DATABASE " + nombreBaseDatos;
        try (Connection connection = DriverManager.getConnection(url, usuario, contrase�a);
            Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Base de datos creada con �xito.");
        } catch (SQLException e) {
            System.out.println("Error al crear la base de datos." + e.getMessage());
        }
    }
}

