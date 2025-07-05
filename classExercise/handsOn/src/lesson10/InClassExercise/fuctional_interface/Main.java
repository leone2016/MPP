package lesson10.InClassExercise.fuctional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ListInfo listInfo = new ListInfo();
        listInfo.addNumber(10);
        listInfo.addNumber(20);
        listInfo.addNumber(30);



        // Using a lambda expression to print the numbers
        listInfo.getList().forEach(num -> System.out.println("Number: " + num));

        // Using a method reference to print the numbers
        listInfo.getList().forEach(System.out::println);

        List<Integer> integers = listInfo.getList();

        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Using Consumer: " + integer);
            }
        });

        // applying a lambda expression for functional interface
        Consumer<Integer> consumer = integer -> System.out.println("Using lambda Consumer: " + integer);
        integers.forEach(consumer);

    }
}
