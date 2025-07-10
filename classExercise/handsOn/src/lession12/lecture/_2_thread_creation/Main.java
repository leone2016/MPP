package lession12.lecture._2_thread_creation;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = new Mythread();
        //create the fisrt child thread

        Thread thread = new Thread(runnable);
        thread.setName("Thread 1");
        thread.start();

        //apply lambda expression

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(":: Thread 1: " + i + " " + Thread.currentThread().getName());
            }
        });
        thread2.setName("Thread 2");
        thread2.start();
    }
}
