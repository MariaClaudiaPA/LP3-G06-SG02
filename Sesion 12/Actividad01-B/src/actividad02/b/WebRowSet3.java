package actividad02.b;

import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.RowSetProvider;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class WebRowSet3 {

    public static void main(String[] args) {
        try {
            WebRowSet webRowSet = RowSetProvider.newFactory().createWebRowSet();
            webRowSet.setUrl("jdbc:mysql://localhost:3306/actividad");
            webRowSet.setUsername("root");
            webRowSet.setPassword("root");

            webRowSet.setCommand("SELECT id, nombre, salario FROM empleados");
            webRowSet.execute();
            // Guardar los resultados en un archivo XML
            try ( FileWriter fileWriter = new FileWriter("C:\\ficheros/empleados.xml")) {
                webRowSet.writeXml(fileWriter);
            }
        } catch (SQLException | IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
