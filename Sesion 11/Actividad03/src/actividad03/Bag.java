package actividad03;

import java.util.Arrays;

public class Bag<T> {

    private T[] list;
    private int count;

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        if (count < list.length) {
            list[count++] = obj;
        } else {
            throw new IsFull("La bolsa está llena. No se puede agregar más objetos.");
        }
    }

    public T[] getObjects() throws IsEmpty {
        if (count > 0) {
            return Arrays.copyOf(list, count);
        } else {
            throw new IsEmpty("La bolsa está vacía. No hay objetos para devolver.");
        }
    }

    public T remove(T obj) throws ObjectNoExist {
        int index = getIndex(obj);
        if (index != -1) {
            T removedObject = list[index];
            for (int i = index; i < count - 1; i++) {
                list[i] = list[i + 1];
            }
            count--;
            return removedObject;
        } else {
            throw new ObjectNoExist("El objeto no existe en la bolsa. No se puede eliminar.");
        }
    }
    
    public int getIndex(T obj) {
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
}
