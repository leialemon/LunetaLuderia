package tech.ada.luderiaPessoas.service;

import org.springframework.stereotype.Service;
import tech.ada.luderiaPessoas.config.PessoaNaoEncontradaException;
import tech.ada.luderiaPessoas.model.Pessoa;
import tech.ada.luderiaPessoas.repository.PessoaRepository;

import java.util.List;

@Service
public class BuscarPessoaService {

    private final PessoaRepository pessoaRepository;

    public BuscarPessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa buscarPessoaPorCpf(String cpf){
        return pessoaRepository.findByCpf(cpf).orElseThrow(() -> new PessoaNaoEncontradaException(String.format("Usuário com o cpf '%s' não encontrado!", cpf)));
    }

    public List<Pessoa> mostrarTodasPessoasCadastradas(){
        return pessoaRepository.findAll();
    }
}
