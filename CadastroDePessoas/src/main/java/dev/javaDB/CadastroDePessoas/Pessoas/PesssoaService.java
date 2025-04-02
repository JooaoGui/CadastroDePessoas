package dev.javaDB.CadastroDePessoas.Pessoas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    //Listar todas as pessoas por ID
    public PessoaModel listarPessoasID(Long id){
        Optional<PessoaModel>listarPessoasID = pessoaRepository.findById(id);
        return listarPessoasID.orElse(null);
    }
}
