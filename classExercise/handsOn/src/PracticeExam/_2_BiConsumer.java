package PracticeExam;

import PracticeExam.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _2_BiConsumer {

   static BiConsumer<Integer, String> c1 = (p1, p2) -> System.out.println(p1 + " " + p2);
    public static void main(String[] args) {
        c1.accept(1, "Hello");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7,8, 4, 5);

        BiConsumer<List<Integer>, List<Integer >> c = (p1, p2) ->{
            if(p1.size() == p2.size()){
                System.out.println(" Both Arrays are equals in size");
            }else {
                System.out.println(" Both Arrays are not equals in size");
            }
        };
        c.accept(list, list2);


        BiConsumer<Integer, Integer> add = (a, b) -> System.out.println(a + b);
        BiConsumer<Integer, Integer> sub = (a, b) -> System.out.println(a - b);
        BiConsumer<Integer, Integer> miltiply = (a, b) -> System.out.println(a * b);

        add.accept(1,2);
        sub.accept(1,2);
        miltiply.accept(1,2);

        }
}
