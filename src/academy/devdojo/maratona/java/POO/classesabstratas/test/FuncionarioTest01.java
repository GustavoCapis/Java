package academy.devdojo.maratona.java.POO.classesabstratas.test;

import academy.devdojo.maratona.java.POO.classesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratona.java.POO.classesabstratas.dominio.Funcionario;
import academy.devdojo.maratona.java.POO.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Gerente gerente = new Gerente("Naomi",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Carmichael", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
