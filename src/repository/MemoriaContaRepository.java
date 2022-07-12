package repository;

import br.com.letscode.caixaeletronico.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class MemoriaContaRepository implements ContaRepository {
    private List contas = new ArrayList<>();

    @Override
    public List findAll() {
        return contas;
    }

    @Override
    public Conta findById(int id) {
        return (Conta) contas.get(id);
    }

    @Override
    public void adiciona(Object objeto) {

    }

    @Override
    public void adiciona(Conta objeto) {
        objeto.setNumeroDaConta(contas.size());
        contas.add(objeto);
    }
}