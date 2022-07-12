package br.com.letscode.caixaeletronico;

import br.com.letscode.caixaeletronico.services.SelecionaComando;

public class CaixaEletronicoApp {

    public static void main(String[] args) {

        System.out.println("Caixa eletrônico ligado!");
        System.out.println();

        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar()) {
            System.out.println();
            System.out.println("Executando um novo comando...");
            System.out.println();
        }

        System.out.println();
        System.out.println("Caixa eletrônico desligado!");

    }
}
