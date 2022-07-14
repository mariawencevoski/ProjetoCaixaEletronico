package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;
import repository.MemoriaContaRepository;

public class TransferenciaImpl implements Transferencia {

    private MemoriaContaRepository repository;

    public TransferenciaImpl(MemoriaContaRepository repository) {

        this.repository = repository;
    }


    @Override
    public void transferir(double valor, Conta numeroContaDestino, Conta origem) {

        Conta conta;

        int numeroDaContaDestino = 0;

        conta = repository.findById(numeroDaContaDestino);
        conta.adicionaSaldo(valor);

        System.out.println("Efetuada transferência no valor de: R$ " + valor);
        System.out.println("Número da Conta: " + numeroDaContaDestino);
        System.out.printf("O saldo atual é de: R$ %.2f %n", conta.getSaldo());

        return;
    }

    @Override
    public void execute(double valor) {

    }
}

