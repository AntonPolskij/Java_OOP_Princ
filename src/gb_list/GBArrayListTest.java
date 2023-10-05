package gb_list;

import org.junit.jupiter.api.Assertions;


import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GBArrayListTest {

    @org.junit.jupiter.api.Test
    void add() {
        GBList<Integer> list = new GBArrayList<>();
        list.add(5);
        Assertions.assertTrue(list.add(1));
        Assertions.assertEquals(5, list.get(0));
        Assertions.assertNotEquals(5,list.get(1));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        GBList<Integer> list = new GBArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.remove(0);
        Assertions.assertEquals(2,list.size());
        list.add(3);
        Assertions.assertNotEquals(2,list.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        GBList<String> list = new GBArrayList<>();
        list.add("Антон");
        Assertions.assertEquals("Антон", list.get(0));
        Assertions.assertNotEquals("антон", list.get(0));
    }

    @org.junit.jupiter.api.Test
    void size() {
        GBList<String> list = new GBArrayList<>();
        list.add("Gg");
        Assertions.assertEquals(1,list.size());
        Assertions.assertNotEquals(3, list.size());
    }

    @org.junit.jupiter.api.Test
    void update() {
        GBList<Integer> list = new GBArrayList();
        list.add(3);
        list.update(0, 19998);
        Assertions.assertEquals(19998, list.get(0));
        Assertions.assertNotEquals(2,list.get(0));
    }
}