package br.com.letscode.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("Olá! Por favor, escolha um dos serviços abaixo:");
        System.out.println("0 - Sair");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Abrir Conta");
    }


}
