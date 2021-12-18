package br.com.cadastroapp.controller;

import br.com.cadastroapp.dto.ListarCompraDTO;
import br.com.cadastroapp.dto.UserAuthenticationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListarCompraController {
    //código, valor, data, % de cashback aplicado para esta compra, valor de cashback compra e status;

    private final ListarCompraService listarCompraservice;

    @Autowired
    public ListarCompraService(ListarCompraService listarCompraService){
        this.listarCompraService = listarCompraService;
    }

    public cadastroCompraController(){

    }

    @RequestMapping("listar-compra")
    public ResponseEntity<ListarCompraDTO> listar(@RequestBody ListarCompraDTO listarCompraDTO){
        ListarCompraDTO listarCompra = listarCompraService.listarCompra(listarCompraDTO.toUser());
        return new ResponseEntity<ListarCompraDTO>(UserAuthenticationDTO.toDTO(listarCompraDTO.toUser()));
    }
}
