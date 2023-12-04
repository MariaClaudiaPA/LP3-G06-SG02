package actividad02.b;

import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class JoinRowSet4 {

    public static void main(String[] args) {
        try ( JoinRowSet joinRowSet = RowSetProvider.newFactory().createJoinRowSet();  JoinRowSet secondRowSet = RowSetProvider.newFactory().createJoinRowSet()) {

            joinRowSet.setUrl("jdbc:mysql://localhost:3306/actividad");
            joinRowSet.setUsername("root");
            joinRowSet.setPassword("root");

            joinRowSet.setCommand("SELECT empleados.id, empleados.nombre, empleados.salario "
                    + "FROM empleados");
            joinRowSet.execute();

            secondRowSet.setUrl("jdbc:mysql://localhost:3306/actividad");
            secondRowSet.setUsername("root");
            secondRowSet.setPassword("root");

            secondRowSet.setCommand("SELECT empleados.id, empleados.salario "
                    + "FROM empleados");
            secondRowSet.execute();

            // Configurar la unión usando "id" como columna de unión
            joinRowSet.addRowSet(secondRowSet, "id");

            while (joinRowSet.next()) {
                int id = joinRowSet.getInt("id");
                String nombre = joinRowSet.getString("nombre");
                double salario = joinRowSet.getDouble("salario");
                System.out.printf("ID: %d, Nombre: %s, Salario: %.2f%n", id, nombre, salario);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
