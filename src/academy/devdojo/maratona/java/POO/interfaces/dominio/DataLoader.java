package academy.devdojo.maratona.java.POO.interfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Checando permissões...");
    }
}
