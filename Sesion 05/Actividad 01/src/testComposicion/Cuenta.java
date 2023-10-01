package testComposicion;

public class Cuenta {
    private int numero;
    private double saldo;
    
    public Cuenta(int numCuenta, double saldo) {
        this.numero = numCuenta;
        this.saldo = saldo;
    }
    
    public Cuenta(int numero) {
        this(numero, 0); 
    }
    
    public int getNumCuenta() {
        return numero;
    }
    
    public void setNumCuenta(int numCuenta) {
        this.numero = numCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "Numero de Cuenta: " + numero + "\nSaldo: " + saldo;
    }
}






