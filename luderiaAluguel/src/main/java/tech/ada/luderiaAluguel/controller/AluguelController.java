package tech.ada.luderiaAluguel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AluguelController {

    @GetMapping
    public String testando(){
        return "Serviço de alugueis ligado";
    }

}
