package lesson10.InClassExercise.lambda;

@FunctionalInterface
public interface AddIntf {
    int add(int a, int b);
   // int subtract(int a, int b); // This will cause a compilation error if uncommented, as it violates the functional interface contract
    default int log(int a, int b, int c) {
        return a + b + c; // Default method can have a body
    }

    private void f1() {
        // Private methods can be defined in functional interfaces
        System.out.println("This is a private method in a functional interface.");
    }

    @Override
    public String toString();

    static void f2() {}
}
