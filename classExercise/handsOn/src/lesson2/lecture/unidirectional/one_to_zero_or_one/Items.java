package lesson2.lecture.unidirectional.one_to_zero_or_one;

public class Items {
    private String name;

    Items(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                '}';
    }
}
