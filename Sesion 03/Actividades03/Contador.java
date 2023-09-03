/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contadorTest;
public class Contador { 
    static int acumulador = 0; 
    final static int VALOR_INICIAL = 10;
    private int valor;
    private static int nContadores = 0;
    private static int ultimoContador = VALOR_INICIAL;
    
    public static int acumulador() {
        return acumulador;
    }
    public static int getnContadores() {
        return nContadores;
    }
    public static int getUltimoContador() {
        return ultimoContador;
    }
    public Contador(int valor) {
        this.valor = valor; 
        acumulador += valor;
        nContadores++;
        ultimoContador = valor;
    }
    public Contador(){
        this(Contador.VALOR_INICIAL);
    }
     public void inc() { 
        this.valor++; 
        acumulador++;
    }
    public int getValor(){ 
        return this.valor;
    }
}
