package com.samuel.projeto.api_pessoa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Endereco")
public class Endereco {

    @Id
    @Column(name="endereco")
    private String endereco;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="cep")
    private String cep;

    @Column(name="numero")
    private String numero;

    @Column(name="cidade")
    private String cidade;


}