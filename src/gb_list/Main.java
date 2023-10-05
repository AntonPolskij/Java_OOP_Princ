package gb_list;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(3);
        System.out.println(list.get(1));
        list.update(1, 9);
        System.out.println(list);


    }
}
