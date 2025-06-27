package lesson2.lecture.unidirectional.depencency_example;

public class RightTriangle {
    public static double computeHypotenuseLength(double base, double height) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    public static void main(String[] args) {
        double a = computeHypotenuseLength(2, 3);
        System.out.printf("%.2f\n", a);
    }
}
