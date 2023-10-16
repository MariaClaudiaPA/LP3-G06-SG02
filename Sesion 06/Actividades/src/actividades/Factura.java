package actividades;

public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
    // Constructor
    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        this.numeroPieza = pieza;
        this.descripcionPieza = descripcion;
        establecerCantidad(cuenta); // Valida y almacena la cantidad
        establecerPrecioPorArticulo(precio); // Valida y almacena el precio por artículo
    }

    // Métodos get y set para los atributos
    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    // Método privado para establecer la cantidad 
    private void establecerCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad debe ser mayor o igual a cero.");
        }
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }
    
    // Método privado para establecer el precio por artículo
    private void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo >= 0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            throw new IllegalArgumentException("El precio por artículo debe ser mayor o igual a cero.");
        }
    }
    // Método requqerido para realizar el contrato con la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }

    // Sobreescribir el método toString para mostrar la información de la factura
    @Override
    public String toString() {
        return String.format("Factura:\nNumero de Pieza: %s\nDescripcion: %s\nCantidad: %d\nPrecio por Artículo: $%,.2f",
            getNumeroPieza(), getDescripcionPieza(), obtenerCantidad(), obtenerPrecioPorArticulo());
    }
}

