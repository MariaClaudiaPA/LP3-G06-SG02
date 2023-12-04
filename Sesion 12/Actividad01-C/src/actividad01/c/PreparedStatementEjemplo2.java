package actividad01.c;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEjemplo2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {
            String sql = "UPDATE empleados SET salario = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                double nuevoSalario = 60000.0;
                int idEmpleado = 1;
                preparedStatement.setDouble(1, nuevoSalario);
                preparedStatement.setInt(2, idEmpleado);

                int filasAfectadas = preparedStatement.executeUpdate();

                System.out.println("Filas afectadas: " + filasAfectadas);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
