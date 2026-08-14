package academy.devdojo.maratona.java.POO.metodos.dominio;

public class Calculadora {
    public void sumTwoNum() {
        System.out.println(10 + 10);
    }

    public void subTwoNum() {
        System.out.println(21 - 2);
    }

    public void mulTwoNum(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divTwoNum(double num1, double num2) {
        double result = num1 / num2;
        System.out.println(result);
        return result;
    }
}
