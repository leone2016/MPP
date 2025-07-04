package lesson9.lecture.classPractice.interfaceFlex.with_class.app;

import lesson9.lecture.enums3.java7.Book;
import lesson9.lecture.enums3.java7.DisplayItem;
import lesson9.lecture.enums3.java7.Poster;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DisplayItem[] items = {
                new Book("Alice", LocalDate.of(2025,3,4), "Java Programming"),
                new Poster("Bob", LocalDate.of(2025,4,10), 24, 36),
                new Book("Charlie", LocalDate.of(2025,5,15), "Effective Java"),
                new Poster("Diana", LocalDate.of(2025,6,20), 18, 24)
                //DinaStatue is not hava inheritance from DisplayItem
        };

        for(DisplayItem item : items){
            item.displayInfo();
        }

    }
}
