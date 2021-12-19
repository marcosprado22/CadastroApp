package br.com.cadastroapp.dto;

import br.com.cadastroapp.model.User;
import org.apache.logging.log4j.ThreadContext;


import java.math.BigDecimal;
import java.util.Map;

public class ApiCashbackDTO {

    private String statusCode;
    private BigDecimal credit;

    public ApiCashbackDTO(String statusCode, BigDecimal credit) {
    }

    public static ApiCashbackDTO toDTO(User user) {
        return new ApiCashbackDTO(user.getStatusCode(), user.getCredit());
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


    public Map<Object, Object> buscar() {
        return null;
    }
}


