package dev.javaDB.CadastroDePessoas.Pessoas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PesssoaService pesssoaService;

    public PessoaController(PesssoaService pesssoaService) {
        this.pesssoaService = pesssoaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Test de Rota";
    }

    //Adicionar pessoas (CREATE)
    @PostMapping("/adicionar")
    public String adicionarPessoa(){
        return "Pessoa adicionada";
    }

    //Mostrar pessoas (READ)
    @GetMapping("/listar")
    public List<PessoaModel> listarPessoas(){
        return pesssoaService.listarPessoas();
    }

    //Mostrar todas as pessoas por ID (READ)
    @GetMapping("/Listar/{id}")
    public PessoaModel listarPessoasID(@PathVariable Long id){
        return pesssoaService.listarPessoasID(id);
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
