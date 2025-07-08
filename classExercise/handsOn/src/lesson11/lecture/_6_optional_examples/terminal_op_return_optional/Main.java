package lesson11.lecture._6_optional_examples.terminal_op_return_optional;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Bob", "David");
        String nameToFind = "Bob";
        String result = names.stream()
                .filter(name -> name.equals(nameToFind))
                .findFirst()
                .orElse("Name not found");

        List<String> extractedContent = List.of("Today", ",", "I'm going", "to", "speak", "about", "optional", "and", "streams", ".", "I'll", "also", "discuss", "how", "to", "handle", "murder", "words", "in", "text", ".");

        //from our DB
        List<String> sensitiveWords = List.of("hate", "violence", "murder");

        extractedContent.stream()
                .filter(word -> sensitiveWords.contains(word))
                .findFirst()
                .ifPresent(System.out::println);

        extractedContent.stream()
                .filter(word -> sensitiveWords.contains(word))
                .findAny()
                .ifPresent(System.out::println);

    }
}
