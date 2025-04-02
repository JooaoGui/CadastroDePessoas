package dev.javaDB.CadastroDePessoas.Pessoas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PesssoService {

    private PessoaRepository pessoaRepository;

    public PesssoService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    //Listar todas as pessoas
    public List<PessoaModel> listarPessoas(){
        return pessoaRepository.findAll();
    }
}
