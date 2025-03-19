package dev.javaDB.CadastroDePessoas.Formulario;

import dev.javaDB.CadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="tb_formulario")
public class FormularioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emprego;

    private int salario;

    private PessoaModel pessoa;

    //@OneToMany - Um formulario(Emprego e Salario) pode conter varias pessoas
    @OneToMany(mappedBy = "formularioModelList")
    private List<FormularioModel> pessoas;

}
