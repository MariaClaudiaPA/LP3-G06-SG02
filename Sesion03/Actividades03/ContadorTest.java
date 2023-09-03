/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorTest;

public class ContadorTest {

    public static void main(String[] args) { 
        Contador c1, c2;
        System.out.println(Contador.acumulador());
        c1= new Contador(3);
        c2= new Contador(10);
        c1.inc();
        c1.inc();
        c2.inc();
        System.out.println(c1.getValor());
        System.out.println(c2.getValor());
        System.out.println(Contador.acumulador);
    }
}
