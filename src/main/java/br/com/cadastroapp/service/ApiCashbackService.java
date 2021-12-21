package br.com.cadastroapp.service;

import br.com.cadastroapp.entity.ApiCashbackEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ApiCashbackService {

    @Autowired
    private ApiCashbackEntity apiCashbackEntity;

    public static final String URI = "https://mdaqk8ek5j.execute-api.us-east-1.amazonaws.com/v1/cashback?cpf=12312312323";
    public static final String token = "ZXPURQOARHiMc6Y0flhRC1LVlZQVFRnm";

    public ResponseEntity<ApiCashbackEntity> getApiCashback() {
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ApiCashbackEntity> buscar = rest.getForEntity(URI, ApiCashbackEntity.class);
        return buscar;
    }

    public Map<Object, Object> buscar() {
        return null;
    }
}

