package br.com.cadastroapp.dto;

import br.com.cadastroapp.model.User;

public class UserAuthenticationDTO {
    private String tipo;
    private String email;
    private String nome;
    private String token;


    public UserAuthenticationDTO(String tipo, String email, String nome, String token) {
        this.email = email;
        this.nome = nome;
        this.token = token;
        this.tipo = tipo;
    }

   public UserAuthenticationDTO(){}
    public static UserAuthenticationDTO toDTO(User user, String tipo){
        return new UserAuthenticationDTO(user.getEmail(), user.getNome(), user.getToken(), tipo);
    }
    public String getTipo() {

        return tipo;
    }

    public String getEmail() {

        return email;
    }

    public String getNome() {

        return nome;
    }

    public String getToken() {

        return token;
    }
}
