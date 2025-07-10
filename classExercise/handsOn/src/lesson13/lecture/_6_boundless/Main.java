package lesson13.lecture._6_boundless;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static <T>void copyFirstToEnd(List<T> genericList) { // <? extend Object >
        genericList.add(genericList.get(0)); // compiler error arises because we cannot add to a list with an unbounded wildcard
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        copyFirstToEnd(list);
        System.out.println("List after copying first element to end: " + list);
    }
}
