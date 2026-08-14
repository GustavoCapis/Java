package academy.devdojo.maratona.java.POO.metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println("---Dados do Funcionário---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        int qtd = 0;
        for (double salario : salarios) {
            qtd++;
            System.out.println("Salario(" + qtd + "): " + salario);
        }
    }

    public double imprimeMedia(double... salarios) {
        double soma = 0;
        double qtd = 0;
        for (double salario : salarios) {
            soma += salario;
            qtd++;
        }
        double media = soma / qtd;
        System.out.println("Média salarial:" + media);
        return media;
    }

}
