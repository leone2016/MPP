package lesson11.lecture._5_infinitive_streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //supplier is opposite of consumer
        //consumer: takes an input and does something with it
        //supplier: does not take an input, but returns a value
        Stream.generate(new Supplier<Object>() {
            int count = 0;

            @Override
            public Double get() {
                return Math.random();
            }
        }).limit(10).forEach(System.out::println);
    }
}
