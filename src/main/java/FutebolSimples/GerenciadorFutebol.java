/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FutebolSimples;

import Colegio.Turma;
import java.util.Scanner;

/**
 *
 * @author Nathanelisabetinho
 */
public class GerenciadorFutebol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador novoJogador1 = new Jogador("1", 1, 1, 1, 1, "1");
        Jogador novoJogador2 = new Jogador("2", 2, 2, 2, 2, "2");
        Jogador novoJogador3 = new Jogador("3", 3, 3, 3, 3, "3");
        Jogador novoJogador4 = new Jogador("4", 4, 4, 4, 4, "4");
        Jogador novoJogador5 = new Jogador("5", 5, 5, 5, 5, "5");

        timeFutebol time1 = new timeFutebol("time1", 1, 1, 1, 1, novoJogador1);
        if (time1.getNovoJogador() != null) {
            System.out.println("Jogador do time > " + time1.nomeTime);

        }
        timeFutebol time2 = new timeFutebol("time2", 2, 2, 2, 2, novoJogador2);
        if (time2.getNovoJogador() == novoJogador2) {
            System.out.println("Jogador do time > " + time2.nomeTime);
        }
        
        System.out.println("Jogo de hoje : " + time1.nomeTime + " VS " + time2.nomeTime);
        

    }
}
