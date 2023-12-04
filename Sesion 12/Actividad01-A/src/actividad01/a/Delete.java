package actividad01.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";
//        int idEmpleadoEliminar = 3;
//        String sql = "DELETE FROM empleados WHERE id = ?";

        String fechaLimite = "2023-03-03";
        String sql = "DELETE FROM empleados WHERE fecha_ingreso < ?";

        try ( Connection connection = DriverManager.getConnection(url, usuario, contraseña);  PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, fechaLimite);
            int filasEliminadas = preparedStatement.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Empleado eliminado con éxito.");
            } else {
                System.out.println("No se encontró el empleado con ID: " + fechaLimite);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar empleado: " + e.getMessage());
        }
    }
}
