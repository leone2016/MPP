package lesson3.lecture.stack_list;

import java.util.ArrayList;

/**
 * Stack is a list (stack extends from arrays list)
 */
public class MyStack<T>  extends ArrayList<T> {
    private int stackPointer = -1;

    public void push(T element) {
        add(++stackPointer, element);
    }

    public T pop() {
        T removedData = remove(stackPointer);
        stackPointer--;
        return removedData;
    }

    @Override
    public void clear() {
        super.clear();
        stackPointer = -1;
    }


}

class Main{
    public static void main(String[] args){
        MyStack<String> stack = new MyStack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
