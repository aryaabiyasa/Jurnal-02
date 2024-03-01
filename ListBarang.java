import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListBarang<E extends Comparable<? super E>> {
    private ArrayList<E> list;

    public ListBarang() {
        this.list = new ArrayList<>();
    }

    public void addItem(E data) {
        list.add(data);
    }

    public void removeItem(int index) {
        list.remove(list.get (index));
    }

    public void editItem(E data, int index) {
        list.set(index, data);
    }

    public int size() {
        return list.size();
    }

    public E getIndex(int index) {
        return list.get(index);
    }

    public void sorting() {
        Collections.sort(list);
    }
}
