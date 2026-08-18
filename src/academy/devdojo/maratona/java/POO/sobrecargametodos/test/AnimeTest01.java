package academy.devdojo.maratona.java.POO.sobrecargametodos.test;

import academy.devdojo.maratona.java.POO.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.print();

    }

}
