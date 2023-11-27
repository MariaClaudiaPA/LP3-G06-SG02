package ejercicio01;

public class App01 {

    public static void main(String[] args) {
        try {
            CandyBags candyBag = new CandyBags(5);

            //Añadir dulces
            Goodies candy1 = new Goodies(1, "Chocolate", 2.5f);
            Goodies candy2 = new Goodies(2, "Gomitas", 1.8f);
            Goodies candy3 = new Goodies(3, "Paletas", 1.0f);
            Goodies candy4 = new Goodies(4, "Sapitos", 4.0f);
            Goodies candy5 = new Goodies(5, "Chicles", 1.3f);
            Goodies candy6 = new Goodies(6, "Papitas", 2.3f);

            candyBag.add(candy1);
            candyBag.add(candy2);
            candyBag.add(candy3);
            candyBag.add(candy4);
            candyBag.add(candy5);

            System.out.println("\nBolsa de dulces: " + candyBag);
//
//            // Añadir màs dulces (no deberìan ser añadidos)
//            candyBag.add(candy6);

            // Dulce màs barato
            Goodies cheapestCandy = candyBag.cheapest();
            System.out.println("\nDulce mas barato: " + cheapestCandy);

            // Dulces màs caros
            Bag<Goodies> expensiveCandies = candyBag.mostExpensive(2);
            System.out.println("\nLos 2 dulces mas caro: " + expensiveCandies);
        } catch (IsFull | IsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}

