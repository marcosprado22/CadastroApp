package br.com.cadastroapp.dto;

import br.com.cadastroapp.model.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserResponserDTO {

    public Long id;
    public String nome;
    public String email;
    public String senha;

    public UserResponserDTO(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public UserResponserDTO(){}

    public static UserResponserDTO toDTO(User user){
        return new UserResponserDTO(user.getNome(), user.getEmail(), user.getSenha());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
