package actividad01.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/?user=root";
        String usuario = "root";
        String contrase�a = "root";

        Object[][] datosEmpleados = {
            {5, "Luisa Mart�nez", "luisa.martinez@example.com", 48000.0, "2023-05-20"},
            {6, "Miguel S�nchez", "miguel.sanchez@example.com", 55000.0, "2023-06-10"},
            {7, "Carmen L�pez", "carmen.lopez@example.com", 60000.0, "2023-07-15"}
        };
        String sql = "INSERT INTO empleados (id, nombre, email, salario, fecha_ingreso) VALUES (?, ?, ?, ?, ?)";
        try ( Connection connection = DriverManager.getConnection(url, usuario, contrase�a); 
                Statement statement = connection.createStatement();  
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            statement.execute("USE actividad");

            for (Object[] empleado : datosEmpleados) {
                preparedStatement.setObject(1, empleado[0]);
                preparedStatement.setObject(2, empleado[1]);
                preparedStatement.setObject(3, empleado[2]);
                preparedStatement.setObject(4, empleado[3]);
                preparedStatement.setObject(5, empleado[4]);
                preparedStatement.executeUpdate();
            }
            System.out.println("Datos de los empleados insertados con �xito.");
        } catch (SQLException e) {
            System.out.println("Error al insertar datos en la tabla." + e.getMessage());
        }
    }
}
