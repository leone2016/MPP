package lession12.lecture.bestPractice_managing_thread;


import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //documentation purpose
        Executors.newFixedThreadPool(10);
        Executors.newCachedThreadPool();
    }
}
