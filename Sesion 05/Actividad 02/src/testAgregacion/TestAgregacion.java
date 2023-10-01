package testAgregacion;

public class TestAgregacion {
	
    public static void main(String[] args) {
        Motor motor1 = new Motor(1121, 4000);
        Automovil auto1 = new Automovil("VQK421", 4, "Chevrolet", "Equinox");
        auto1.setMotor(motor1); 
        System.out.println("Datos del Automóvil:");
        System.out.println("------------------------------------");
        System.out.println(auto1.toString());
        System.out.println("------------------------------------");
        System.out.println("Informacion del Motor:");
        System.out.println("------------------------------------");
        System.out.println(auto1.getMotor().toString());
    }
}