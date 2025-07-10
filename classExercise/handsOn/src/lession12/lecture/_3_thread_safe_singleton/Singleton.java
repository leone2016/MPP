package lession12.lecture._3_thread_safe_singleton;

public class Singleton {
    private static Singleton instance;

    private static int count = 0;

    private Singleton() {
        count ++;
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static int getCount() {
        return count;
    }
}
