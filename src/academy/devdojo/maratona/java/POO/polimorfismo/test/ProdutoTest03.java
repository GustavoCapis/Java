package academy.devdojo.maratona.java.POO.polimorfismo.test;

import academy.devdojo.maratona.java.POO.metodos.dominio.Calculadora;
import academy.devdojo.maratona.java.POO.polimorfismo.dominio.Computador;
import academy.devdojo.maratona.java.POO.polimorfismo.dominio.Produto;
import academy.devdojo.maratona.java.POO.polimorfismo.dominio.Tomate;
import academy.devdojo.maratona.java.POO.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("--------------------");

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
