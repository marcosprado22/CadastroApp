package br.com.cadastroapp.controller;

import br.com.cadastroapp.entity.ProdutoEntity;
import br.com.cadastroapp.model.Produto;
import br.com.cadastroapp.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

public class ProdutoController {

    @RestController
    @RequestMapping("/produtos")
    public class ProdutosController {


        private ProdutoService produtoService;

        @Autowired
        public ProdutoController(ProdutoService produtoService) {
            this.produtoService = produtoService;
        }

        @GetMapping
        public ResponseEntity<Iterable<ProdutoEntity>> getProdutos(@RequestParam(value = "id" , defaultValue = "") Long id) {
            Iterable<Produto> produto = null;
            if (id.isEmpty())
                id = produtoService.getProduto();
            else
                id = produtoService.getById(id.getId());
            return ResponseEntity.ok(produto);
        }

        @GetMapping("/listar")
        public ProdutoEntity findById(Long id){
            return produtoService.findById(id);
        }
    }

        @PostMapping("/cadastrar/{id}")
        @ResponseStatus(HttpStatus.CREATED)
        public ProdutoEntity cadastrar(@RequestBody ProdutoDTO dto, @PathVariable Long id) {
            ProdutoEntity produtoEntity = produtoService.findById(id);
            return produtoService.save(dto);
        }

        @PostMapping("/salvar/{id}")
        @ResponseStatus(HttpStatus.CREATED)
        public ProdutoEntity salvar(@RequestBody ProdutoDTO dto) {
            return produtoService.save(dto);
        }

        @DeleteMapping("/deletar/{id}")
        public ResponseEntity<Produto> deletar(@PathVariable Long id) {
            Produto produto = produtoService.delete(id);
            return ResponseEntity.ok(produto);
        }

}


