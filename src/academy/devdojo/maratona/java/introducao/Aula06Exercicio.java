package academy.devdojo.maratona.java.introducao;

public class Aula06Exercicio {
    static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
