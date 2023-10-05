package gb_list;

 public interface GBList<Y> extends Iterable<Y> {
        boolean add(Y y);
        void remove(int index);
        Y get(int index);
        int size();
        void update(int index, Y y);
    }
