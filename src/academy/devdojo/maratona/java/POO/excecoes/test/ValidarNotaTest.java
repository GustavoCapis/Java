package academy.devdojo.maratona.java.POO.excecoes.test;

public class ValidarNotaTest {
    static void main(String[] args) {
        try {
            validarNota(11);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
    public static void validarNota(double nota){
        if(nota < 0 || nota > 10){
            throw new IllegalArgumentException("Nota invalida! Deve ser entre 0 e 10.");
        }
        System.out.println("Nota válida: " + nota);
    }
}
