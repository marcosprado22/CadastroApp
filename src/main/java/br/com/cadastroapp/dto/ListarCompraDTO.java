package br.com.cadastroapp.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListarCompraDTO {

    private String codigo;
    private BigDecimal valor;
    private Double cashback;
    private Boolean emValidacao = true;
}
