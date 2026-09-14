package academy.devdojo.maratona.java.POO.threads.test;

import academy.devdojo.maratona.java.POO.threads.dominio.MinhaThreadRunnable;

public class ThreadTest02 {
    public static void main(String[] args) {
        MinhaThreadRunnable thread01 = new MinhaThreadRunnable("Thread 1", 900);
        MinhaThreadRunnable thread02 = new MinhaThreadRunnable("Thread 2", 650);
        MinhaThreadRunnable thread03 = new MinhaThreadRunnable("Thread 3", 1100);

    }
}
