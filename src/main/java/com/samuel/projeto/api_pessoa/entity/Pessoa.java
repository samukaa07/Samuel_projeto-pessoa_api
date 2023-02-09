package com.samuel.projeto.api_pessoa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomePrimeiro;

    @Column(nullable = false)
    private String nomeUltimo;

    @Column(nullable = false, unique = true)
    private String cpf;

    private LocalDate dataNascimento;


    private String endereco;


    private String logradouro;


    private String cep;


    private String numero;


    private String cidade;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Telefone> telefones;

}
