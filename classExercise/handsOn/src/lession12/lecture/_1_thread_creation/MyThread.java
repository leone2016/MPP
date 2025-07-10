package lession12.lecture._1_thread_creation;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name); // Set the thread name
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

}
