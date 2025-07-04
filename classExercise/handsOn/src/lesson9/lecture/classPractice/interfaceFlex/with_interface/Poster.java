package lesson9.lecture.classPractice.interfaceFlex.with_interface;


import java.time.LocalDate;

public class Poster implements DisplayItem {
    private int width;
    private int height;
    private String owner;
    private LocalDate returnDate;
    public Poster(String owner, LocalDate date, int width, int height) {
        this.width = width;
        this.height = height;
        this.owner = owner;
        this.returnDate = date;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public LocalDate getReturnDate() {
        return returnDate;
    }
}
