package dev.javaDB.CadastroDePessoas.Pessoas;

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
    public String boasVindas(){
        return "Test de Rota";
    }

    //Adicionar pessoas (CREATE)
    @PostMapping("/adicionar")
    public PessoaModel adicionarPessoa(@RequestBody PessoaModel pessoa){
        return pessoaService.adicionarPessoa(pessoa);
    }

    //Mostrar pessoas (READ)
    @GetMapping("/listar")
    public List<PessoaModel> listarPessoas(){
        return pessoaService.listarPessoas();
    }

    //Mostrar todas as pessoas por ID (READ)
    @GetMapping("/Listar/{id}")
    public PessoaModel listarPessoasID(@PathVariable Long id){
        return pessoaService.listarPessoasID(id);
    }

    //Alterar dados das pessoas(UPDATE)
    @PutMapping("/alterar")
    public String alterarPorID(){
        return "alterar pessoa por ID";
    }

    //Deletar pessoa (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarPorID(){
        return "Pessoa deletada por ID";
    }
}
