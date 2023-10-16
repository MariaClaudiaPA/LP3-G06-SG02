package actividades;

public class Empleado implements PorPagar {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    //Constructo
    public Empleado(String nombre, String apellido, String nss) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }

    // Métodos get y set para los atributos
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    // Método toString para mostrar la información del empleado
    @Override
    public String toString() {
        return String.format("Empleado: %s %s\nNumero de Seguro Social: %s", 
            getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }

    @Override
    public double obtenerMontoPago() {
        // Implementaremos este método en clases derivadas si es necesario
        return 0.0;
    }
}