package lesson10.InClassExercise.lambda;

public class Main {

    public static void main(String[] args) {
        // new an anonymous class implementing the AddIntf interface
        AddIntf ob = new AddIntf() {
            @Override
            public int add(int a, int b) {
                return 0;
            }
        };
        System.out.println(ob.add(1, 2)); // This will print 0

        //lambda expression implementing the AddIntf interface
        AddIntf ob2 = (a, b) ->{
            //.....
            return a + b; // This will add the two numbers

        };
        System.out.println(ob2.add(1, 2)); // This will print 3
        int test = ob2.log(1, 2, 3);
        System.out.println("Test log: " + test); // This will print 6
    }
}
