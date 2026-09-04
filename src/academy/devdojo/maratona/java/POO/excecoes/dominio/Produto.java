package academy.devdojo.maratona.java.POO.excecoes.dominio;

public class Produto {
    private String nome;
    private int quantidadeEstoque;

    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void vender(int quantidade) {
        if (quantidade > quantidadeEstoque || quantidade <= 0) {
            throw new EstoqueInsuficienteException("Quantidade solicitada não disponível em estoque.");
        }
        System.out.println(quantidade + " " + getNome() + " vendidos!");
    }
}
