package lesson9.lecture.classPractice.interfaceFlex.with_class;

import lesson9.lecture.enums3.java7.DisplayItem;

import java.time.LocalDate;

public class Book extends DisplayItem {
    private String titule;
    public Book(String owner, LocalDate date, String title) {
        super(owner, date);
        this.titule = title;
    }
}
