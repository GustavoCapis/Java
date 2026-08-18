package academy.devdojo.maratona.java.POO.metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double[] salarios;


    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void imprimeDados() {
        System.out.println("---Dados do Funcionário---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        int count = 0;
        for (double salario : salarios) {
            count++;
            System.out.println("Salario(" + count + "): " + salario);
        }
    }

    public double getMedia() {
        double soma = 0;
        for (double salario : this.salarios) {
            soma += salario;
        }
        double media = soma / this.salarios.length;
        System.out.println("Média salarial:" + media);
        return media;
    }

}
