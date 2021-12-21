package br.com.cadastroapp.controller;

import br.com.cadastroapp.entity.dto.UserAuthenticationDTO;
import br.com.cadastroapp.entity.dto.UserRegistrationDTO;
import br.com.cadastroapp.model.User;
import br.com.cadastroapp.service.UserAuthenticationService;
import br.com.cadastroapp.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class UserRegistrationController {

    private UserRegistrationService userRegistrationService;

    @Autowired
    public UserRegistrationController(UserAuthenticationService userAuthenticationService){
        this.userRegistrationService = userRegistrationService;
    }

    public UserRegistrationController(){

    }

    @PostMapping("/user")
    public ResponseEntity<UserAuthenticationDTO> registrar(@RequestBody UserRegistrationDTO userRegistrationDTO){
       User user = userRegistrationService.registrar(userRegistrationDTO.toUser());
       return new ResponseEntity<UserAuthenticationDTO>(UserAuthenticationDTO.toDTO(user, "Bearer "), HttpStatus.CREATED);
    }

}
