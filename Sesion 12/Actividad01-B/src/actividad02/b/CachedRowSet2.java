package actividad02.b;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CachedRowSet2 {

    public static void main(String[] args) {
        try {
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl("jdbc:mysql://localhost:3306/actividad");
            cachedRowSet.setUsername("root");
            cachedRowSet.setPassword("root");
            // Desactivar autocommit
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/actividad", "root", "root");
            connection.setAutoCommit(false);
            // Realizar una consulta
            cachedRowSet.setCommand("SELECT id, nombre, salario FROM empleados");
            cachedRowSet.execute();
            // Modificar un registro en memoria
            cachedRowSet.absolute(1); 
            cachedRowSet.updateDouble("salario", 47000.0);
            cachedRowSet.updateRow(); 
            // Sincronizar los cambios con la base de datos
            cachedRowSet.acceptChanges(connection);
            // Activar autocommit nuevamente
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
