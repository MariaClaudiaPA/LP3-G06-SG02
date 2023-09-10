/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crediticio;
import java.util.Random;
public class Crediticio {
    public static void main(String[] args) {
        int personas = 8;
        int[] genero = new int[personas];
        int[] work = new int[personas];
        int[] sueldo = new int[personas];
        int M = 0;
        int F = 0;
        int M_W = 0;
        int F_W = 0;
        int S_M = 0;
        int S_F = 0;
        Random random = new Random();
        for (int i = 0; i < personas; i++) {
        	genero[i] = random.nextInt(2) + 1;
        	work[i] = random.nextInt(2) + 1; 
            sueldo[i] = work[i] == 1 ? random.nextInt(3001) + 950 : 0;
        }
        for (int i = 0; i < personas; i++) {
            if (genero[i] == 1) {
               M++;
                if (work[i] == 1) {
                    M_W++;
                    S_M += sueldo[i];
                }
            } else {
                F++;
                if (work[i] == 1) {
                    F_W++;
                    S_F += sueldo[i];
                }
            }
        }
        double P_M = (double) M/personas * 100;
        double P_F = (double) F/personas * 100;
        double PMW = (double) M_W/personas*100;
        double PFW = (double) F_W/personas*100;
        double SPM = M_W > 0 ? (double) S_M/M_W: 0;
        double SPF = F_W > 0 ? (double) S_F/F_W : 0;

  
        System.out.println("Evaluacion crediticia:");
        System.out.println("---------------------------------------------------");
        System.out.println("Porcentaje masculino: " + P_M + "%");
        System.out.println("Porcentaje femenino: " + P_F + "%");     
        System.out.println("---------------------------------------------------");
        System.out.println("Porcentaje masculino que trabaja: " + PMW + "%");
        System.out.println("Porcentaje femenino que trabaja: " + PFW + "%");        
        System.out.println("---------------------------------------------------");        
        System.out.println("Promedio del sueldo masculino: S/." + SPM);
        System.out.println("Promedio del sueldo femenino: S/." + SPF);
    }
}


