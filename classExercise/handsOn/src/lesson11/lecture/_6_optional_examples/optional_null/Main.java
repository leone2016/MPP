package lesson11.lecture._6_optional_examples.optional_null;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Optional<String> optional = Optional.of(null);//throw NullPointerException
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println("Is present: " + optional.isPresent());

        Optional<Integer> optional2 = Optional.ofNullable(10);
        System.out.println("Is present: " + optional2.isPresent());
        optional2.ifPresent(System.out::println);

        System.out.println(optional2.orElseThrow());


    }

}
