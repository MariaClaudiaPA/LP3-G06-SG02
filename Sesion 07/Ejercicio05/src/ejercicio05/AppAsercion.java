package ejercicio05;
import java.util.ArrayList;
import java.util.List;

public class AppAsercion {
    private int cantidadProductos;
    private String nombreTienda;
    private List<String> productosDisponibles;

    public AppAsercion(String nombreTienda, int cantidadInicial) {
        assert cantidadInicial >= 0 : "La cantidad inicial no puede ser negativa ";
        this.nombreTienda = nombreTienda;
        this.cantidadProductos = cantidadInicial;
        this.productosDisponibles = new ArrayList<>();
    }

    public void venderProducto(String producto, int cantidad) {
        assert cantidad >= 0 : "La cantidad a vender no puede ser negativa ";
        assert cantidad <= cantidadProductos : "No hay suficientes productos en el inventario ";
        if (productosDisponibles.contains(producto)) {
            this.cantidadProductos -= cantidad;
        } else {
            System.out.println("El producto '" + producto + "' no está disponible en la tienda.");
        }
    }

    public void agregarProducto(String producto, int cantidad) {
        assert cantidad >= 0 : "La cantidad a agregar no puede ser negativa ";
        this.cantidadProductos += cantidad;
        if (!productosDisponibles.contains(producto)) {
            productosDisponibles.add(producto);
        }
    }

    public void listarProductosDisponibles() {
        System.out.println("Productos disponibles en " + nombreTienda + ":");
        for (String producto : productosDisponibles) {
            System.out.println(producto);
        }
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public static void main(String[] args) {
        AppAsercion tienda = new AppAsercion("------NUEVA TIENDA-----", -500);
        tienda.agregarProducto("Arroz", 100);
        tienda.agregarProducto("Manzanas", -200);
        tienda.listarProductosDisponibles();

        tienda.venderProducto("Arroz",30);
        tienda.venderProducto("Manzanas",-100);
        tienda.venderProducto("Abanicos",50);
        
        System.out.println("Cantidad de productos en inventario: " + tienda.getCantidadProductos());
    }
}
