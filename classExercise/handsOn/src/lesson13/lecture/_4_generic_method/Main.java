package lesson13.lecture._4_generic_method;

import java.util.Arrays;
import java.util.List;

public class Main {
    static <T>void print(T[] array) {
        System.out.println("Array contents: "+ array.getClass().getSimpleName());
        Arrays.stream(array).forEach(System.out::println);
    }

    static <T>void print(List<T> list) {
        System.out.println("List contents: "+ list.getClass().getSimpleName());
        list.forEach(System.out::println);
    }


    public static void main(String[] args) {
        print(new Integer[]{1, 2, 3});
        print(new String[]{"Hello", "World"});
        print(new Double[]{1.1, 2.2, 3.3});
        print(Arrays.asList("Apple", "Banana", "Cherry"));
        print(Arrays.asList(1, 2, 3, 4, 5));
        print(Arrays.asList(1.1, 2.2, 3.3, 4.4));
    }
}
