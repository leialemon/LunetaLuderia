package tech.ada.luderiaPessoas.controller;

import org.springframework.web.bind.annotation.*;
import tech.ada.luderiaPessoas.model.Pessoa;
import tech.ada.luderiaPessoas.model.PessoaDTO;
import tech.ada.luderiaPessoas.model.PessoaMapper;
import tech.ada.luderiaPessoas.service.BuscarPessoaService;
import tech.ada.luderiaPessoas.service.CriarPessoaService;

import java.util.List;

@RestController
@RequestMapping("/v1/pessoas")
public class PessoaController {

    private final CriarPessoaService criarPessoaService;
    private final BuscarPessoaService buscarPessoaService;
    private final PessoaMapper pessoaMapper;

    public PessoaController(PessoaMapper pessoaMapper, CriarPessoaService criarPessoaService, BuscarPessoaService buscarPessoaService){
        this.buscarPessoaService = buscarPessoaService;
        this.criarPessoaService = criarPessoaService;
        this.pessoaMapper = pessoaMapper;
    }

    @PostMapping
    public String criarPessoa(Pessoa pessoa){
        return criarPessoaService.criarPessoa(pessoa);
    }

    @GetMapping
    public List<Pessoa> mostrarTodasPessoasCadastradas(){
        return buscarPessoaService.mostrarTodasPessoasCadastradas();
    }

    @GetMapping("/{cpf}")
    public PessoaDTO buscarPessoaPorCpf(@PathVariable("cpf") String cpf){
        return pessoaMapper.dePessoaParaDto(buscarPessoaService.buscarPessoaPorCpf(cpf));
    }
}
