package dev.javaDB.CadastroDePessoas.Pessoas;

import dev.javaDB.CadastroDePessoas.Formulario.FormularioModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//Classe transformada (com Entity) em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;

    private String dataNascimento;

    private int idade;

    //@ManyToOne - Uma pessoa tem um unico formulario, com as informações de emprego e salario.
    @ManyToOne
    @JoinColumn(name = "formulario_id") // Foreing Key, ou Chave estrangeira
    private FormularioModel formularioModelList;

    public PessoaModel(){}

    public PessoaModel(String nome, String dataNascimento, int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
