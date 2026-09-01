package academy.devdojo.maratona.java.POO.interfaces.dominio;

public interface DataLoader {
    void load();
    int MAX_DATA_SIZE = 10;

    default void checkPermission() {
        System.out.println("Checando permissões...");
    }

    default void retrieveMaxDataSize(){
        System.out.println("Dentro da interface");
    }
}
