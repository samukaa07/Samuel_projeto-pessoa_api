package com.samuel.projeto.api_pessoa.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String nomePrimeiro;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String nomeUltimo;

    @NotEmpty
    @CPF
    private String cpf;

    private String dataNascimento;


    private String endereco;

    private String logradouro;

    private String cep;

    private String numero;

    private String cidade;

    @Valid
    @NotEmpty
    private List<TelefoneDTO> telefones;

}
