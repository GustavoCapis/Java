package academy.devdojo.maratona.java.POO.interfaces.dominio;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando base de dados...");
    }
}
