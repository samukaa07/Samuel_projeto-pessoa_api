package com.samuel.projeto.api_pessoa.controller;

import com.samuel.projeto.api_pessoa.dto.request.PessoaDTO;
import com.samuel.projeto.api_pessoa.dto.response.MessageResponseDTO;
import com.samuel.projeto.api_pessoa.exception.PessoaNotFoundException;
import com.samuel.projeto.api_pessoa.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/pessoas")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaController {

    private PessoaService pessoaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO criaPessoa(@RequestBody @Valid PessoaDTO pessoaDTO) {
        return pessoaService.createPessoa(pessoaDTO);
    }

    @GetMapping
    public List<PessoaDTO> listaTodasPessoas(){
        return pessoaService.listAll();
    }

    @GetMapping("/{id}")
    public PessoaDTO encontrarPorId(@PathVariable Long id) throws PessoaNotFoundException {
        return pessoaService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO atualizarPorId(@PathVariable Long id, @RequestBody @Valid PessoaDTO pessoaDTO) throws PessoaNotFoundException {
        return pessoaService.updateById(id, pessoaDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void apagarPorId(@PathVariable Long id) throws PessoaNotFoundException {
        pessoaService.delete(id);
    }
}
