package academy.devdojo.maratona.java.POO.polimorfismo.service;

import academy.devdojo.maratona.java.POO.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
