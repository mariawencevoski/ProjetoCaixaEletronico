package br.com.letscode.caixaeletronico.services;

import repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutaComandoImpl implements ExecutaComando {

    private final Deposito deposito;
    private final Saque saque;
    private final AbrirConta abrirConta;

    public ExecutaComandoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new DepositoImpl(repository);
        this.saque = new SaqueImpl();
        this.abrirConta = new AbrirContaImpl(repository);
    }

    @Override
    public boolean execute(int comando) {

    Scanner entrada = new Scanner(System.in);

        boolean result = true;

        if (comando == 0) {
            System.out.println();
            System.out.println("Operação encerrada. Até logo!");
            result = false;
        } else if (comando == 1) {
            System.out.println();
            System.out.println("Saque efetuado com sucesso!");
        } else if (comando == 2) {
            System.out.println();
            System.out.println("Digite o número da conta: ");
            int numero = entrada.nextInt();
            System.out.println("Digite o valor do depósito: ");
            double valor = entrada.nextInt();
            this.deposito.execute(valor, numero);
            System.out.println("Depósito realizado com sucesso!");
        } else if (comando == 3) {
            abrirConta.execute();
            System.out.println();
            System.out.println("Conta aberta!");
        } else {
            System.out.println("Comando inválido!");
        }

        return result;

    }
}
