package PracticeExam;

@FunctionalInterface
public interface _1_FuctionalInterface {

    public void add(int a, int b);

    default String sayHi() {
        return "Hi";
    }

    static boolean isTrue() {
        return true;
    }
}
