package dev.javaDB.CadastroDePessoas.Pessoas;

import dev.javaDB.CadastroDePessoas.Formulario.FormularioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//Classe transformada (com Entity) em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "data_nascimento", length = 10)
    private String dataNascimento;

    @Column(unique = true, length = 100, nullable = false)
    private String email;

    //@ManyToOne - Uma pessoa tem um unico formulario, com as informações de emprego e salario.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "formulario_id") // Foreing Key, ou Chave estrangeira
    private FormularioModel formulario;

}
