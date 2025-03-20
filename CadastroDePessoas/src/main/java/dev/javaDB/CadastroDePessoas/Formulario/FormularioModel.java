package dev.javaDB.CadastroDePessoas.Formulario;

import dev.javaDB.CadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_formulario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormularioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "emprego")
    private String emprego;

    @Column(name = "salario")
    private int salario;

    private PessoaModel pessoa;

    //@OneToMany - Um formulario(Emprego e Salario) pode conter varias pessoas
    @OneToMany(mappedBy = "formularioModelList")
    private List<FormularioModel> pessoas;

}
