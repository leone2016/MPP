package lesson2.lecture.unidirectional.one_to_one;

public class Item {
    private String name;
    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
