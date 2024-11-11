package tech.ada.luderiaAluguel.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tech.ada.luderiaAluguel.model.Pessoa;

@FeignClient(name="luderiaPessoas")
public interface PessoaClient {

    @GetMapping("/v1/pessoas/{cpf}")
    Pessoa buscarPessoaPorCpf(@PathVariable("cpf") String cpf);
}
