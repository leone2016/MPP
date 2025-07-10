package lession12.lecture._1_thread_creation;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("first"); //a thread is created but not started yet
        myThread.start();
        //changes its status form newBorn to ready to run
        //jvm automatically create a main thread

        MyThread myThread2 = new MyThread("Second"); //a thread is created but not started yet
        myThread2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread: " + i + " " + Thread.currentThread().getName());
        }
    }
}
