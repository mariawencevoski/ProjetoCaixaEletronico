package repository;

import br.com.letscode.caixaeletronico.model.Conta;

import java.util.List;

public interface ContaRepository<T> {

     List findAll();

    T findById(int id);

    void adiciona(T objeto);

    void adiciona(Conta objeto);
}
