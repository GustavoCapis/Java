package academy.devdojo.maratona.java.POO.classes.test;

import academy.devdojo.maratona.java.POO.classes.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Yuri";
        professor.idade = 49;
        professor.sexo = 'M';

        System.out.println("Professor "+professor.nome+" idade: "+ professor.idade+" sexo: "+professor.sexo);
    }
}
