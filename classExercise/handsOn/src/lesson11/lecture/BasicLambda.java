package lesson11.lecture;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BasicLambda {
    public static void main(String[] args) {
        //imperative style
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry", "good day", "alright", "hello");
        //count words length greater than 5
        int count = 0;
        for (String word : words) {
            if (word.length() > 5) {
                count++;
            }
        }
        // declarative style
        //1. create a Stream object ______________________________________________
        Stream<String> stream = words.stream();
        //2. filter the words with length greater than 5
        Stream<String> filteredStream = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });
        //3. count the number of elements in the stream
        long count1 = filteredStream.count();

        //or using lambda expression _____________________________________________
        long count2 = words.stream()
                .filter(word -> word.length() > 5)
                .count();

        System.out.println("Count of words with length greater than 5: " + count);
        System.out.println("Count using Stream API: " + count1);
        System.out.println("Count using Stream API with lambda: " + count2);

        long count3 = words.stream()
                .filter(word ->{
                    System.out.println(Thread.currentThread().getName());
                    return  word.length() > 5;
                })
                .count();
        System.out.println("Count using Stream API with lambda and thread name: " + count3);

        System.out.println("--------------------------------------------------");
        long count4 = words.parallelStream()
                .filter(word ->{
                    System.out.println(Thread.currentThread().getName()+ " : " + word);
                    return  word.length() > 5;
                })
                .count();
        System.out.println("Count using parallel Stream API with lambda and thread name: " + count4);
    }
}
