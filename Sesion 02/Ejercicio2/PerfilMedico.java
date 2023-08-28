/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2ej2;

/**
 *
 * @author user
 */
public class PerfilMedico {
    private String nombre;
    private String apellido;
    private char sexo;
    private int diaN;
    private int mesN;
    private int anioN;
    private double altura; // en centímetros
    private double peso; // en kilogramos

    // Constructor
    public PerfilMedico(String nombre, String apellido, char sexo, int diaN, int mesN, int anioN, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaN = diaN;
        this.mesN = mesN;
        this.anioN = anioN;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos getter y setter para todos los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDiaNacimiento() {
        return diaN;
    }

    public void setDiaNacimiento(int diaN) {
        this.diaN = diaN;
    }

    public int getMesN() {
        return mesN;
    }

    public void setMesN(int mesN) {
        this.mesN = mesN;
    }

    public int getAnioN() {
        return anioN;
    }

    public void setAnoNacimiento(int anioN) {
        this.anioN= anioN;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcular_edad() {
        int ANIO = 2023;
        return ANIO - anioN;
    }

    public double calcular_FCM() {
        int edad = calcular_edad();
        return 208 - 0.7 * edad; 
    }

    public double calcular_IMC() {
        return peso / altura;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\nSexo: " + sexo + "\nFecha de nacimiento: " + diaN+ "/" + mesN+ "/" + anioN+ "\nAltura: " + altura + " Cm" + "\nPeso: " + peso + " Kg";
    }
}
