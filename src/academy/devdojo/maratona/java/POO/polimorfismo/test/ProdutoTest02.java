package academy.devdojo.maratona.java.POO.polimorfismo.test;

import academy.devdojo.maratona.java.POO.polimorfismo.dominio.Computador;
import academy.devdojo.maratona.java.POO.polimorfismo.dominio.Produto;
import academy.devdojo.maratona.java.POO.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("--------------------");
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
