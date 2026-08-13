package academy.devdojo.maratona.java.POO.test;

import academy.devdojo.maratona.java.POO.dominio.Estudante;

public class EstudanteTest {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Gustavo";
        estudante.idade = 25;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }

}

