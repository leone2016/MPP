package lesson13.lecture._1_pre_jdk5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // how the list was created before jdk 1.5
        List list = new ArrayList();
        list.add("Tom");
        list.add(10);
        list.add(true);
        System.out.println(list);

        //access the first data and store it in variable

        String name = (String) list.get(0);
        int age = (Integer) list.get(1);
        boolean isMarried = (Boolean) list.get(2);

    }
}
