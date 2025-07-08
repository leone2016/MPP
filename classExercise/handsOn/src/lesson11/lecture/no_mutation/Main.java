package lesson11.lecture.no_mutation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //this is a no mutation example
        List<String> names = List.of("Clice", "Cob", "Charlie", "David", "Eve" , "Frank", "Grace", "Hannah");

        //get a list of names in uppercase
        //without using stream api with but with lambda expression
//        names.forEach(name ->name.toUpperCase());
//        names.forEach(System.out::println);

        //using stream api: get a list of names in uppercase
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------");
        //filter names start with N and convert to uppercase
        names.stream()
                .filter(name -> name.startsWith("C"))
                .peek((name)-> System.out.println("Filtering: " + name))
                .map(String::toUpperCase)
                .peek((name)-> System.out.println("After map: " + name))
                .limit(2)
                .forEach(System.out::println);








    }
}
