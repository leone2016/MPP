package lesson13.generics._2_pairexamples;

public interface Pair<K, V> {
    K getKey();
    V getValue();

    default String defaultToString() {
    	return "(" + getKey().toString() + ", " + getValue().toString() + ")";
    }
}