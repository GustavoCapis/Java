public static class CaixaEletronico {
    private int saldo = 1000;

    public synchronized void sacar(String nomeThread, int valor) {
        System.out.println(nomeThread + " tentou sacar. Saldo atual: " + saldo);
        if (saldo >= valor) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            saldo -= valor;
            System.out.println(nomeThread + " sacou R$" + valor + ". Sobrou: " + saldo);
        } else {
            System.out.println(nomeThread + ": Saldo insuficiente!");
        }
    }
}

public static void main(String[] args) {
    CaixaEletronico caixa = new CaixaEletronico();

    new Thread(() -> caixa.sacar("Cliente A", 600), "T1").start();
    new Thread(() -> caixa.sacar("Cliente B", 600), "T2").start();
}
