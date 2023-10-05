package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
  private  List<Component> components;
  private  int index;

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Pharmacy addComponent(Component component) {
        if (components == null) throw new NullPointerException("Компонент не может быть null");
        components.add(component);
        return this;
    }

    public int getFullPower() {
        int count = 0;
        for(Component component : components) {
            count+=component.getPower();
        }
        return count;
    }
    public String getPharmacyName() {
        StringBuilder sb = new StringBuilder();
        for (Component component : components) {
            sb.append(component.getName());
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return "Pharmacy{" + "components=" + components + ", index=" + index + '}';
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }

//    @Override
//    public Iterator<Component> iterator() {
//        return new PharmacyIterator();
//    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Pharmacy o) {
        int fullPower = o.getFullPower();
        if (this.getFullPower() > fullPower){
            return 1;
        }
        if (this.getFullPower() < fullPower){
            return -1;
        }
        if (this.getFullPower() == o.getFullPower()) {
            int length = this.getPharmacyName().compareTo(o.getPharmacyName());
            if (length > 0){
                return 1;
            }
            if (length < 0){
                return -1;
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return pharmacy.getFullPower() == this.getFullPower();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getFullPower());
    }
}

