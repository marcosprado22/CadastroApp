package br.com.cadastroapp.service;

import br.com.cadastroapp.dto.DadosLogin;
import br.com.cadastroapp.exception.ExistingEmailException;
import br.com.cadastroapp.exception.ExpiredTokenException;
import br.com.cadastroapp.exception.InvalidLoginException;
import br.com.cadastroapp.exception.InvalidTokenException;
import br.com.cadastroapp.model.User;
import br.com.cadastroapp.repository.UserRepository;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;
import java.util.Date;


@Service
public class UserAuthenticationService {

    private final UserRepository userRepository;
    private final TokenService tokenService;

    public UserAuthenticationService(UserRepository userRepository, TokenService tokenService){
        this.userRepository = userRepository;
        this.tokenService = tokenService;

    }

    public User autenticar(DadosLogin dados, String token){
        User user = userRepository.findByEmail(dados.getEmail()).orElseThrow(ExistingEmailException::new);
        if(dados.getSenha().equals(user.getSenha()) && !token.isEmpty() && validar(token)){
            return user;
        }
        else {
            throw new InvalidLoginException();
        }
    }

    private boolean validar(String token) {
        try {
            String tokenTratado = token.replace("Bearer ", "");
            Claims claims = tokenService.decodeToken(tokenTratado);

            System.out.println(claims.getIssuer());
            System.out.println(claims.getIssuedAt());

            //Verifica se o token está expirado
            if (claims.getExpiration().before(new Date(System.currentTimeMillis()))) throw new ExpiredTokenException();
            System.out.println(claims.getExpiration());
            return true;
        } catch (ExpiredTokenException et){
            et.printStackTrace();
            throw et;
        } catch (Exception e) {
            e.printStackTrace();
            throw new InvalidTokenException();
        }
    }
}
