package academy.devdojo.maratona.java.POO.metodos.test;

import academy.devdojo.maratona.java.POO.classes.dominio.Estudante;

public class EstudanteTest02 {
    static void main() {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Carlos";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Lola";
        estudante02.idade = 22;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
