package com.example;

import com.example.clube.Time;
import com.example.pessoas.Jogador;
import com.example.pessoas.Tecnico;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testTransferirJogador() {
        // Crie instâncias necessárias
        Jogador jogador1 = new Jogador("Neymar Jr.", 30, "Paris Saint-Germain", 10);
        Tecnico tecnico = new Tecnico("Thomas Tuchel", 48, "Paris Saint-Germain", "Licenciatura em Esportes");
        Time timePSG = new Time("Paris Saint-Germain", 10, Arrays.asList(jogador1), tecnico);
        Time novoTime = new Time("FC Barcelona", 5, new ArrayList<>(), tecnico);


        jogador1.transferirPara(novoTime, 11);

        assertEquals("FC Barcelona", jogador1.getClubeAtual());
        assertEquals(11, jogador1.getNumeroCamisa());
    }

    @Test
    public void testTransferirJogadorParaTimeInexistente() {
        // Crie instâncias necessárias
        Jogador jogador1 = new Jogador("Neymar Jr.", 30, "Paris Saint-Germain", 10);
        Tecnico tecnico = new Tecnico("Thomas Tuchel", 48, "Paris Saint-Germain", "Licenciatura em Esportes");
        Time timePSG = new Time("Paris Saint-Germain", 10, Arrays.asList(jogador1), tecnico);

        // Tente transferir o jogador para um time inexistente
        assertThrows(NullPointerException.class, () -> jogador1.transferirPara(null, 11));
    }

    @Test
    public void testLiderarTime() {
        Tecnico tecnico = new Tecnico("Thomas Tuchel", 48, "Paris Saint-Germain", "Licenciatura em Esportes");
        Time novoTime = new Time("FC Barcelona", 5, new ArrayList<>(), tecnico);

        tecnico.liderarTime(novoTime);

    }

}
