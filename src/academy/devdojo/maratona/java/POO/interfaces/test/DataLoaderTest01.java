package academy.devdojo.maratona.java.POO.interfaces.test;

import academy.devdojo.maratona.java.POO.interfaces.dominio.DatabaseLoader;
import academy.devdojo.maratona.java.POO.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
