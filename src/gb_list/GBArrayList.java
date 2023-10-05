package gb_list;

import java.util.Arrays;
import java.util.Iterator;

public class GBArrayList<T> implements GBList<T> {
    private T[] values;

    @SuppressWarnings("unchecked")
    public GBArrayList() {
        this.values = (T[]) new Object[0];
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean add(T t) {

        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[temp.length] = t;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {
        values[index] = t;

    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        return "GBArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
