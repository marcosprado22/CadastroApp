package br.com.cadastroapp.repository;

import br.com.cadastroapp.entity.ProdutoEntity;
import br.com.cadastroapp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {


}
