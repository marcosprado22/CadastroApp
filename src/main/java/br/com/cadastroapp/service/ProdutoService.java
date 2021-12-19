package br.com.cadastroapp.service;

import br.com.cadastroapp.model.Produto;
import br.com.cadastroapp.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class ProdutoService {

    @Autowired
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Iterable<Produto> getProduto(){
        log.info("Recuperando todos os produtos");
        return produtoRepository.findAll();
    }

    public Produto getProduto(String id){
        log.info("Recuperando produto pelo id {}", id);
        return produtoRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException(String.format("Produto=[%s] não foi encontrado", id));
        });
    }

    public Produto deleteProduto(String id){
        log.info("Excluindo produto pelo id {} ", id);
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException(String.format("Produto=[%s] não foi encontrado", id));
        });
        produtoRepository.deleteById(id);
        return produto;
    }

    public Produto createProduto(String id){
        Produto produto = Produto.builder().codigo(codigo).descricao(descricao).valor(valor).data(data).build();
        log.info("Criando {}", produto);
        return produtoRepository.salvar(produto);
    }

    public Produto updateProduto(String id, String codigo, BigDecimal valor) {
        log.info("Atualizando produto pelo id {}", id);
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException(String.format("Produto=[%s] não foi encontrado", id));
        });
    }
        if (codigo != null){
            produto.setCodigo(codigo);
        }

        if (descricao != null){
            produto.setDescricao(descricao);
        }

        public Iterable<Produto> getProdutobyId(String id) {
            log.info("Recuperando produto pelo codigo {}", codigo);
            Iterable<Produto> produto = produtoRepository.findById(String id);
            return produto;
        }
}

