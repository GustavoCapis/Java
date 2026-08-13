package academy.devdojo.maratona.java.introducao;

public class Aula06Exercicio03 {
    static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas x ele pode ser parcelado
        //Condição valorParcela >= 1000
        double valorCarro = 30000;
        int valorMinParcela = 1000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < valorMinParcela) {
                break;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);
        }

    }
}
