package ejComposicion;

public class Persona {

    private static int cuentaC = 1000;
    private static int cuentaB = 5000;
    private static int cuentaE = 8000;
    
    private int id;
    private String nombre;
    private String apellido;
    private char tipoCliente;
    private Cuenta cuenta;

    public Persona(int id, String nombre, String apellido, char tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        if (tipoCliente == 'C' || tipoCliente == 'B' || tipoCliente == 'E') {
            this.tipoCliente = tipoCliente;
        } else {
            System.out.println("Tipo de cliente no válido. Se establecerá por defecto como C.");
            this.tipoCliente = 'C'; //Por defecto como 'C'
        }
        this.cuenta = new Cuenta(generarNumeroDeCuenta());
    }

    public Persona(int id, String nombre, String apellido) {
        this(id, nombre, apellido, 'C'); 
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void retirar(double cantidad) {
        cuenta.retirar(cantidad);
    }

    public void depositar(double cantidad) {
        cuenta.depositar(cantidad);
    }

    @Override
    public String toString() {
        return "\nCliente: " + id + "\nTipo: " + tipoCliente + "\nNombres: " + nombre + " " + apellido
                + "\nNo.Cuenta: " + cuenta.getNumero() + "\nSaldo: " + cuenta.getSaldo();
    }

    private String generarNumeroDeCuenta() {
        String tipo = String.valueOf(tipoCliente);
        int nume = 0;

        switch (tipoCliente) {
            case 'C':
                nume = cuentaC++;
                break;
            case 'B':
                nume = cuentaB++;
                break;
            case 'E':
                nume = cuentaE++;
                break;
        }

        return tipo + nume;
    }
}
