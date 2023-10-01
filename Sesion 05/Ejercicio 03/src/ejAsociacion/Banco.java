package ejAsociacion;

public class Banco {

    private String nombre;
    private Persona[] clientes;
    private int numClientes; // Número de clientes actuales

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
        this.numClientes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCliente(Persona persona) {
        if (numClientes < clientes.length) {
            clientes[numClientes] = persona;
            numClientes++;
            System.out.println("Cliente agregado al banco " + nombre + ".");
        } else {
            System.out.println("El banco está lleno, no se pudo agregar al cliente.");
        }
    }

    public Persona darBajaCliente(Persona persona) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                Persona clienteEliminado = clientes[i];
                // Mover el último cliente al lugar del cliente eliminado
                clientes[i] = clientes[numClientes - 1];
                clientes[numClientes - 1] = null;
                numClientes--;
                System.out.println("Cliente dado de baja del banco " + nombre + ".");
                return clienteEliminado;
            }
        }
        System.out.println("El cliente no se encuentra en el banco " + nombre + ".");
        return null;
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    public void listarClientes() {
        System.out.println("Clientes del banco " + nombre + ":");
        for (int i = 0; i < numClientes; i++) {
            System.out.println(clientes[i]);
        }
    }

    public void clienteTipo(char tipo) {
        boolean clientesEncontrados = false;
        System.out.println("Clientes de tipo " + tipo + " en el banco " + nombre + ":");
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i] != null && clientes[i].getTipo() == tipo) {
                System.out.println(clientes[i]);
                clientesEncontrados = true;
            }
        }

        if (!clientesEncontrados) {
            System.out.println("No se encontraron clientes de tipo " + tipo + " en el banco " + nombre + ".");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(" ").append(nombre).append(":\n");
        for (int i = 0; i < numClientes; i++) {
            result.append(clientes[i]).append("\n");
        }
        return result.toString();
    }
}
