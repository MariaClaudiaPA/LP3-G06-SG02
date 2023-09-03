/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contadorTest;

public class ContadorTest3 {

    public static void main(String[] args) { 
        System.out.println("Num de contadores creados: " + Contador.getnContadores());
        System.out.println("V.Inicial del ultimo contador creado: " + Contador.getUltimoContador());
        
        Contador c1 = new Contador(5);
        System.out.println("c1: " + c1.getValor());
        
        Contador c2 = new Contador();
        System.out.println("c2: " + c2.getValor());
        
        Contador c3 = new Contador(8);
        System.out.println("c3: " + c3.getValor());
        
        System.out.println("Num de contadores creados: " + Contador.getnContadores());
        System.out.println("V.Inicial del ultimo contador creado: " + Contador.getUltimoContador());
        System.out.println("Valor acumulado: " + Contador.acumulador());
    }
}

