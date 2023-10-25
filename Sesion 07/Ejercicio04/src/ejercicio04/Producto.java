package ejercicio04;
public class Producto {
	
    private String N;
    private double P;
    private int C;

    public Producto(String N, double P, int C) {
    	
        this.N = N;
        this.P = P;
        this.C = C;
    }

    public double ValorInventario() {
        return P * C;
    }

    public String getNombre() {
        return N;
    }

    public void Info_Producto() {
        System.out.println("Nombre -> " + N);
        System.out.println("Precio: S/. -->" + P);
        System.out.println("Cantidad disponible ---> " + C);
        System.out.println("Valor en el inventario ----> " + ValorInventario());
    }
}
