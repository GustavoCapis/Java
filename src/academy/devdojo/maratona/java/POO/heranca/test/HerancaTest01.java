package academy.devdojo.maratona.java.POO.heranca.test;

import academy.devdojo.maratona.java.POO.heranca.dominio.Endereco;
import academy.devdojo.maratona.java.POO.heranca.dominio.Funcionario;
import academy.devdojo.maratona.java.POO.heranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Seraphine");
        pessoa.setCpf("111.111.111-22");
        pessoa.setEndereco(endereco);

        pessoa.print();
        System.out.println("---------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Mario");
        funcionario.setCpf("444.444.444-66");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
    }
}
