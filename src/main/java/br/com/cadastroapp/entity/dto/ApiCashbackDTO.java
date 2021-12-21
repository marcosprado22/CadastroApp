package br.com.cadastroapp.entity.dto;


import java.math.BigDecimal;

public class ApiCashbackDTO {

    private String statusCode;
    private BigDecimal credit;

    public ApiCashbackDTO() {

    }

    public ApiCashbackDTO(String statusCode, BigDecimal credit) {
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


