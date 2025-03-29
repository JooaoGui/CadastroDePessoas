package dev.javaDB.CadastroDePessoas.Formulario;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("formulario")
public class FormularioController {

    // Post -- Mandar uma requisicao para criar
    @PostMapping("criar")
    public String criarFormulario(){
        return "Formulario criado com Sucesso";
    }

    // Put -- Mandar uma requisicao para alterar
    @PutMapping("/alterar")
    public String alterarFormulario(){
        return "Formulario alterado com sucesso";
    }

    // GET - Mandar uma requisicao para mostrar
    @GetMapping("/listar")
    public String listarFormulario(){
        return "Formulario listados com sucesso";
    }

    // DELETE -- Mandar uma requisicao para deletar
    @DeleteMapping("/deletar")
    public String deletarFormulario(){
        return "Formulario deletado com Sucesso";
    }
}
