package br.com.cadastroapp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Produto {
       //código, valor, data, % de cashback aplicado para esta compra, valor de cashback compra e status;

    @Id
    @GeneratedValue
    private Long id;

    private String codigo;
    private String descricao;
    private BigDecimal valor;
    private Date data;
    private Boolean emValidacao = true;

    public Produto(Long id, String codigo, String descricao, BigDecimal valor, Date data, Boolean emValidacao) {
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.emValidacao = emValidacao;
    }

    public Produto(Long id, String codigo, String descricao, BigDecimal valor, Date data) {
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Boolean getEmValidacao() {
        return emValidacao;
    }

    public void setEmValidacao(Boolean emValidacao) {
        this.emValidacao = emValidacao;
    }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }
}
