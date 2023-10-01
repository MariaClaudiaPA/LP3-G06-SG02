package testComposicion;

public class TestComposicion {
	
    public static void main(String[] args) {
    	
        Persona persona1 = new Persona(1, "Pedro", "Gomez");
        Persona persona2 = new Persona(2, "Luis", "Paredes");
        Persona persona3 = new Persona(3, "Rodrigo", "Espino");
        persona1.setCuenta(new Cuenta(1001, 5000.0));
        persona2.setCuenta(new Cuenta(1002, 7500.0));
        persona3.setCuenta(new Cuenta(1003, 8500.0));


        System.out.println("--------------------");
        System.out.println(persona1);
        System.out.println("--------------------");
        System.out.println(persona2);
        System.out.println("--------------------");
        System.out.println(persona3);
    }
}
