package academy.devdojo.maratona.java.POO.associacao.test;

import academy.devdojo.maratona.java.POO.associacao.dominio.Aluno;
import academy.devdojo.maratona.java.POO.associacao.dominio.Local;
import academy.devdojo.maratona.java.POO.associacao.dominio.Professor;
import academy.devdojo.maratona.java.POO.associacao.dominio.Seminario;

import java.util.Arrays;

public class GerenciadorSeminarios {
    static void main(String[] args) {
        Local local1 = new Local("Anfiteatro A");
        Local local2 = new Local("Sala Arueira");
        Local local3 = new Local("Anfiteatro dos Peixes");

        Professor professor1 = new Professor("Fabiane", "Urgência e Emergência", null);
        Professor professor2 = new Professor("Ana Elza", "Geriatria", null);

        Seminario seminario1 = new Seminario("Cuidados Críticos", local1, null, professor1);
        Seminario seminario2 = new Seminario("Saúde do Idoso", local3, null, professor2);
        Seminario seminario3 = new Seminario("Primeiros Socorros", local2, null, professor1);

        Aluno aluno1 = new Aluno("Roberta", 23, seminario1);
        Aluno aluno2 = new Aluno("Marcus", 24, seminario2);
        Aluno aluno3 = new Aluno("Yuri", 25, seminario3);

        seminario1.setAlunos(new Aluno[]{aluno1, aluno2});
        seminario3.setAlunos(new Aluno[]{aluno3});

        professor1.setSeminarios(new Seminario[]{seminario1, seminario3});
        professor2.setSeminarios(new Seminario[]{seminario2});

        System.out.println("Título do Seminário: " + seminario1.getTitulo());
        System.out.println("Local: " + seminario1.getLocal());
        System.out.println("Professor: " + professor1.getNome() + " Especialidade: " + professor1.getEspecialidade());
        System.out.println("Nome do aluno: " + Arrays.toString(seminario1.getAlunos()) + " Idade:" + aluno1.getIdade());


    }
}
