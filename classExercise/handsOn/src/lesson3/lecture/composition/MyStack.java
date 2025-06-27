package lesson3.lecture.composition;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyStack<T> {
   private List<T> list = new ArrayList<>();
   private int stackPointer = -1;
    public MyStack() {
    }

    public void push(T t) {
        list.add(++stackPointer, t);
    }

    public T pop() {
        return list.remove(stackPointer--);
    }
}

class Main{
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");
        myStack.push("d");

        
    }
}
