package academy.devdojo.maratona.java.POO.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    public int[] getEpisodios() {
        return episodios;
    }

    //Bloco de inicialização de instância
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

    }

    public Anime(String nome) {
        this.nome = nome;
    }
}
