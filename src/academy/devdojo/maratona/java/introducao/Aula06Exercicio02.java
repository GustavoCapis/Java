package academy.devdojo.maratona.java.introducao;

public class Aula06Exercicio02 {
    static void main(String[] args) {
        //imprima os primeiros 25 números de um dado valor (50).
        int maxValue = 50;
        for (int i = 0; i < maxValue; i++) {
            if (i == 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
