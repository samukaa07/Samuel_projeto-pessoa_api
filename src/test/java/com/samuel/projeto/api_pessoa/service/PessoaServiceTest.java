package com.samuel.projeto.api_pessoa.service;

import com.samuel.projeto.api_pessoa.Utils.PessoaUtils;
import com.samuel.projeto.api_pessoa.dto.request.PessoaDTO;
import com.samuel.projeto.api_pessoa.dto.response.MessageResponseDTO;
import com.samuel.projeto.api_pessoa.entity.Pessoa;
import com.samuel.projeto.api_pessoa.repository.PessoaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PessoaServiceTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @InjectMocks
    private PessoaService pessoaService;

    @Test
    void testaPersonDTOFornecidoRetornaSavedMessage() {
        PessoaDTO pessoaDTO = PessoaUtils.createFakeDTO();
        Pessoa pessoaSalvaEsperada = PessoaUtils.createFakeEntity();

        when(pessoaRepository.save(any(Pessoa.class))).thenReturn(pessoaSalvaEsperada);

        MessageResponseDTO mensagemSucessoEsperada = criaMessageResponseEsperada(pessoaSalvaEsperada.getId());
        MessageResponseDTO mensagemSucessoRetornada = pessoaService.createPessoa(pessoaDTO);

        assertEquals(mensagemSucessoEsperada, mensagemSucessoRetornada);
    }

    private MessageResponseDTO criaMessageResponseEsperada(Long id) {
        return MessageResponseDTO
                .builder()
                .message("Foi criada uma pessoa com ID " + id + "!")
                .build();
    }
}
