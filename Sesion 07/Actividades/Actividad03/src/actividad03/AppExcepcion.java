package actividad03;

public class AppExcepcion {
    public static void main(String[] args) {
        try {
            metodol();
        } catch (Exception excepcion) {
            System.out.println("La excepcion se manejo en main");
        }
        metodo2();
    }
    public static void metodol() throws Exception {
        try {
            System.out.println("Metodol");
            throw new Exception();
        } catch (Exception excepcion) {
            System.out.println("La excepcion se manejo en el metodol");
            throw excepcion;
        } finally {
            System.out.println("Se ejecuto finally en metodol");
        }
    }
    public static void metodo2() {
        try {
            System.out.println("Metodo metodo2");
        } catch (Exception excepcion) {
            System.out.println(excepcion);
        } finally {
            System.out.println("Se ejecuto finally en metodo2");
        }
        System.out.println("Fin del metodo2");
    }
}
