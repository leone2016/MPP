package lesson2.lecture.unidirectional.one_to_many;

public class Item {
    private String name;
    private String description;

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
