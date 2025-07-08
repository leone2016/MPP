package lesson11.lecture._5_infinitive_streams;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {

    static int sum = 0;
    public static void main(String[] args) {
        //supplier is opposite of consumer
        //consumer: takes an input and does something with it
        //supplier: does not take an input, but returns a value
        // pag 26
        Stream.generate(new Supplier<Object>() {
            int count = 0;

            @Override
            public Double get() {
                return Math.random();
            }
        })
                .limit(10)
                .forEach(System.out::println);

        //lambda expression
        Stream.generate(() -> Math.random())
              .limit(10) //without limit, it would be an infinite stream (limit is statefull operation)
              .forEach(System.out::println);

        System.out.println("Another way to create an infinite stream:");
        //unary operator is a function that takes one input and returns one output
        Stream.iterate(12.05, new UnaryOperator<Double>() {
                    @Override
                    public Double apply(Double aDouble) {
                        double result = aDouble * Math.random();
                        System.out.println("In apply: " + aDouble+ " : " + result);
                        return result;
                    }
                }) //iterate takes an initial value and a function to generate the next value
                .limit(10)
                .forEach(System.out::println);

        System.out.println("Another way to create an infinite stream with lambda expression:");
        Stream.iterate(12.05, (Double aDouble)-> aDouble + Math.random()) //iterate takes an initial value and a function to generate the next value
                .limit(10)
                .forEach(System.out::println);

        //find sum of n numbers
        int sum1 = 0;
        for(int i = 0; i < 10; i++) {
            sum1 += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum1);

        // using infinite stream to find sum of first n numbers
        int n = 10;
        int sumOfFirstNNumbers = Stream.iterate(0, i -> i + 1) // start from 0 and increment by 1
                                        .limit(n) // limit to n numbers
                                        .mapToInt(Integer::intValue) // convert to int
                                        .sum(); // sum the numbers
        System.out.println("Sum of first " + n + " numbers using infinite stream: " + sumOfFirstNNumbers);

        // with final outside variable
        Stream.iterate(0,  i-> i + 1) // start from 0 and increment by 1
                .limit(n) // limit to n numbers
                .forEach( i -> {
                    sum += i; // increment the sum variable
                });

        System.out.println("Sum of first " + n + " numbers using infinite stream (forEach - static var): " + sumOfFirstNNumbers);

        // Find the multiplication of n numbers using infinite stream
        int multiplicationOfFirstNNumbers = Stream.iterate(1, i -> i + 1) // start from 1 and increment by 1
                                                .limit(n) // limit to n numbers
                                                .reduce(1, (a, b) -> a * b); // multiply the numbers

    }
}
