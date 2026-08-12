package academy.devdojo.maratona.java.introducao;

public class Aula05Exercicio {
    static void main(String[] args) {
        double anualSalary = 22000;
        double tax;

        if (anualSalary <= 34712) {
            tax = 9.70 / 100;
        } else if (anualSalary >= 34713 && anualSalary <= 68507) {
            tax = 37.35 / 100;
        } else {
            tax = 49.50 / 100;
        }
        double debt = anualSalary * tax;
        System.out.println(debt);
    }
}
