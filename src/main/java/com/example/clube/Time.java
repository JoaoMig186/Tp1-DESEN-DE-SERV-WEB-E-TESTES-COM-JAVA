package com.example.clube;

import com.example.pessoas.Jogador;
import com.example.pessoas.Tecnico;

import java.util.List;

public class Time {
    private String nome;
    private int titulos;
    private List<Jogador> jogadores;
    private Tecnico tecnico;

    public Time(String nome, int titulos, List<Jogador> jogadores, Tecnico tecnico) {
        this.nome = nome;
        this.titulos = titulos;
        this.jogadores = jogadores;
        this.tecnico = tecnico;
    }

    public void contratarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void demitirJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}