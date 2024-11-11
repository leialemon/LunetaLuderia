package tech.ada.luderiaPessoas.model;

public class PessoaMapper {

    public PessoaDTO dePessoaParaDto(Pessoa pessoa){
        PessoaDTO retorno = new PessoaDTO();
        retorno.setCpf(pessoa.getCpf());
        retorno.setNome(pessoa.getNome());
        retorno.setTelefone(pessoa.getTelefone());
        return retorno;
    }

    public Pessoa deDtoParaPessoa(PessoaDTO pessoaDTO){
        Pessoa retorno = new Pessoa();
        retorno.setCpf(pessoaDTO.getCpf());
        retorno.setNome(pessoaDTO.getNome());
        retorno.setTelefone(pessoaDTO.getTelefone());
        return retorno;
    }

}
