package generics;

import br.com.letscode.caixaeletronico.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {

    public static void main(String[] args) {

//        List lista = new ArrayList();
//
//        lista.add("Elemento 1");
//        lista.add(1.2);
//        lista.add(new Conta());
//
//        System.out.println(lista);

        List<String> primos = new ArrayList<>();

        primos.add("Igor");
        primos.add("Bruno");
        primos.add("Lucas");

        System.out.println(primos);

    }
}
