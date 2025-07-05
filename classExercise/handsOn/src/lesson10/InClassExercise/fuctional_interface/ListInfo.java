package lesson10.InClassExercise.fuctional_interface;

import java.util.*;

public class ListInfo {
    private List<Integer> list  = new ArrayList<>();

    public void addNumber(Integer i) {
        list.add(i);
    }

    public int gertSize() {
        return list.size();
    }

    public List<Integer> getList() {
        return list;
    }
}
