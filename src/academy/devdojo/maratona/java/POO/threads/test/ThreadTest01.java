package academy.devdojo.maratona.java.POO.threads.test;

import academy.devdojo.maratona.java.POO.threads.dominio.MinhaThread;

public class ThreadTest01 {
    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread("Thread #1", 600);

        MinhaThread thread2 = new MinhaThread("Thread #2", 1000);

        MinhaThread thread3 = new MinhaThread("Thread #3", 2000);
    }
}
