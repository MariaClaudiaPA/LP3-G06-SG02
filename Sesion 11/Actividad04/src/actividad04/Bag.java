package actividad04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Bag<T extends Goodies> {

    private static final int Capacidad_Max = 10;
    private List<T> goodiesList;

    public Bag() {
        goodiesList = new ArrayList<>();
    }

    public void add(T goodies) throws IsFull {
        if (goodiesList.size() < Capacidad_Max) {
            goodiesList.add(goodies);
        } else {
            throw new IsFull("\nLa bolsa esta llena, no se puede añadir mas objetos");
        }
    }

    public T[] getObjects() throws IsEmpty {
        if (goodiesList.isEmpty()) {
            throw new IsEmpty("Bag is empty.");
        }
        return goodiesList.toArray((T[]) Array.newInstance(goodiesList.get(0).getClass(), goodiesList.size()));
    }

    public void remove(T goodies) throws ObjectNoExist {
        if (goodiesList.contains(goodies)) {
            goodiesList.remove(goodies);
        } else {
            throw new ObjectNoExist("\nEl objeto no existe en la bolsa");
        }
    }

    public int getIndex(T goodies) {
        return goodiesList.indexOf(goodies);
    }

    public String toString() {
        StringBuilder result = new StringBuilder("\nContenidos de la bolsa:\n");
        for (T goodies : goodiesList) {
            result.append(goodies.toString()).append("\n");
        }
        return result.toString();
    }
}
