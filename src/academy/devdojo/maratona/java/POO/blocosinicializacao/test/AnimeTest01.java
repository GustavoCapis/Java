package academy.devdojo.maratona.java.POO.blocosinicializacao.test;

import academy.devdojo.maratona.java.POO.blocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
