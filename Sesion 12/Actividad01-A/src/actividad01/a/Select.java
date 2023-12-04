package actividad01.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        String sql = "SELECT id,nombre, salario FROM empleados";

//        String fechaLimite = "2023-06-01";
//        String sql = "SELECT * FROM empleados WHERE fecha_ingreso > '" + fechaLimite + "'";
//        double salarioMinimo = 55000.0;
//        String sql = "SELECT * FROM empleados WHERE salario > " + salarioMinimo;
//        String sql = "SELECT id, nombre, email, salario, fecha_ingreso FROM empleados";
        try ( Connection connection = DriverManager.getConnection(url, usuario, contraseña);  PreparedStatement preparedStatement = connection.prepareStatement(sql);  ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                double salario = resultSet.getDouble("salario");
                String fechaIngreso = resultSet.getString("fecha_ingreso");
                System.out.printf("ID: %d, Nombre: %s, Email: %s, Salario: %.2f, Fecha de Ingreso: %s%n",
                        id, nombre, email, salario, fechaIngreso);
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar datos en la tabla." + e.getMessage());
        }
    }
}
