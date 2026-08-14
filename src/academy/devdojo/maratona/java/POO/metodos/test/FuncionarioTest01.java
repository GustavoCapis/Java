package academy.devdojo.maratona.java.POO.metodos.test;

import academy.devdojo.maratona.java.POO.metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcelo";
        funcionario.idade = 52;
        funcionario.salarios = new double[]{1000, 2000, 1500};

        funcionario.imprimeDados();
        funcionario.imprimeMedia(1000, 2000, 1500);
    }
}
