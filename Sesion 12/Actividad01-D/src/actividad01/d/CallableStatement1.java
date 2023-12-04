package actividad01.d;
       
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStatement1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {

            // Procedimeinto ActualizarEmpleado
            CallableStatement callableStatement = connection.prepareCall("{call ActualizarEmpleado(?, ?, ?, ?, ?)}");
            callableStatement.setInt(1, 1); 
            callableStatement.setString(2, "Andres Nuevo");
            callableStatement.setString(3, "andresnuevo@email.com");
            callableStatement.setDouble(4, 50000.0);
            callableStatement.setDate(5, java.sql.Date.valueOf("2023-11-01"));
            callableStatement.executeUpdate();
            System.out.println("Procedimiento ActualizarEmpleado ejecutado con éxito.");

            // Función CalcularSalarioAnual
            callableStatement = connection.prepareCall("{? = call CalcularSalarioAnual(?)}");
            callableStatement.registerOutParameter(1, Types.DOUBLE);
            callableStatement.setInt(2, 1); // Poner el valor adecuado para p_id
            callableStatement.execute();
            double salarioAnual = callableStatement.getDouble(1);
            System.out.println("Salario anual calculado: " + salarioAnual);

        } catch (Exception e) {
            System.out.println("Error al ejecutar:" + e.getMessage());
        }
    }
}
