package academy.devdojo.maratona.java.POO.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

