package lesson9.lecture.classPractice.interfaceFlex.with_interface;

import java.time.LocalDate;

public enum DinaStatue  implements DisplayItem{
    DINASOUR_STATUE ("T-REX ENUM", LocalDate.of(2023, 10, 1));

    private String owner;
    private LocalDate returnDate;
    DinaStatue(String owner, LocalDate date) {
        this.owner = owner;
        this.returnDate = date;
    }

    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public LocalDate getReturnDate() {
        return this.returnDate;
    }
}
