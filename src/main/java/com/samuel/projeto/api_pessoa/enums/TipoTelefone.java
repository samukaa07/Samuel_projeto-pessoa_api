package com.samuel.projeto.api_pessoa.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoTelefone {

    CASA("Casa"),
    CELULAR("Celular"),
    COMMERCIAL("Comercial");

    private final String description;
}
