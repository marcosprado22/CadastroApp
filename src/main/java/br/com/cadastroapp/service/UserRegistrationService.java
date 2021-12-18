package br.com.cadastroapp.service;

import br.com.cadastroapp.model.User;
import br.com.cadastroapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRegistrationService {

    private UserRepository userRepository;
    private TokenService tokenService;

    @Autowired
    public UserRegistrationService(UserRepository userRepository, TokenService tokenService) {
        this.userRepository = userRepository;
        this.tokenService = tokenService;
    }

    public User registrar(User user){
        user.setToken(tokenService.generateToken(user));
        return userRepository.save(user);
    }
}
