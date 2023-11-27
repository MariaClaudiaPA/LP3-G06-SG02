package ejercicio01;

import java.util.Arrays;
import java.util.Comparator;

public class CandyBags extends Bag<Goodies> {

    public CandyBags(int n) {
        super(n);
    }

    @Override
    public void add(Goodies obj) throws IsFull, IsEmpty {
        if (!containsObject(obj)) {
            super.add(obj);
        }
    }

    public Goodies cheapest() throws IsEmpty {
        Goodies[] objects = getObjects();
        if (objects.length > 0) {
            return Arrays.stream(objects)
                    .min(Comparator.comparingDouble(Goodies::getPrice))
                    .orElse(null);
        } else {
            throw new IsEmpty("La bolsa de golosinas está vacía. No hay golosinas para obtener.");
        }
    }

    public Bag<Goodies> mostExpensive(int n) throws IsEmpty, IsFull {
        Goodies[] objects = getObjects();
        if (objects.length > 0) {
            Arrays.sort(objects, Comparator.comparingDouble(Goodies::getPrice).reversed());
            Bag<Goodies> expensiveBag = new Bag<>(n);
            for (int i = 0; i < Math.min(n, objects.length); i++) {
                expensiveBag.add(objects[i]);
            }
            return expensiveBag;
        } else {
            throw new IsEmpty("La bolsa de golosinas está vacía. No hay golosinas para obtener.");
        }
    }

    private boolean containsObject(Goodies obj) throws IsEmpty {
        for (int i = 0; i < getCount(); i++) {
            if (getObjects()[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
