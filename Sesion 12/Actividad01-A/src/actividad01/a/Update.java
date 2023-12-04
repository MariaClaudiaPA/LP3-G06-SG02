package actividad01.a;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        int idEmpleadoActualizar = 6;
        
        String nuevoNombre = "Jose Manuel Castro";
        double nuevoSalario = 60000.0;

        String sql = "UPDATE empleados SET nombre = ?, salario = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setDouble(2, nuevoSalario);
            preparedStatement.setInt(3, idEmpleadoActualizar);

            int filasActualizadas = preparedStatement.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Datos actualizados con éxito.");
            } else {
                System.out.println("No se encontró el empleado con ID: " + idEmpleadoActualizar);
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar datos en la tabla: " + e.getMessage());
        }
    }
}
