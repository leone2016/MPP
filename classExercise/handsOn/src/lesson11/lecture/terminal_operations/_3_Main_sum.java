package lesson11.lecture.terminal_operations;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _3_Main_sum {

    public static void main(String[] args) {
        //create intStream

        IntStream intStream = Stream.iterate(1, i -> i + 1).limit(6).mapToInt(Integer::valueOf);
        System.out.println("Sum of first 6 numbers: " + intStream.sum());

        //intStream => already operated. So we cannot use it again
        intStream = IntStream.range(1, 11);
        System.out.println("Sum of first 10 numbers: " + intStream.sum());
        intStream = IntStream.range(1, 10);
        System.out.println(intStream.summaryStatistics());


    }
}
