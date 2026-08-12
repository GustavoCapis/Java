package academy.devdojo.maratona.java.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        //aritiméticos: +, -, /, *, %
        double num1 = 10;
        double num2 = 20;
        double result = num1 / num2;
        System.out.println(result);

        int modulo = 20 % 2;
        System.out.println(modulo);

        //relacionais: <, >, <=, >=, ==, !=
        boolean isTenGreaterThanTwenty = 10 > 20;

        System.out.println(isTenGreaterThanTwenty);

        //logicos: &&, ||, !

        //atribuíção: =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        //incrementa: ++ decrementa: --
        int increment = 0;
        increment++;
        System.out.println(increment);
    }
}
