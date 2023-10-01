package testAsociacion;
public class Banco {

    private String nombre;
    private Persona[] clientes;

    public Banco(String nombre) {
        this(nombre, 20); 
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    // Getter y Setter 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Agregar un cliente al banco
    public void agregarCliente(Persona persona) {
        // Verificar si el cliente ya existe
        if (!buscarCliente(persona)) {
            // Buscar un espacio disponible en el arreglo de clientes
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] == null) {
                    clientes[i] = persona;
                    System.out.println("Cliente agregado al banco " + nombre + ".");
                    return; // Salir del método después de agregar el cliente
                }
            }
            System.out.println("El banco está lleno, no se pudo agregar al cliente.");
        } else {
            System.out.println("El cliente ya existe en el banco " + nombre + ".");
        }
    }

    // Dar de baja a un cliente del banco
    public Persona darBajaCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) { // Uso de equals()
                Persona clienteEliminado = clientes[i];
                clientes[i] = null;
                System.out.println("Cliente dado de baja del banco " + nombre + ".");
                return clienteEliminado;
            }
        }
        System.out.println("El cliente no se encuentra en el banco " + nombre + ".");
        return null;
    }

    // Buscar un cliente en el banco
    public boolean buscarCliente(Persona persona) {
        for (Persona cliente : clientes) {
            if (cliente != null && cliente.equals(persona)) {
                return true;
            }
        }
        return false;
    }

    // Listar los clientes por tipo (carácter)
    public void clientesPorTipo(char tipo) {
        System.out.println("Clientes del banco " + nombre + " de tipo " + tipo + ":");
        for (Persona cliente : clientes) {
            if (cliente != null && cliente.getTipo() == tipo) {
                System.out.println(cliente);
            }
        }
    }

    // Método toString para mostrar información de todos los clientes del banco
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Clientes del banco ").append(nombre).append(":\n");
        for (Persona cliente : clientes) {
            if (cliente != null) {
                result.append(cliente).append("\n");
            }
        }
        return result.toString();
    }
}
