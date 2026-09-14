import java.util.concurrent.Semaphore;

public static class Estacionamento {
    private final Semaphore vagas = new Semaphore(2);

    public void estacionar(String nomeCarro) {
        try {
            System.out.println(nomeCarro + " chegou e está tentando achar uma vaga...");
            //pede uma permissão
            vagas.acquire();

            System.out.println("-> " + nomeCarro + " conseguiu estacionar!");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("<- " + nomeCarro + " saiu da vaga.");
            // Sempre libere a vaga no finally para garantir que não vai travar o semáforo
            vagas.release();
        }
    }
}

public static void main(String[] args) {
    Estacionamento est = new Estacionamento();
    String[] carros = new String[]{"Fusca", "Civic", "HB20", "Corolla"};

    for (String carro : carros) {
        new Thread(() -> est.estacionar(carro)).start();
    }
}

