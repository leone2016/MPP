package lesson2.lecture.unidirectional.one_to_zero_or_one_factory;

public class Items {
    private String name;

    public Items(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                '}';
    }
}
