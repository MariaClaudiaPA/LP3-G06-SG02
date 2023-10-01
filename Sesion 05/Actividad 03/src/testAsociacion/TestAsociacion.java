package testAsociacion;
public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);
        // Crear clientes
        Persona cliente1 = new Persona("111", "Juan", 'A');
        Persona cliente2 = new Persona("222", "Maria", 'B');
        Persona cliente3 = new Persona("333", "Carlos", 'A');
        // Agregar clientes a los bancos
        bcp.agregarCliente(cliente1);
        bcp.agregarCliente(cliente2);
        bbva.agregarCliente(cliente2);
        bbva.agregarCliente(cliente3);
        // Mostrar información de los bancos y sus clientes
        System.out.println("\nInformacion del Banco BCP:\n");
        System.out.println(bcp);
        System.out.println("\nInformacion del Banco BBVA:");
        System.out.println(bbva);
        // Dar de baja un cliente del banco BCP
        Persona clienteEliminado = bcp.darBajaCliente(cliente1);
        if (clienteEliminado != null) {
            System.out.println("\nCliente eliminado del Banco BCP: " + clienteEliminado);
        } else {
            System.out.println("\nCliente no encontrado en el Banco BCP.");
        }
        // Listar clientes de tipo 'A' en el banco BBVA
        System.out.println("\nClientes de tipo 'A' en el Banco BBVA:");
        bbva.clientesPorTipo('A');
        // Buscar un cliente en el banco BCP
        Persona clienteBuscado = new Persona("111", "Juan", 'A');
        boolean encontrado = bcp.buscarCliente(clienteBuscado);
        if (encontrado) {
            System.out.println("\nCliente encontrado en el Banco BCP.");
        } else {
            System.out.println("\nCliente no encontrado en el Banco BCP.");
        }
    }
}
