package actividad04;

public class AppCuatro {
    public static void main(String[] args) {
        Bag<Goodies> bolsaDeGoodies = new Bag<>();

        try {
            Goodies g1 = new Goodies(1, "Goodie Fresa", 10.0f);
            Biscuits b1 = new Biscuits(2, "Galleta de Chocolate", 15.0f, "Chocolate");
            Chocolates c1 = new Chocolates(3, "Chocolate Oscuro", 5.0f, "Oscuro");
            Soda s1 = new Soda(4, "Galleta de Cola", 20.0f, "Cola", "Cola Soda");
            Sweet sw1 = new Sweet(5, "Galleta de Caramelo", 18.0f, "Caramelo", "Caramelo Dulce");

            bolsaDeGoodies.add(g1);
            System.out.println("Se a�adi� " + g1 + " a la bolsa.");
            
            bolsaDeGoodies.add(b1);
            System.out.println("Se a�adi� " + b1 + " a la bolsa.");
            
            bolsaDeGoodies.add(c1);
            System.out.println("Se a�adi� " + c1 + " a la bolsa.");
            
            bolsaDeGoodies.add(s1);
            System.out.println("Se a�adi� " + s1 + " a la bolsa.");
            
            bolsaDeGoodies.add(sw1);
            System.out.println("Se a�adi� " + sw1 + " a la bolsa.");

            System.out.println(bolsaDeGoodies.toString());

            try {
                Goodies[] objetosEnBolsa = bolsaDeGoodies.getObjects();
                System.out.println("\nObjetos en la bolsa:");
                for (Goodies goodies : objetosEnBolsa) {
                    System.out.println(goodies.toString());
                }
                
                Biscuits biscuitParaEliminar = new Biscuits(2, "Galleta de Chocolate", 15.0f, "Chocolate");
                
                bolsaDeGoodies.remove(biscuitParaEliminar);
                System.out.println("\nSe elimin� " + biscuitParaEliminar + " de la bolsa.");

                System.out.println(bolsaDeGoodies.toString());

                int indice = bolsaDeGoodies.getIndex(sw1);
                if (indice != -1) {
                    System.out.println("\nEl objeto de ' Soda'  est� en la posici�n " + indice + " de la bolsa.");
                } else {
                    System.out.println("\nEl objeto no est� en la bolsa.");
                }
            } catch (ObjectNoExist | IsEmpty e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IsFull e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
