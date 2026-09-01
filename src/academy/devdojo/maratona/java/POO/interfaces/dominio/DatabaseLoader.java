package academy.devdojo.maratona.java.POO.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando base de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados...");
    }

    @Override
    public void retrieveMaxDataSize() {
        System.out.println("Dentro da classe");
    }
}
