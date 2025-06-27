package lesson4.lecture.templatePattern;
//Abstract class defining the template method for preparing beverages
public abstract class BeverageMaker {

    // Template method defining the overall process
    public void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

     void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring beverage into cup");
    }
}
