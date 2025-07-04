package lesson9.lecture.classPractice.interfaceFlex.with_class;

public class DisplayItem {
    private String owner;
    private String returnDate;

    public DisplayItem(String owner, String returnDate) {
        this.owner = owner;
        this.returnDate = returnDate;
    }

    public String getOwner() {
        return owner;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void displayinfo(){
        System.out.println("Owner: " + owner);
        System.out.println("Return Date: " + returnDate);
    }
}
