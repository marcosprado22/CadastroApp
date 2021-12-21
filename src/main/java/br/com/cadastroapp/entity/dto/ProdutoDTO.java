package br.com.cadastroapp.entity.dto;

import java.math.BigDecimal;


public class ProdutoDTO {

    private String id;

    private String codigo;
    private String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    private BigDecimal valor;

    public ProdutoDTO(){
    }

    public ProdutoDTO(String id, String codigo, String descricao, BigDecimal valor){
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

}
