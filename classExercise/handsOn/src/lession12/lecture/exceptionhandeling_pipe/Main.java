package lession12.lecture.exceptionhandeling_pipe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> fileNames1 = List.of(
                "log1.txt",
                "log2.txt",
                "log22.txt"
        );

//      Stream<String> stream = fileNames1
//               .stream()
//               .flatMap( fileName -> readLog(fileName))
//                       .filter(line -> line.contains("ERROR"))

        fileNames1
               .stream()
               .flatMap( fileName -> readLog(fileName))
                       .filter(line -> line.contains("ERROR")).
                forEach(System.out::println);
        long numError = fileNames1
                .stream()
                .flatMap( fileName -> readLog(fileName))
                .filter(line -> line.contains("ERROR"))
                        .count();
    }


    private static Stream<String> readLog(String fileName) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return br.lines();
    }
}
