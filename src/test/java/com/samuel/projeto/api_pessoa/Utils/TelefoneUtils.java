package com.samuel.projeto.api_pessoa.Utils;

import com.samuel.projeto.api_pessoa.dto.request.TelefoneDTO;
import com.samuel.projeto.api_pessoa.entity.Telefone;
import com.samuel.projeto.api_pessoa.enums.TipoTelefone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

public class TelefoneUtils {

    private static final Long TELEFONE_ID = 1L;
    private static final TipoTelefone TELEFONE_TIPO = TipoTelefone.CELULAR;
    private static final String TELEFONE_NUMERO="(21)99999-9999";

    public static TelefoneDTO createFakeDTO() {
        return TelefoneDTO.builder()
                .id(TELEFONE_ID)
                .numero(TELEFONE_NUMERO)
                .tipo(TELEFONE_TIPO)
                .build();
    }

    public static Telefone createFakeEntity() {
        return Telefone.builder()
                .id(TELEFONE_ID)
                .numero(TELEFONE_NUMERO)
                .tipo(TELEFONE_TIPO)
                .build();
    }
}
