package ejercicio03;

public class isEqualsTo {
    public static void main(String[] args) {

        // Prueba con String
        String str1 = "Azul";
        String str2 = "Amarillo";
        System.out.println("String: " + isEqualTo(str1, str2));

        // Prueba con Integer
        int int1 = 42;
        int int2 = 42;
        System.out.println("Integer: " + isEqualTo(int1, int2));

        // Prueba con Double
        double double1 = 3.15;
        double double2 = 3.15;
        System.out.println("Double: " + isEqualTo(double1, double2));

        // Prueba con Char
        char char1 = 'h';
        char char2 = '?';
        System.out.println("Char: " + isEqualTo(char1, char2));

        // Prueba con Object
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Object: " + isEqualTo(obj1, obj1));

        // Prueba con Float
        Float float1 = 1.23f;
        Float float2 = 1.24f;
        System.out.println("Float: " + isEqualTo(float1, float2));

        // Prueba con Persona (dni, nombre, hace la comparación por edad)
        Persona persona1 = new Persona("123456789", "Juan", 25);
        Persona persona2 = new Persona("987654321", "Maria", 25);
        System.out.println("Persona: " + isEqualTo(persona1, persona2));
    }

    // Método genérico simple
    public static <T> boolean isEqualTo(T e1, T e2) {
        // Si ambos objetos son nulos, consideramos que son iguales
        if (e1 == null && e2 == null) {
            return true;
        }
        // Si uno de los objetos es nulo y el otro no, consideramos que no son iguales
        if (e1 == null || e2 == null) {
            return false;
        }
        // Utilizamos el método equals para comparar los objetos
        return e1.equals(e2);
    }
}
