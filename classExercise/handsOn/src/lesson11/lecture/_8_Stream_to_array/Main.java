package lesson11.lecture._8_Stream_to_array;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> name = List.of("Tom", "Jerry", "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah");

        Stream<String> stream = name.stream();
        //convert it to an array
        String[] s = stream.toArray(String[]::new);// Type[]::new is a method reference that creates a new array of the specified type.


    }
}
