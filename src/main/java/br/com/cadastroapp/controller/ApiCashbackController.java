package br.com.cadastroapp.controller;


import br.com.cadastroapp.entity.ApiCashbackEntity;
import br.com.cadastroapp.service.ApiCashbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/api")
public class ApiCashbackController {


    private ApiCashbackService apiCashbackService;

    @Autowired
    public ApiCashbackController(ApiCashbackService apiCashbackService) {
        this.apiCashbackService = apiCashbackService;
    }


    @GetMapping("/cashback/{id}")
    public ApiCashbackEntity findById(@PathVariable Long id){
        return ApiCashbackService.findById(id);
    }

}
