package br.com.cadastroapp.service;

import br.com.cadastroapp.entity.ProdutoEntity;
import br.com.cadastroapp.model.Produto;
import br.com.cadastroapp.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProdutoService {

    @Autowired
    private final ProdutoRepository produtoRepository;

    public List<ProdutoEntity> findAll() {
        return produtoRepository.findAll();
    }

    public ProdutoEntity findById(Long id) {
        Optional<ProdutoEntity> entity = produtoEntity.findById(id);
        if(entity.isPresent()) {
            return entity.get();
        }
        throw new RuntimeException();
    }

    public ProdutoEntity save(ProdutoDTO dto){
        ProdutoEntity entity = new ProdutoEntity();
        entity.setId(dto.getId());
        entity.setCodigo(dto.getCodigo());
        entity.setDescricao(dto.getDescricao());
        entity.setValor(dto.getValor());
        return produtoRepository.save(entity);
    }

    public ProdutoEntity update(ProdutoEntity entity, ProdutoDTO dto){
        entity.setId(dto.getId());
        entity.setCodigo(dto.getCodigo());
        entity.setDescricao(dto.getDescricao());
        entity.setValor(dto.getValor());
        return produtoRepository.save(entity);
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }
}

