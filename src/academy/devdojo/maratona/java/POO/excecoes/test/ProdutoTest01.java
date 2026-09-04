package academy.devdojo.maratona.java.POO.excecoes.test;

import academy.devdojo.maratona.java.POO.excecoes.dominio.EstoqueInsuficienteException;
import academy.devdojo.maratona.java.POO.excecoes.dominio.Produto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Produto produto = new Produto("Celular", 8);
        try {
            produto.vender(11);
        } catch (EstoqueInsuficienteException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
