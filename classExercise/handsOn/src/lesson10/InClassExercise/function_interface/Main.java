package lesson10.InClassExercise.function_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> function = integer -> integer + 1;
        System.out.println(function.apply(5)); // This will print 6

        BiFunction<Integer, Integer, Integer> biFunction = (integer, integer2) -> integer + integer2;
        System.out.println(biFunction.apply(5, 10)); // This will print 15

        TriFunction<Integer, Integer, Integer, Integer> triFunction = (integer, integer2, integer3) -> integer + integer2+ integer3;
        System.out.println(triFunction.apply(5, 10, 15)); // This will print 30

    }
}


interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}