package academy.devdojo.maratona.java.POO.polimorfismo.test;

import academy.devdojo.maratona.java.POO.polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratona.java.POO.polimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
