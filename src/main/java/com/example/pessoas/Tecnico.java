package com.example.pessoas;

import com.example.clube.Time;

public class Tecnico {
    private String nome;
    private int idade;
    private String clubeAtual;
    private String formacao;

    public Tecnico(String nome, int idade, String clubeAtual, String formacao) {
        this.nome = nome;
        this.idade = idade;
        this.clubeAtual = clubeAtual;
        this.formacao = formacao;
    }

    public void liderarTime(Time time) {
        time.setTecnico(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getClubeAtual() {
        return clubeAtual;
    }

    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}