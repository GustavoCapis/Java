package academy.devdojo.maratona.java.POO.metodos.test;

import academy.devdojo.maratona.java.POO.metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Marcelo");
        funcionario.setIdade(52);
        funcionario.setSalarios(new double[]{1000, 2000, 1500});

        funcionario.imprimeDados();
        funcionario.getMedia();
    }
}
