package dev.javaDB.CadastroDePessoas.Pessoas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
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
    @GetMapping("/mostrar")
    public String mostrarTodasPessoas(){
        return "Mostrar pessoa";
    }
    //Mostrar todas as pessoas pod ID (READ)
    @GetMapping("/mostrarID")
    public String mostrarTodasPessoasID(){
        return "Mostrar pessoa por ID";
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
