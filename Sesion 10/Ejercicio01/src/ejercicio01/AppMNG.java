package ejercicio01;

public class AppMNG {

    public static void main(String[] args) throws Exception {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        Float[] floatArray = {1.12f, 2.22f, 3.32f, 4.42f, 5.52f};
        Boolean[] boolArray = {true, false, true, false};
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
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray boolArray contiene:%n");
        imprimirArray(boolArray);
        System.out.printf("%nArray personaArray contiene:%n");
        imprimirArray(personaArray);   
        
        
        String[] stringArray = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};

        System.out.printf("%nArray stringArray contiene:%n");
        imprimirArray(stringArray);
    }
    //Método Génerico
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
    //Método No Génerico
    public static void imprimirArray(String[] inputArray) {
        int columnas = 4; // Ajusta la cantidad de columnas 
        int contador = 0;

        for (String elemento : inputArray) {
            System.out.printf("%-10s", elemento);
            contador++;

            if (contador == columnas) {
                System.out.println();
                contador = 0;
            }
        }
        // Asegura un salto de línea al final si no se completa la última fila
        if (contador > 0) {
            System.out.println();
        }
    }
}

