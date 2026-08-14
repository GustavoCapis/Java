package academy.devdojo.maratona.java.POO.metodos.test;

import academy.devdojo.maratona.java.POO.metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numbers = {1,2,3,4,5};
        calculadora.sumArray(numbers);
        calculadora.sumVarArgs(1,2,3,4,5,6,7);
    }
}
