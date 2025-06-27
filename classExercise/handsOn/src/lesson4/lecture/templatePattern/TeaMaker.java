package lesson4.lecture.templatePattern;

public class TeaMaker extends BeverageMaker {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
