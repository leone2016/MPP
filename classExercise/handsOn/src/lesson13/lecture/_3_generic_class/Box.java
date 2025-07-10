package lesson13.lecture._3_generic_class;

public class Box<T, U> {
    private T data;
    private U additionalData;

    public Box(T data, U additionalData) {
        this.data = data;
        this.additionalData = additionalData;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public U getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(U additionalData) {
        this.additionalData = additionalData;
    }
}
class Main{
    public static void main(String[] args) {
        Box<Integer, String> box = new Box(10, "Hola"); //
        System.out.println(box.getData());

        //Box box1 = new Box("TOM"); Error by default this class only accept int in constructor

        //after made generic to box class

        Box<String, String> box1 = new Box("10", "Hola"); //now is valid

        System.out.println(box1.getData());
    }
}