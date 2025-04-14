package dev.javaDB.CadastroDePessoas.Pessoas;

import dev.javaDB.CadastroDePessoas.Formulario.FormularioRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;
    private final FormularioRepository formularioRepository; // Adicione esta linha

    // Modifica o construtor
    public PessoaService(PessoaRepository pessoaRepository,
                         FormularioRepository formularioRepository) {
        this.pessoaRepository = pessoaRepository;
        this.formularioRepository = formularioRepository; // Injeta o repositório
    }

    //Listar todas as pessoas
    public List<PessoaModel> listarPessoas(){
        return pessoaRepository.findAll();
    }
    //Listar todas as pessoas por ID
    @Transactional
    public PessoaModel listarPessoasID(Long id){
        Optional<PessoaModel>listarPessoasID = pessoaRepository.findById(id);
        return listarPessoasID.orElse(null);
    }
    //Criar nova pessoa
    public PessoaModel adicionarPessoa(PessoaModel pessoa) {
        try {
            // Salva primeiro o formulário se for novo
            if (pessoa.getFormulario() != null && pessoa.getFormulario().getId() == null) {
                formularioRepository.save(pessoa.getFormulario());
            }
            return pessoaRepository.save(pessoa);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Erro de integridade: " + e.getMostSpecificCause().getMessage());
        }
    }
    //Deletar Pessoa
    @Transactional
    public void deletarPorID(Long id) {
        pessoaRepository.deleteById(id);
    }

    //Atualizar Pessoa
    public PessoaModel atualizarPessoa(Long id, PessoaModel pessoaAtualizada){
        if (pessoaRepository.existsById(id)) {
            pessoaAtualizada.setId(id);
            return pessoaRepository.save(pessoaAtualizada);
        }
        return null;
    }
    
}
