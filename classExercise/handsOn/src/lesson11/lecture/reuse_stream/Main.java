package lesson11.lecture.reuse_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //another way of cfreating streams is to use the Stream.of() method

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<String> stream2 = Stream.of("a", "b", "c", "d", "e");

        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");
        Stream<String> stream3 = stringList.stream();
        Stream<String> stream4 = stream3.map(String::toUpperCase);

        //Stream.of() can also be used to create a stream from an array
        String[] stringArray = {"f", "g", "h", "i", "j"};
        Stream<String> stream5 = Stream.of(stringArray);

//        stream3.forEach(System.out::println); TODO: stream3 is reused in stream4, so it cannot be used again
        //terminal Operation is the operation that consumes the stream and produces a result
        // example of terminal operation is forEach, count, collect, etc.

        // intermediate operations are the operations that return a new stream
        // example of intermediate operation is map, filter, flatMap, etc.
        stream.forEach(System.out::println);

    }
}
