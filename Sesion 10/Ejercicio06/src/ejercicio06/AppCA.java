package ejercicio06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppCA {
    public static void main(String[] args) {
        // Ejemplo con arrays de String
        String[] arrayString1 = {"Hola", "Vaso", "Plato"};
        String[] arrayString2 = {"Hola", "Taza", "Vaso"};
        String[] resultadoString = copyArray(arrayString1, arrayString2);
        System.out.println("Array de String resultante: " + Arrays.toString(resultadoString));
        System.out.println("--------------------------------");

        // Ejemplo con arrays de Producto
        Producto[] arrayProducto1 = {new Producto("001", "Manzana roja", 1.99),
                                     new Producto("002", "Papaya fresca", 2.50)};
        Producto[] arrayProducto2 = {new Producto("002", "Papaya fresca", 2.50),
                                     new Producto( "003", "Kiwi verde", 3.99)};
        Producto[] resultadoProducto = copyArray(arrayProducto1, arrayProducto2);
        System.out.println("Array de Producto resultante: " + Arrays.toString(resultadoProducto));
        System.out.println("--------------------------------");

        // Ejemplo con arrays de Persona
        Persona[] arrayPersona1 = {new Persona("Julian", "78965232", "Dolores"),
                                   new Persona("Maria", "78962521", "Miraflores")};
        Persona[] arrayPersona2 = {new Persona("Maria", "78962521", "Miraflores"),
                                   new Persona("Pedro", "78967232", "Calle Colombia")};
        Persona[] resultadoPersona = copyArray(arrayPersona1, arrayPersona2);
        System.out.println("Array de Persona resultante: " + Arrays.toString(resultadoPersona));
        System.out.println("--------------------------------");
 }
    
    static <T> T[] copyArray(T[] array1, T[] array2) {
        List<T> resultList = new ArrayList<>();

        // Agregar elementos de array1
        resultList.addAll(Arrays.asList(array1));
        // Agregar elementos de array2 si no están 
        for (T element : array2) {
            if (!resultList.contains(element)) {
                resultList.add(element);
            }
        }
        // Convertir la lista a un array del tipo T
        return resultList.toArray(Arrays.copyOf(array1, 0));
    }

}

