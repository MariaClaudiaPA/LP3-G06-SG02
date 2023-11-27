package ejercicio01;

import java.util.Arrays;

public class Bag<T> {

    private Goodies[] list;
    private int count;

    public Bag(int n) {
        this.list = new Goodies[n];
        this.count = 0;
    }

     public void add(T obj) throws IsFull, IsEmpty {
        if (count < list.length) {
            list[count++] = (Goodies) obj;
        } else {
            throw new IsFull("La bolsa está llena. No se puede agregar más objetos.");
        }
    }

    public Goodies[] getObjects() throws IsEmpty {
        if (count > 0) {
            return Arrays.copyOf(list, count);
        } else {
            throw new IsEmpty("La bolsa está vacía. No hay objetos para devolver.");
        }
    }

    public Goodies remove(Goodies obj) throws ObjectNoExist {
        int index = getIndex(obj);
        if (index != -1) {
            Goodies removedObject = list[index];
            for (int i = index; i < count - 1; i++) {
                list[i] = list[i + 1];
            }
            count--;
            return removedObject;
        } else {
            throw new ObjectNoExist("El objeto no existe en la bolsa. No se puede eliminar.");
        }
    }

    public int getIndex(Goodies obj) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Bolsa:( ");
        for (int i = 0; i < count; i++) {
            result.append(list[i]);
            if (i < count - 1) {
                result.append(", ");
            }
        }
        result.append(") ");
        return result.toString();
    }

    public int getCount() {
        return count;
    }
}
