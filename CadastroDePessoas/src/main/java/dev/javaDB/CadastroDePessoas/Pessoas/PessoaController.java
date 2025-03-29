package dev.javaDB.CadastroDePessoas.Pessoas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Test de Rota";
    }

    //Adicionar pessoas (CREATE)
    @PostMapping("/adicionar")
    public String adicionarPessoa(){
        return "Pessoa adicionada";
    }
    //Procurar pessoas (READ)
    @GetMapping("/listar")
    public String mostrarTodasPessoas(){
        return "Listar pessoa";
    }
    //Mostrar todas as pessoas pod ID (READ)
    @GetMapping("/ListarID")
    public String mostrarTodasPessoasID(){
        return "Listar pessoa por ID";
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
