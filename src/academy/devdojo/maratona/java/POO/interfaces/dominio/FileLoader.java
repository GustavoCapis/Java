package academy.devdojo.maratona.java.POO.interfaces.dominio;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de arquivo...");
    }
}
