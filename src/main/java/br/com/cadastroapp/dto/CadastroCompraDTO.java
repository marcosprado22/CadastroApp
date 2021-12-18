package br.com.cadastroapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CadastroCompraDTO {

    @NotBlank
    private String cpf;
    @NotBlank
    private String codigo;
    private BigDecimal valor;
    private Date data;
    private Boolean emValidacao = true;
}
