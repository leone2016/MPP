package lesson11.lecture.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // This is a placeholder for the main method.
        // You can implement terminal operations here using Stream API.
        // For example, you can create a stream of integers and perform operations like sum, average, etc.

        // Example:
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> stream = num.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .toList();

        System.out.println("Even numbers squared: " + stream);

        //collect the [rpocessed stream into a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());



        Set<Integer> uniqueNumbers = Stream.of(1, 2, 3, 4, 5, 1, 2)
                .collect(Collectors.toSet());
        System.out.println("Unique numbers: " + uniqueNumbers);




    }
}
