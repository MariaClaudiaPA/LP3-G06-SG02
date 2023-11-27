package ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;

class Dictionary<K, V> {

    private ArrayList<Par<K, V>> pares;

    public Dictionary() {
        this.pares = new ArrayList<>();
    }

    public void add(K clave, V valor) {
        Par<K, V> nuevoPar = new Par<>(clave, valor);
        pares.add(nuevoPar);
    }

    public boolean delete(K clave) {
        Iterator<Par<K, V>> iterador = pares.iterator();
        while (iterador.hasNext()) {
            Par<K, V> par = iterador.next();
            if (par.getClave().equals(clave)) {
                iterador.remove();
                return true;
            }
        }
        return false;
    }

    public V getValue(K clave) throws ObjectNotExist {
        for (Par<K, V> par : pares) {
            if (par.getClave().equals(clave)) {
                return par.getValor();
            }
        }
        throw new ObjectNotExist("Clave no encontrada: " + clave);
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (Par<K, V> par : pares) {
            resultado.append(par.toString()).append("\n");
        }
        return resultado.toString();
    }
}
