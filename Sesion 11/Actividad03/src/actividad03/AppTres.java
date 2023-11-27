package actividad03;

import java.util.Arrays;

public class AppTres {

    public static void main(String[] args) {
        try {
            // Bolsa de enteros
            Bag<Integer> integerBag = new Bag<>(5);
            integerBag.add(1);
            integerBag.add(2);
            integerBag.add(3);
            integerBag.add(4);
            integerBag.add(5);

            // Bolsa de cadenas
            Bag<String> stringBag = new Bag<>(4);
            stringBag.add("Chocolate");
            stringBag.add("Caramelos");
            stringBag.add("Ole Ole");

            // Bolsa de personas
            Bag<Persona> personaBag = new Bag<>(2);
            personaBag.add(new Persona("John", 30));
            personaBag.add(new Persona("Jane", 25));

            // Mostrar contenido de las bolsas
            System.out.println("\nContenido de la bolsa de enteros:");
            displayBagContent(integerBag);

            System.out.println("\nContenido de la bolsa de cadenas:");
            displayBagContent(stringBag);

            System.out.println("\nContenido de la bolsa de personas:");
            displayBagContent(personaBag);

            // Ejemplo de operaciones adicionales
            System.out.println("\nRemoviendo el objeto '2' de la bolsa de enteros: " + integerBag.remove(2));
            System.out.println("Contenido de la bolsa de enteros después de remover '2':");
            displayBagContent(integerBag);

            System.out.println("\nPosición del objeto 'Caramelos' en la bolsa de cadenas: " + stringBag.getIndex("Caramelos"));

            // Intentar obtener objetos de una bolsa vacía
            Bag<Integer> emptyBag = new Bag<>(0);
            displayBagContent(emptyBag);  // Lanzar IsEmpty directamente

        } catch (IsFull | ObjectNoExist | IsEmpty e) {
            System.out.println("\nExcepción: " + e.getMessage());
        }
    }

    private static <T> void displayBagContent(Bag<T> bag) throws IsEmpty {
        T[] objects = bag.getObjects();
        if (objects.length == 0) {
            throw new IsEmpty("\nLa bolsa está vacía. No hay elementos para mostrar.");
        }
        System.out.println(Arrays.toString(objects));
    }
}
