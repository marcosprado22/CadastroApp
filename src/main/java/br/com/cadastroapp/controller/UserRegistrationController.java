package br.com.cadastroapp.controller;

import br.com.cadastroapp.dto.DadosLogin;
import br.com.cadastroapp.dto.UserAuthenticationDTO;
import br.com.cadastroapp.service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public class UserRegistrationController {

    private UserAuthenticationService userAuthenticationService;

    @Autowired
    public AuthenticationController(UserAuthenticationService userAuthenticationService){
        this.userAuthenticationService = userAuthenticationService;
    }

    public AuthenticationController(){

    }

    @PostMapping("/login")
    public ResponseEntity<UserAuthenticationDTO> autenticar(@RequestBody DadosLogin dadosLogin, @RequestHeader String Authorization){
       User user = userAuthenticationService.authenticate(dadosLogin, Authorization);
       return new ResponseEntity<UserAuthenticationDTO>(UserAuthenticationDTO.toDTO(user, "Bearer "), HttpStatus.ACCEPTED);
    }
}
