package com.example.pessoas;

import com.example.federacao.Instituicao;
import lombok.Getter;
import lombok.Setter;

public class Juiz {
    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private Instituicao instituicao;
}