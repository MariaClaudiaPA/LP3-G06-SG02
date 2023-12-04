package actividad01.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        double nuevoSalarioMinimo = 55000.0;
        String sql = "UPDATE empleados SET salario = ? WHERE salario < ?";

        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setDouble(1, nuevoSalarioMinimo);
            preparedStatement.setDouble(2, nuevoSalarioMinimo);
            int filasActualizadas = preparedStatement.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Datos actualizados con éxito para " + filasActualizadas + " empleados.");
            } else {
                System.out.println("No se encontraron empleados que cumplieran el criterio de actualización.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar datos en la tabla: " + e.getMessage());
        }
    }
}

