package dev.javaDB.CadastroDePessoas.Pessoas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Test de Rota";
    }

    //Adicionar pessoas (CREATE)
    @PostMapping("/adicionar")
    public PessoaModel adicionarPessoa(@RequestBody PessoaModel pessoa) {
        return pessoaService.adicionarPessoa(pessoa);
    }

    //Mostrar pessoas (READ)
    @GetMapping("/listar")
    public List<PessoaModel> listarPessoas() {
        return pessoaService.listarPessoas();
    }

    //Mostrar todas as pessoas por ID (READ)
    @GetMapping("/Listar/{id}")
    public ResponseEntity<String> listarPessoasID(@PathVariable Long id) {
        pessoaService.listarPessoasID(id);
        return ResponseEntity.ok("Pessoas por ID:");
    }

    //Alterar dados das pessoas(UPDATE)
    @PutMapping("/alterar/{id}")
    public PessoaModel alterarPorID(@PathVariable Long id, @RequestBody PessoaModel pessoaAtualizado) {
        return pessoaService.atualizarPessoa(id, pessoaAtualizado);
    }

    //Deletar pessoa (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarPorID(@PathVariable Long id) {
        pessoaService.deletarPorID(id);
        return ResponseEntity.ok("Pessoa deletada com sucesso");
    }
}
