package dev.javaDB.CadastroDePessoas.Pessoas;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    // controle de concorrência
    @Version
    private Integer version;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    // Novo campo
    @Column(name = "ano_nascimento")
    private Integer anoNascimento;

    @Column(unique = true, length = 100, nullable = false)
    private String email;

    //@ManyToOne - Uma pessoa tem um unico formulario, com as informações de emprego e salario.
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST) //
    @JoinColumn(name = "formulario_id") // Foreing Key, ou Chave estrangeira
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private FormularioModel formulario;

}
