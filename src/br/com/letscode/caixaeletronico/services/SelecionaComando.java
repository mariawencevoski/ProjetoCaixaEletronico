package br.com.letscode.caixaeletronico.services;

import java.util.Scanner;

public class SelecionaComando {

    private final ListarComandos listarComandos;

    private final ObtemComando obtemComando;

    private final ExecutaComando executaComando;

    // CONSTRUTOR

    public SelecionaComando() {
        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoImpl();
        this.executaComando = new ExecutaComandoImpl();
    }

    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return executaComando.execute(comando);
    }

}
