package actividad02;

public class AppDos {
    public static void main(String[] args) {

        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(127, 234);
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(2003, "Noviembre");
        Persona persona = new Persona("Adriana", "Cayma", "966301234");
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("Informacion de la Persona1", persona);

        System.out.println("Par ordenado (Integer, Integer)");
        System.out.println(pair1);
        System.out.println("\nPar ordenado (Integer, String)");
        System.out.println(pair2);
        System.out.println("\nPar ordenado (String, Persona)");
        System.out.println(pair3);

        pair1.setKey(2003);
        pair1.setValue(269);
        System.out.println("\nModificacion del Par1 " + pair1);

        pair2.setKey(2004);
        pair2.setValue("Abril");
        System.out.println("\nModificacion del Par2 " + pair2);

        Persona persona2 = new Persona("Andrea", "Miraflores", "964164634");
        pair3.setKey("Informacion de la Persona2");
        pair3.setValue(persona2);
        System.out.println("\nModificacion del Par3 " + pair3);
    }
}









