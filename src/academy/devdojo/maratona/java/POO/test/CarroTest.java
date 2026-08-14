package academy.devdojo.maratona.java.POO.test;

import academy.devdojo.maratona.java.POO.dominio.Carro;

public class CarroTest {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Onix";
        carro1.modelo = "1.0 Turbo";
        carro1.ano = 2024;

        Carro carro2 = new Carro();
        carro2.nome = "Civic";
        carro2.modelo = "1.5 CVT";
        carro2.ano = 2022;

        System.out.println("Carro 1: " + carro1.nome + " - " + carro1.modelo + " - " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " - " + carro2.modelo + " - " + carro2.ano);
        
    }
}
