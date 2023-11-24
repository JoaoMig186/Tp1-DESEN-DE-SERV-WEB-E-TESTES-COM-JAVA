package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.clube.Time;
import com.example.pessoas.Jogador;
import com.example.pessoas.Tecnico;
import com.example.clube.Estadio;
import com.example.federacao.Liga;
import com.example.federacao.Instituicao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // Criar jogadores
        Jogador jogador1 = new Jogador("Neymar Jr.", 30, "Paris Saint-Germain", 10);
        Jogador jogador2 = new Jogador("Lionel Messi", 34, "Paris Saint-Germain", 30);

        // Criar técnico
        Tecnico tecnico = new Tecnico("Thomas Tuchel", 48, "Paris Saint-Germain", "Licenciatura em Esportes");

        // Criar time e adicionar jogadores e técnico
        Time timePSG = new Time("Paris Saint-Germain", 10, new ArrayList<>(Arrays.asList(jogador1, jogador2)), tecnico);

        // Criar estádio
        Estadio estadioPSG = new Estadio("Parc des Princes", 48000);

        // Criar liga e adicionar time
        Liga ligaLigue1 = new Liga("Ligue 1", new ArrayList<>(Collections.singletonList(timePSG)));

        // Criar instituição e adicionar liga
        Instituicao cbf = new Instituicao("Confederação Brasileira de Futebol", new ArrayList<>(Collections.singletonList(ligaLigue1)));

        // Exemplo de operações
        logger.info("Time: {}", timePSG.getNome());
        logger.debug("Debug: Informações detalhadas");
        logger.error("Erro: Ocorreu um erro crítico ao manipular esse sistema");
        logger.info("Técnico: {}", timePSG.getTecnico().getNome());
        logger.info("Estádio: {}", estadioPSG.getNome());
        logger.info("Liga: {}", ligaLigue1.getNome());
        logger.info("Instituição: {}", cbf.getNome());

        if(jogador1.getNumeroCamisa() == 10){
            System.out.println("Este jogador é craque!!!");
        }

        // Transferir jogador1 para outro time
        Time novoTime = new Time("FC Barcelona", 5, new ArrayList<>(), tecnico);
        jogador1.transferirPara(novoTime, 11);

        logger.info("Após a transferência:");
        logger.info("Jogador 1 está no time {}", jogador1.getClubeAtual());
        logger.info("Jogador 1 está usando a camisa {}", jogador1.getNumeroCamisa());

        // Liderar o time com o técnico
        tecnico.liderarTime(novoTime);
        logger.info("O técnico {} está liderando o time {}", tecnico.getNome(), novoTime.getNome());
    }
}
