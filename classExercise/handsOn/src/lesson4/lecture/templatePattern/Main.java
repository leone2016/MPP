package lesson4.lecture.templatePattern;

public class Main {
    public static void main(String[] args) {
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.prepareBeverage();

        System.out.println();

        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.prepareBeverage();
    }
}
