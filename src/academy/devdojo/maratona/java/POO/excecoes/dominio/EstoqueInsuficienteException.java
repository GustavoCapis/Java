package academy.devdojo.maratona.java.POO.excecoes.dominio;

public class EstoqueInsuficienteException extends RuntimeException {
    public EstoqueInsuficienteException(String message) {
        super(message);
    }
}
