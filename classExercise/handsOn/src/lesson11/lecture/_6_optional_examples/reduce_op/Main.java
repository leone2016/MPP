package lesson11.lecture._6_optional_examples.reduce_op;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        String result = names.stream()
                .reduce("", (curr, acc) -> curr + acc + " ");
        System.out.println("Concatenated names: " + result.trim());
    }
}
