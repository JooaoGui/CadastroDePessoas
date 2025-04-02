package dev.javaDB.CadastroDePessoas.Pessoas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PesssoaService {

    private PessoaRepository pessoaRepository;

    public PesssoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    //Listar todas as pessoas
    public List<PessoaModel> listarPessoas(){
        return pessoaRepository.findAll();
    }
}
