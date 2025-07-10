package lession12.lecture._3_thread_safe_singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    //it automatocally shut down
    static ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) throws InterruptedException {
        createAndStartThread();
        //Allow the main thread to sleep for some time
        Thread.sleep(3000);

        System.out.println(Singleton.getCount());
    }

    private static void createAndStartThread() {
        for (int i = 0; i < 10000; i++) {
//            new Thread(()->{
//               Singleton singleton = Singleton.getInstance();
//            }).start();
            executor.submit(()->{
                Singleton singleton = Singleton.getInstance();
            });
        }
    }
}
