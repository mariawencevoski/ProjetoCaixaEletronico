package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;
import repository.MemoriaContaRepository;

public class DepositoImpl implements Deposito {

    private MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double valor, int numeroDaConta) {

        Conta conta;

        conta = repository.findById(numeroDaConta);
        conta.adicionaSaldo(valor);

        System.out.println("Efetuado depósito no valor de: R$ " + valor);
        System.out.println("Número da Conta: " + numeroDaConta);
        System.out.printf("O saldo restante é de: R$ %.2f %n", conta.getSaldo());

    }

}
