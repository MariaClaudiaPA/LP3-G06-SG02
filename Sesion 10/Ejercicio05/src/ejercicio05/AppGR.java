package ejercicio05;
import java.util.Scanner;

public class AppGR {

    public <T extends Number> int buscarEnArreglo(T[] arreglo, T valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(valor)) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        AppGR buscador = new AppGR();
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso con un arreglo de tipo Int
        Integer[] arregloInt = {1, 2, 3, 4, 5};
        System.out.println("Ingrese el valor que desea buscar en el arreglo numérico INT:");
        int valorBuscadoNumerico = scanner.nextInt();

        int resultadoInt = buscador.buscarEnArreglo(arregloInt, valorBuscadoNumerico);
        System.out.println("El valor " + valorBuscadoNumerico + " se encuentra en el índice " + resultadoInt);

        // Ejemplo de uso con un arreglo de tipo Double
        Double[] arregloDouble = {1.5, 2.3, 3.7, 4.2, 5.0};
        System.out.println("\nIngrese el valor que desea buscar en el arreglo numérico DOUBLE:");
        double valorBuscadoNumerico2 = scanner.nextDouble();

        int resultadoDouble = buscador.buscarEnArreglo(arregloDouble, valorBuscadoNumerico2);
        System.out.println("El valor " + valorBuscadoNumerico2 + " se encuentra en el índice " + resultadoDouble);

        // Ejemplo de uso con un arreglo de tipo Float
        Float[] arregloFloat = {1.5f, 2.3f, 3.7f, 4.2f, 5.0f};
        System.out.println("\nIngrese el valor que desea buscar en el arreglo numérico FLOAT:");
        float valorBuscadoNumerico3 = scanner.nextFloat();
        
        int resultadoFloat = buscador.buscarEnArreglo(arregloFloat, valorBuscadoNumerico3);
        System.out.println("El valor " + valorBuscadoNumerico3 + " se encuentra en el índice " + resultadoFloat);


//        // Ejemplo de uso con un arreglo de tipo String
//        String[] arregloString = {"apple", "banana", "orange", "grape", "watermelon"};
//        AppGR buscadorString = new AppGR();
//        String valorBuscadoString = "orange";
//       
//        int resultadoString = buscadorString.buscarEnArreglo(arregloString, valorBuscadoString);
//        System.out.println("El valor \"" + valorBuscadoString + "\" se encuentra en el índice " + resultadoString);
//
//        // Ejemplo de uso con un arreglo de tipo char
//        Character[] arregloChar = {'a', 'b', 'c', 'd', 'e'};
//        AppGR buscadorChar = new AppGR();
//        char valorBuscadoChar = 'c';
//        
//        int resultadoChar = buscadorChar.buscarEnArreglo(arregloChar, valorBuscadoChar);
//        System.out.println("El valor '" + valorBuscadoChar + "' se encuentra en el índice " + resultadoChar);
//
//        // Ejemplo de uso con un arreglo de tipo Producto
//        Producto[] arregloProducto = {
//            new Producto(1, "Laptop", 899.99),
//            new Producto(2, "Teléfono", 499.99),
//            new Producto(3, "Tablet", 299.99)
//        };
//        AppGR buscadorProducto = new AppGR();
//        Producto valorBuscadoProducto = new Producto(2, "Teléfono", 499.99);
//        
//        int resultadoProducto = buscadorProducto.buscarEnArreglo(arregloProducto, valorBuscadoProducto);
//        System.out.println("El producto con código " + valorBuscadoProducto.getCodigo() + " se encuentra en el índice " +
//                resultadoProducto);
    }
}

