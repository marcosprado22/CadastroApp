package br.com.cadastroapp.controller;

import br.com.cadastroapp.model.Produto;
import br.com.cadastroapp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class ProdutoController {

    @Controller
    @RequestMapping("/produtos")
    public class ProdutosController {

        @Autowired
        private ProdutoRepository repository;

        @GetMapping("/cadastrar")
        public String cadastrar(@ModelAttribute("produto") Produto produto) {
            return "/produtos/cadastro";
        }

        @GetMapping("/listar")
        public String listar(ModelMap model) {
            model.addAttribute("produtos", repository.findAll());
            return "/produtos/listar";
        }

        @PostMapping("/salvar")
        public String salvar(@ModelAttribute("produto") Produto produto, RedirectAttributes attr) {
            repository.salvar(produto);
            attr.addFlashAttribute("success", "Produto adicionado com sucesso");
            return "redirect:/produtos/cadastrar";
        }
    }
}
