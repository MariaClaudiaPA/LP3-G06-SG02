package actividad01;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};

        // Float
        Float[] floatArray = {1.12f, 2.22f, 3.32f, 4.42f, 5.52f};

        // Boolean
        Boolean[] boolArray = {true, false, true, false};

        // Persona
        Persona[] personaArray = {
                new Persona("70963259", "Marco", "Av Dolores"),
                new Persona("87452136", "Ana", "JLByR"),
                new Persona("78985632", "Carlos", "Cayma")
        };
        
        System.out.printf("%nArray intArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        
        // Imprimir arreglos Float y Boolean
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray boolArray contiene:%n");
        imprimirArray(boolArray);
        
        // Imprimir arreglo Persona
        System.out.printf("%nArray personaArray contiene:%n");
        imprimirArray(personaArray);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }   
}
