package lesson9.lecture.classPractice.interfaceFlex.with_interface;



import java.time.LocalDate;

public class Book implements DisplayItem {
    private String titule;
    private String owner;
    private LocalDate returnDate;
    public Book(String owner, LocalDate date, String title) {
        this.titule = title;
        this.owner = owner;
        this.returnDate = date;
    }

    @Override
    public String getOwner() {
        return  this.owner;
    }

    @Override
    public LocalDate getReturnDate() {
        return this.returnDate;
    }
}

class Main {
    public static void main(String[] args) {
       DisplayItem[] items = {
                new Book("Alice", LocalDate.of(2025,3,4), "Java Programming"),
                new Poster("Bob", LocalDate.of(2025,4,10), 24, 36),
                new Book("Charlie", LocalDate.of(2025,5,15), "Effective Java"),
                new Poster("Diana", LocalDate.of(2025,6,20), 18, 24),
                DinaStatue.DINASOUR_STATUE
        };

        for(DisplayItem item : items){
            item.displayinfo();
        }

    }
}