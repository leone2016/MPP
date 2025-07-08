package lesson11.lecture._6_optional_examples.min_max;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream integerStream = IntStream.rangeClosed(1, 10);
        // Find the maximum value in the stream
        System.out.println(integerStream.max());
//        System.out.println(integerStream.min()); give error because the stream has already been consumed by the max() operation

        // To find the minimum value, we need to create a new stream
        IntStream integerStream2 = IntStream.rangeClosed(1, 10);
        System.out.println(integerStream2.min());

        // To find the sum of all elements in the stream
        IntStream integerStream3 = IntStream.rangeClosed(1, 10);
        System.out.println(integerStream3.sum());

        // To find the average of all elements in the stream
        IntStream integerStream4 = IntStream.rangeClosed(1, 10);
        System.out.println(integerStream4.average());

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        integerList.stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);

        integerList.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        integerList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);

        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
        words.stream()
                .mapToInt(String::length)
                .min()
                .ifPresent(System.out::println);

    }
}
