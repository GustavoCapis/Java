/*
 * Crie um sistema que gerencie seminários
 *
 * O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado
 *
 * Um aluno poderá estar em apenas um seminário
 * Um seminário poderá ter nenhum ou vários alunos
 * Um professor poderá ministrar vários seminários
 * Um seminário deve ter um local
 *
 * Campos básicos (excluindo relacionamento)
 * seminário: título
 * aluno: nome e idade
 * professor: nome, especialidade
 * local: endereço
 */

package academy.devdojo.maratona.java.POO.associacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo, Local local, Aluno[] alunos, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}