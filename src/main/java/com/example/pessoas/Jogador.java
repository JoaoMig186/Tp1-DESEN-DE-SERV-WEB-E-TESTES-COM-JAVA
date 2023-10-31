package com.example.pessoas;
import com.example.clube.Time;

public class Jogador {
    private String nome;
    private int idade;
    private String clubeAtual;
    private int numeroCamisa;

    public Jogador(String nome, int idade, String clubeAtual, int numeroCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.clubeAtual = clubeAtual;
        this.numeroCamisa = numeroCamisa;
    }

    public void transferirPara(Time novoTime, int novoNumeroCamisa) {
        this.clubeAtual = novoTime.getNome();
        this.numeroCamisa = novoNumeroCamisa;
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

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}