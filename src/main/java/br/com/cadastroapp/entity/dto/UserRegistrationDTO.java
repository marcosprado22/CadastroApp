package br.com.cadastroapp.entity.dto;

import br.com.cadastroapp.model.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserRegistrationDTO extends User {

    private Long id;
    private String nome;
    private String email;
    private String senha;

    public UserRegistrationDTO(){

    }

    public UserRegistrationDTO(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }

    public User toUser() {
        return new User(getNome(), getEmail(), getSenha());
    }

}
