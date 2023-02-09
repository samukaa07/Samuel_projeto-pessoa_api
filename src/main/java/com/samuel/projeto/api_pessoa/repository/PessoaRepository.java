package com.samuel.projeto.api_pessoa.repository;

import com.samuel.projeto.api_pessoa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}