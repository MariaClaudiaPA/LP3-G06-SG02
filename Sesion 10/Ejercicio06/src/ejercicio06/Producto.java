package ejercicio06;
public class Producto {
    String codigo;
    String descripcion;
    double precio;

    Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return codigo.equals(producto.codigo) &&
                descripcion.equals(producto.descripcion) && precio == producto.precio;
    }

    @Override
    public String toString() {
        return "Producto: codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "\n";
    }
}
