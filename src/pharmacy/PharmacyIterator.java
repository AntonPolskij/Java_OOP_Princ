package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyIterator implements Iterator {
    private List<Component> components;
    private  int index;

    public PharmacyIterator() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Object next() {
        return components.get(index++);
    }
}