/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contadorTest;
public class ContadorTest2 {
    public static void main(String[] args) {
        Contador c1 = new Contador();     
        System.out.println("V.Inicial de c1: " + c1.getValor());
        Contador c2 = new Contador(5);
        System.out.println("V.Inicial de c2: " + c2.getValor());     
        c1.inc();
        c2.inc();
        System.out.println("Valor de c1 despues de aumentar: " + c1.getValor());
        System.out.println("Valor de c2 despues de aumentar: " + c2.getValor());
        System.out.println("Valor acumulado: " + Contador.acumulador());
    }
}

