package actividad01.e;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class Transaccion {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        try ( Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {
            // Deshabilitar el modo de autocommit
            connection.setAutoCommit(false);

            try {
                // Actualizar el salario del empleado
                String updateQuery = "UPDATE empleados SET salario = salario + ? WHERE id = ?";
                try ( PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                    preparedStatement.setDouble(1, 1000.0);  // Aumento de salario
                    preparedStatement.setInt(2, 1);
                    preparedStatement.executeUpdate();
                }

                // Calcular el nuevo salario anual
                try ( CallableStatement callableStatement = connection.prepareCall("{? = call CalcularSalarioAnual(?)}")) {
                    callableStatement.registerOutParameter(1, Types.DOUBLE);
                    callableStatement.setInt(2, 1);  // ID del empleado
                    callableStatement.execute();
                    double salarioAnual = callableStatement.getDouble(1);
                    System.out.println("Nuevo salario anual calculado: " + salarioAnual);
                }

                // Confirmar la transacción si todas las operaciones fueron exitosas
                connection.commit();
                System.out.println("Transacción completada con éxito.");
            } catch (SQLException e) {
                // Revertir la transacción en caso de error
                connection.rollback();
                System.out.println("Error en la transacción: " + e.getMessage());
            } finally {
                // Restaurar el modo de autocommit al salir
                connection.setAutoCommit(true);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
