package br.com.cadastroapp.controller;

import br.com.cadastroapp.dto.CadastroCompraDTO;
import br.com.cadastroapp.dto.UserAuthenticationDTO;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroCompraController {
    //código, valor, data e CPF do revendedor

    private final CadastroCompraService cadastroCompraService;

    @Autowired
    public CadastroCompraController(CadastroCompraService cadastroService) {
        this.cadastrocompraService = cadastroCompraService;
    }

    public cadastroCompraCobnicaController(){

    }

    @RequestMapping("/cadastro-compra")
    public ResponseEntity<CadastroCompraDTO> cadastrar(@RequestBody CadastroCompraDTO cadastroCompraDTO){
        CadastroCompra cadastroCompra = cadastroCompraService.registrar(cadastroCompraDTO.toUser());
        return new ResponseEntity<CadastroCompraDTO>(UserAuthenticationDTO.toDTO(cadastroCompraDTO.toUser()));
    }
}

