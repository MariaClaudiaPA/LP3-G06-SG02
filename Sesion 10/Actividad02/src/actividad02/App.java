package actividad02;

public class App {

    public static void main(String[] args) throws Exception {
        try {
            Integer minimoInteger = minimo(5, 2, 8, 3);
            System.out.println("Mínimo Integer: " + minimoInteger);

            Double minimoDouble = minimo(3.5, 3.8, 3.2, 3.4);
            System.out.println("Mínimo Double: " + minimoDouble);

            String minimoString = minimo("manzana", "pera", "uva", "kiwi");
            System.out.println("Mínimo String: " + minimoString);

            Persona persona1 = new Persona("70963259", "Percy", "Av Dolores");
            Persona persona2 = new Persona("87452136", "Karla", "JLByR");
            Persona persona3 = new Persona("78985632", "Manuel", "Cayma");
            Persona persona4 = new Persona("78541362", "Alexa", "Miraflores");

            Persona minimaPersona = minimo(persona1, persona2, persona3, persona4);
            System.out.println("Mínimo Persona: " + minimaPersona);
        } catch (Exception e) {
            // Manejar la excepción de manera apropiada, por ejemplo, imprimir un mensaje de error.
            System.out.println("Ocurrió una excepción: " + e.getMessage());
        }
    }

    public static <T extends Comparable<T>> T minimo(T a, T b, T c, T d) {
        T minimo = a;

        if (b.compareTo(minimo) < 0) {
            minimo = b;
        }

        if (c.compareTo(minimo) < 0) {
            minimo = c;
        }

        if (d.compareTo(minimo) < 0) {
            minimo = d;
        }

        return minimo;
    }
}
