package lesson11.lecture._7_filter_null_value;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class main {

    public static void main(String[] args) {
        String[] strings = {"Hello", null, "World", null, "Java", "Stream", null, "Example"};
//        List<String> list = List.of(strings);// give an error because of null values

//        //remove null values and convert all word in uppercase
//        Arrays.stream(strings)
//                .filter(s -> s != null) // filter out null values
//                .filter(Objects::nonNull)// filter out null values, s -> Objects.nonNull(s)
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

//        Arrays.stream(strings)
//                .filter(Objects::nonNull) // filter out null values
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

        Arrays.stream(strings)
                .map(data -> Optional.ofNullable(data).orElse("")) // filter out null values
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));



    }
}
