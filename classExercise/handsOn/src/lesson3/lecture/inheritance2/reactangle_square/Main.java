package lesson3.lecture.inheritance2.reactangle_square;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        Rectangle square = new Square(5);
        //square.setWidth(6); //its important to comment or delete priv set to prevent rectangular inmutable
        System.out.println("Area of square: " + square.calculateArea());
    }
}
