package br.com.cadastroapp.repository;

import br.com.cadastroapp.model.Produto;

import java.util.Optional;

public interface ProdutoRepository {
    default Optional<String> findById(String id) {
        return null;
    }

    void salvar(Produto produto);

    Object findAll();

    void deleteById(String id);
}
