package academy.devdojo.maratona.java.POO.bancodedados.test;

import academy.devdojo.maratona.java.POO.bancodedados.domain.DbFunctions;

public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        db.connectDb("ESCOLA", "postgres", "gugastorm3");
    }
}
