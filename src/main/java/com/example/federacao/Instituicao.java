package com.example.federacao;

import java.util.List;

public class Instituicao {
    private String nome;
    private List<Liga> ligas;

    public Instituicao(String nome, List<Liga> ligas) {
        this.nome = nome;
        this.ligas = ligas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Liga> getLigas() {
        return ligas;
    }

    public void setLigas(List<Liga> ligas) {
        this.ligas = ligas;
    }
}