package sesion2ej1;

/*import java.util.scanner;*//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class CuentaBanco {
    private String titular;
    private double cant;

    public CuentaBanco(String titular) {
        this.titular = titular;
    }

    public CuentaBanco(String titular, double cant) {
        this.titular = titular;
        this.cant = cant;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cant;
    }

    public void setCantidad(double cant) {
        this.cant = cant;
    }

    public void ingresar(double cant) {
        if (cant > 0) {
            this.cant += cant;
            System.out.println("Se ha ingresado " + cant + " soles en la cuenta");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cant - cantidad < 0) {
                this.cant = 0;
            } else {
                this.cant -= cantidad;
            }
            System.out.println("Se ha retirado " + cantidad + " soles de la cuenta ");
        }
    }

    @Override
    public String toString() {
        return "Titular de la cuenta: " + titular + "\nCantidad de dinero en su cuenta: " + cant + " soles";
    }
}
