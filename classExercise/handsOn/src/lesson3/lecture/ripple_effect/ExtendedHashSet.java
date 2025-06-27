package lesson3.lecture.ripple_effect;

import java.util.Collection;
import java.util.HashSet;
//OCPJP  certification book kathie Sierra
public class ExtendedHashSet<T> extends HashSet<T> {
    //The number of attempted element insertions since its creation --
    //this value will not be modified when elements are removed
    private int addCount = 0;

    public ExtendedHashSet() {}

    @Override
    public boolean add(T a) {
        addCount++;
        return super.add(a);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        //addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }

}
