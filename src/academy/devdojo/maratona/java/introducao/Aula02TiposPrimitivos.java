package academy.devdojo.maratona.java.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L; //casting
        long longNumber = 1000000000;
        double doubleSalary = 2000.00;
        float floatSalary = 2500.00F;
        byte byteAge = 10;
        short shortAge = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = 'M';
        String name = "Beyoncé";

        System.out.println("A idade é:"+age+" anos");
        System.out.println("Oi, meu nome é: "+name);
    }
}
