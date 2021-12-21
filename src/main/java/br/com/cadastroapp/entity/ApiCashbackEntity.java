package br.com.cadastroapp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

public class ApiCashbackEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String statusCode;
    private BigDecimal credit;

    public ApiCashbackEntity(){

    }

    public ApiCashbackEntity(String statusCode, BigDecimal credit) {
        this.statusCode = statusCode;
        this.credit = credit;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }
}
