package academy.devdojo.maratona.java.introducao;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <>,
confirmo que recebi o salario de <>, na data <>
 */
public class Aula03TiposPrimitivosExercicio {
    static void main(String[] args) {
        String name = "Fulano";
        String address = "R.Teste,n.23";
        float salary = 2500.75F;
        String salaryDate = "12/08/2026";

        System.out.println("Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de "+salary+" na data "+salaryDate);
    }
}

