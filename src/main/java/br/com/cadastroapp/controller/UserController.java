package br.com.cadastroapp.controller;

import br.com.cadastroapp.model.User;
import br.com.cadastroapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping ("/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/cadastrar")
    public String cadastrar(@ModelAttribute("user") User user){
        return "/user/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("clientes", repository.findAll());
        return "/user/listar";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("cliente") User user, RedirectAttributes attr) {
        repository.salvar(user);
        attr.addFlashAttribute("success", "Cliente adicionado com sucesso");
        return "redirect:/user/cadastrar";
    }
}
