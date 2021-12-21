package br.com.cadastroapp.controller;


import br.com.cadastroapp.entity.dto.DadosLogin;
import br.com.cadastroapp.entity.dto.UserAuthenticationDTO;
import br.com.cadastroapp.model.User;
import br.com.cadastroapp.service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private UserAuthenticationService userAuthenticationService;

    @Autowired
    public AuthenticationController(UserAuthenticationService userAuthenticationService) {
        this.userAuthenticationService = userAuthenticationService;
    }

    @PostMapping("/login")
    public ResponseEntity<UserAuthenticationDTO> autenticar(@RequestBody DadosLogin dadosLogin, @RequestHeader String Authorization) {
        User user = userAuthenticationService.autenticar(dadosLogin, Authorization);
        return new ResponseEntity<UserAuthenticationDTO>(UserAuthenticationDTO.toDTO(user, "Bearer "), HttpStatus.ACCEPTED);
    }




}
