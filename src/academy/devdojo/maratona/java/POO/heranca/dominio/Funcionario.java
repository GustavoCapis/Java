package academy.devdojo.maratona.java.POO.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void print() {
        super.print();
        System.out.println(salario);
    }

    public void relatorioPagamento() {
        System.out.println("-------------");
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
        System.out.println("-------------");

    }
}
