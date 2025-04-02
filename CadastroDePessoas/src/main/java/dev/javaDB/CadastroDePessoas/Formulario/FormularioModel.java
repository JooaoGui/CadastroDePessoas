package dev.javaDB.CadastroDePessoas.Formulario;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(name = "emprego", length = 100)
    private String emprego;

    @Column(name = "salario")
    private Integer salario;

    // Relacionamento muitos-para-um: muitos formulários para uma pessoa
    @OneToMany(mappedBy = "formulario", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<PessoaModel> pessoas;
}