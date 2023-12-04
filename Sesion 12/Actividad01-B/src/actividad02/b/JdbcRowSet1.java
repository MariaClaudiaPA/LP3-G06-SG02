package actividad02.b;
import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;

public class JdbcRowSet1 {

    public static void main(String[] args) {
        try {
            JdbcRowSet jdbcRowSet = javax.sql.rowset.RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/actividad");
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("root");

            jdbcRowSet.setCommand("SELECT id, nombre, salario FROM empleados");
            jdbcRowSet.execute();

            while (jdbcRowSet.next()) {
                int id = jdbcRowSet.getInt("id");
                String nombre = jdbcRowSet.getString("nombre");
                double salario = jdbcRowSet.getDouble("salario");
                System.out.printf("ID: %d, Nombre: %s, Salario: %.2f%n", id, nombre, salario);
            }
            // Modificar un registro
            jdbcRowSet.absolute(1); // Mover al primer registro
            jdbcRowSet.updateDouble("salario", 60000.0);
            jdbcRowSet.updateRow(); // Confirmar la actualización en la base de datos

        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
