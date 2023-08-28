public class Suma_de_Numeros_Pares {
    public static void main(String[] args) {
        int limite = 20;
        int suma = 0;

        for (int i = 2; i <= limite; i += 2) {
            suma += i;
        }

        System.out.println("La suma de los números pares hasta " + limite + " es: " + suma);
    }
}
