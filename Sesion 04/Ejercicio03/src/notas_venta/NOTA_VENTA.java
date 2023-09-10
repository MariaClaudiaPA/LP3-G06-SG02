/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas_venta;

import java.util.Scanner;

public class NOTA_VENTA {
    public static void main(String[] args) {
        int V = 4;
        int P = 5;
        double T_P = 0;
        double[][] Ventas = new double[P][V];
        double[] VTPV = new double[V];
        double[] VTPP = new double[P];
        Scanner scanner = new Scanner(System.in);
        System.out.println("NOTA DE VENTAS DE LA COMPAÑIA:");
        System.out.println("--------------------------------------------------------------");
        for (int v = 0 ; v < V ; v ++ ) {
        	System.out.println("Vendedor Nro " +(v + 1) + ": ");
            for (int p = 0 ; p < P ; p ++ ) {
                System.out.print("Ingrese el valor del " + (p + 1) + " producto que le cobro el vendedor: ");
                Ventas[p][v] = scanner.nextDouble();
            }
            System.out.println("-------------------------------------------------------------");
        }
        for (int v = 0; v < V; v++) {
            for (int p = 0; p < P; p++) {
            	VTPV[v] += Ventas[p][v];
                VTPP[p] += Ventas[p][v];
            }
        }
        
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("El resumen de ventas totales del utlimo mes por vendedor:");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.print("Producto_nro\t");
        
        for (int v = 0 ; v < V ; v ++ ) {
            System.out.print("Vendedor_" + (v + 1) +"\t");
        }
       
        System.out.println("Total_Producto");      
        System.out.println("----------------------------------------------------------------------------------------------");
        for (int p = 0 ; p < P ; p ++) {
        	
            System.out.print("Producto_" + (p + 1) +"\t");
            
            for (int v = 0 ; v < V ; v ++ ) {
            	
                System.out.print(Ventas[p][v] + ".S/.\t\t");           
            }           
            System.out.println(VTPP[p]+" S/.");
        }
       
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.print("Total_V\t\t");
        
        for (int v = 0; v < V; v++) {
            System.out.print(VTPV[v] + ".S/.\t\t");
        }
        
        for (double total : VTPV) {
        	T_P += total;
        }
        System.out.println(T_P+" S/.");
        scanner.close();
    }
}