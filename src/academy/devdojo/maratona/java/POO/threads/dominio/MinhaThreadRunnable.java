package academy.devdojo.maratona.java.POO.threads.dominio;

public class MinhaThreadRunnable implements Runnable {
    private final String nome;
    private final int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(nome + " FINALIZADA");
    }
}
