package actividad01.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/?user=root"; 
        String usuario = "root";
        String contraseña = "root";

        String sqlSeleccionarBD = "USE actividad"; 
        String sqlCrearTabla = "CREATE TABLE empleados ("
                + "id INT PRIMARY KEY,"
                + "nombre VARCHAR(255),"
                + "email VARCHAR(255),"
                + "salario DOUBLE,"
                + "fecha_ingreso DATE)";

        try ( Connection connection = DriverManager.getConnection(url, usuario, contraseña);  
                Statement statement = connection.createStatement()) {
            statement.execute(sqlSeleccionarBD);
            statement.executeUpdate(sqlCrearTabla);
            System.out.println("Tabla de empleados creada con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al crear la tabla." + e.getMessage());
        }
    }
}
