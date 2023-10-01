package testAbstracto;

public class TestAbstracto {

    public static void main(String[] args) {
        Rectangulo r1;
        r1 = new Rectangulo(12.5, 23.7);
        System.out.println("Area de r1 = " + r1.area());

        Rectangulo r2 = new Rectangulo(8.6, 33.1);
        System.out.println("Area de r2 = " + r2.toString());

        if (r1.mayorQue(r2)) {
            System.out.println("El rectangulo de mayor area es r1");
        } else {
            System.out.println("El rectangulo de mayor area es r2 ");
        }
    }
}
