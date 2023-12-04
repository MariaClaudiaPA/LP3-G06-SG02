package actividad01.c;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementEjemplo{

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {
            String sql = "SELECT id, nombre, salario FROM empleados WHERE salario > ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                double salarioMinimo = 5000.0;
                preparedStatement.setDouble(1, salarioMinimo);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String nombre = resultSet.getString("nombre");
                        double salario = resultSet.getDouble("salario");
                        System.out.printf("ID: %d, Nombre: %s, Salario: %.2f%n", id, nombre, salario);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
