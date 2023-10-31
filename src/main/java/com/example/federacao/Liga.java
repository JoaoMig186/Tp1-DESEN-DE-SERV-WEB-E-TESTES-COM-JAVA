package com.example.federacao;

import com.example.clube.Time;

import java.util.List;

public class Liga {
    private String nome;
    private List<Time> times;

    public Liga(String nome, List<Time> times) {
        this.nome = nome;
        this.times = times;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }
}