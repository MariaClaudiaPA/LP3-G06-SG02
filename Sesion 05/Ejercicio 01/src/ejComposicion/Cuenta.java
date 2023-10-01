package ejComposicion;
public class Cuenta {
    private String numero;
    private double saldo;

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        if (saldo >= 50) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo mínimo inicial de 50 soles requerido. Se establecerá a 50 soles.");
            this.saldo = 50;
        }
    }

    public Cuenta(String numero) {
        this(numero, 50); // Saldo mínimo inicial de 50 soles
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 50) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo mínimo es de 50 soles ");
        }
    }

    public void retirar(double cantidad) {
        if (saldo - cantidad >= 50) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para retirar esa cantidad.");
        }
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + numero + "\nSaldo: " + saldo;
    }
}

