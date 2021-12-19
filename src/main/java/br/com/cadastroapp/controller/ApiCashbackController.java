package br.com.cadastroapp.controller;

import br.com.cadastroapp.dto.ApiCashbackDTO;
import br.com.cadastroapp.service.ApiCashbackService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/api")
public class ApiCashbackController {


    private ApiCashbackService apiCashbackService;

    @Autowired
    public ApiCashbackController(ApiCashbackService apiCashbackService) {
        this.apiCashbackService = apiCashbackService;
    }


    @GetMapping("/cashback")
    public ResponseEntity<ApiCashbackDTO> buscar(@RequestBody ApiCashbackDTO apiCashbackDTO) {
        if (apiCashbackDTO.buscar().isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Logger logger = null;
        logger.info(apiCashbackService.buscar());
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
