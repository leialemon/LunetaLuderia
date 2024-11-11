package tech.ada.luderiaPessoas.service;

import org.springframework.stereotype.Service;
import tech.ada.luderiaPessoas.model.Pessoa;
import tech.ada.luderiaPessoas.repository.PessoaRepository;

@Service
public class CriarPessoaService {

    private final PessoaRepository pessoaRepository;

    public CriarPessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public String criarPessoa(Pessoa pessoa){
        pessoaRepository.save(pessoa);
        return String.format("Usuário %s criado com sucesso!", pessoa.getNome());
    }

}
