package academy.devdojo.maratona.java.POO.metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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

    public double imprimeMedia(double... salarios) {
        double soma = 0;
        int qtd = salarios.length;
        for (double salario : salarios) {
            soma += salario;
        }
        double media = soma / qtd;
        System.out.println("Média salarial:" + media);
        return media;
    }

}
