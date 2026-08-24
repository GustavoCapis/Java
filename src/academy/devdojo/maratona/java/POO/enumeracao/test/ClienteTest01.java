package academy.devdojo.maratona.java.POO.enumeracao.test;

import academy.devdojo.maratona.java.POO.enumeracao.dominio.Cliente;
import academy.devdojo.maratona.java.POO.enumeracao.dominio.TipoCliente;

public class ClienteTest01 {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Hanna", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Gabriel", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Maria", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Carlos", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
