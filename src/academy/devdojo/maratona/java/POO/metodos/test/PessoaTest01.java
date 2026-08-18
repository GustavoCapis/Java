package academy.devdojo.maratona.java.POO.metodos.test;

import academy.devdojo.maratona.java.POO.metodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Beyoncé");
        pessoa.setIdade(44);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
