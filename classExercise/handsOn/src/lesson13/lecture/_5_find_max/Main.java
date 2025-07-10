package lesson13.lecture._5_find_max;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Main {


//    public static <T extends Comparable<? super T>> T findMax(List<T> list) {
    public static <T extends Comparable<T>> T findMax(List<? extends T> list) {
        T max = list.getFirst();
        for(T i : list) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int max = findMax(list);
        System.out.println("The maximum value in the list is: " + max);//5
        System.out.println( findMax(List.of(1, 2, 3, 4, 5)));
        System.out.println( findMax(List.of("a", "b", "c", "d")));
        System.out.println( findMax( List.of(2.0, 3.0, 5.3, 1.0)));

//        List<LocalDate> COMPLETE WITH TEACHER CLASSES .....
        List<LocalDate> localDates = List.of(LocalDate.now(),
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(2),
                LocalDate.now().plusDays(3));
        System.out.println(findMax(localDates)); // error due to => LocalDate does not implement
        // LocalDate<Comparable? however, LocalDate implements CrhonoLocalDate, where
        // ChronoLocalDate implements  comparable <ChronoLocalDate>
    }
}
