package lesson9.lecture.classPractice.interfaceFlex.with_interface;

import java.time.LocalDate;

public interface DisplayItem {

     String getOwner();

    LocalDate getReturnDate();

    public default void displayinfo() {
        System.out.println(getOwner() + " " + getReturnDate());
    }
}
