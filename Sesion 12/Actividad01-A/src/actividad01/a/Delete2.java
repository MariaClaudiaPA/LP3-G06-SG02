package actividad01.a;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";
        String sql = "DELETE FROM empleados";

        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            int filasEliminadas = preparedStatement.executeUpdate();
            System.out.println(filasEliminadas + " empleados eliminados.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar empleados: " + e.getMessage());
        }
    }
}
