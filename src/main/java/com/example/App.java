package com.example;

import com.example.clube.Time;
import com.example.pessoas.Jogador;
import com.example.pessoas.Tecnico;
import com.example.clube.Estadio;
import com.example.federacao.Liga;
import com.example.federacao.Instituicao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Criar jogadores
        Jogador jogador1 = new Jogador("Neymar Jr.", 30, "Paris Saint-Germain", 10);
        Jogador jogador2 = new Jogador("Lionel Messi", 34, "Paris Saint-Germain", 30);

        // Criar técnico
        Tecnico tecnico = new Tecnico("Thomas Tuchel", 48, "Paris Saint-Germain", "Licenciatura em Esportes");

        // Criar time e adicionar jogadores e técnico
        Time timePSG = new Time("Paris Saint-Germain", 10, new ArrayList<>(Arrays.asList(jogador1, jogador2)), tecnico);

        // Criar estadio
        Estadio estadioPSG = new Estadio("Parc des Princes", 48000);

        // Criar liga e adicionar time
        Liga ligaLigue1 = new Liga("Ligue 1", new ArrayList<>(Collections.singletonList(timePSG)));

        // Criar instituição e adicionar liga
        Instituicao cbf = new Instituicao("Confederação Brasileira de Futebol", new ArrayList<>(Collections.singletonList(ligaLigue1)));

        // Exemplo de operações
        System.out.println("Time: " + timePSG.getNome());
        System.out.println("Técnico: " + timePSG.getTecnico().getNome());
        System.out.println("Estádio: " + estadioPSG.getNome());
        System.out.println("Liga: " + ligaLigue1.getNome());
        System.out.println("Instituição: " + cbf.getNome());

        // Transferir jogador1 para outro time
        Time novoTime = new Time("FC Barcelona", 5, new ArrayList<>(), tecnico);
        jogador1.transferirPara(novoTime, 11);

        System.out.println("Após a transferência:");
        System.out.println("Jogador 1 está no time " + jogador1.getClubeAtual());
        System.out.println("Jogador 1 está usando a camisa " + jogador1.getNumeroCamisa());

        // Liderar o time com o técnico
        tecnico.liderarTime(novoTime);
        System.out.println("O técnico " + tecnico.getNome() + " está liderando o time " + novoTime.getNome());
    }
}