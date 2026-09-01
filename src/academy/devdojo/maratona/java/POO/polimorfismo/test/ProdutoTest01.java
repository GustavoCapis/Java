package academy.devdojo.maratona.java.POO.polimorfismo.test;

import academy.devdojo.maratona.java.POO.polimorfismo.dominio.Computador;
import academy.devdojo.maratona.java.POO.polimorfismo.dominio.Tomate;
import academy.devdojo.maratona.java.POO.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Computador computador = new Computador("Dell G15", 4000);
        Tomate tomate = new Tomate("Tomate vermelho", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
