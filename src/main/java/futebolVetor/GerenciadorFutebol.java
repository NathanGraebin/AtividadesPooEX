/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futebolVetor;

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
        Scanner Ler = new Scanner(System.in);
        String nome;
        int id;
        int idade;
        int numeroCamisa;
        int nivelHabilidade;
        String posicaoJogada;

        String nomeTime;
        int idTime;
        int quantosJogadores;
        int quantidadeVitorias;
        int quantidadeDerrotas;

        Jogador novoJogador[] = new Jogador[5];
        timeFutebol novotime[] = new timeFutebol[5];

        for (int i = 0; i < 5; i++) {

            novoJogador[i] = new Jogador("", 0, 0, 0, 0, "");
            novotime[i] = new timeFutebol("", 0, 0, 0, 0);
            
        }

        int op = -1;
        while (op != 0) {
            System.out.println("=====================");
            System.out.println("[1] CADASTRAR JOGADOR");
            System.out.println("[2] CADASTRAR TIME");
            System.out.println("[3] RELATORIO JOGOS");
            System.out.println("[4] PROCURAR JOGADOR");

            System.out.println("[5] MOSTRAR TODOS OS JOGADORES");
            System.out.println("[6] MOSTRAR TODOS TIMES");

            op = Ler.nextInt();
            switch (op) {

                case 1:
                    for (int i = 0; i < 5; i++) {
                        if (novoJogador[i].getIdJogador() == 0) {
                            System.out.println("VERIFICANDO DISPONIBILIDADE DE CADASTRO");
                            System.out.println("#######################################");
                            System.out.println("VETOR >" + i + " DIPOSNIVEL");
                            System.out.println("#######################################");
                            System.out.println("#######################################");
                            System.out.println("");
                            System.out.println("Informe o NOME do Jogador");
                            nome = Ler.next();
                            System.out.println("Informe o ID do Jogador");
                            id = Ler.nextInt();

                            System.out.println("Informe a Idade");
                            idade = Ler.nextInt();
                            System.out.println("Informe o numero da Camiseta");
                            numeroCamisa = Ler.nextInt();
                            System.out.println("Informe o nivel de habilidade ( 1 a 10 ");
                            nivelHabilidade = Ler.nextInt();
                            System.out.println("Informe a posição jogada");
                            posicaoJogada = Ler.next();
                            System.out.println("Informe o TIME");
                            idTime = Ler.nextInt();
                            
                            for (int j = 0; j < 5; j++) {
                                if (novotime[j].getIdTime() == idTime) {
                                    novoJogador[i] = new Jogador(nome, id, idade, numeroCamisa, nivelHabilidade, posicaoJogada);
                                    novotime[j].setNovoJogador(nome);
                                    System.out.println("###########################################################");
                                    System.out.println("CADASTRO REALIZADO COM SUCESSO");
                                    i = 5;
                                } else {
                                
                                }
                                
                            }
                            

                            i = 5;
                        }

                    }

                    break;

                case 2:

                    for (int i = 0; i < 5; i++) {

                        if (novotime[i].getIdTime() == 0) {

                            System.out.println("Informe o nome do Time ");
                            nomeTime = Ler.next();
                            System.out.println("Informe o Id ");
                            idTime = Ler.nextInt();
                            System.out.println("Informe quantos jogadores tem");
                            quantosJogadores = Ler.nextInt();
                            System.out.println("Informe a quantidade de Vitorias ");
                            quantidadeVitorias = Ler.nextInt();
                            System.out.println("Informe a quantidade de Derrotas ");
                            quantidadeDerrotas = Ler.nextInt();

                            novotime[i] = new timeFutebol(nomeTime, idTime, quantosJogadores, quantidadeVitorias, quantidadeDerrotas);
                            System.out.println("###########################################################");
                            System.out.println("CADASTRO REALIZADO COM SUCESSO");
                            i = 5;
                        }
                    }
                    break;

                case 3:
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Informe o Nome do jogador " + novoJogador[i].getNome());
                        nome = Ler.next();
                        if (novoJogador[i].getNome() == nome) {
                            System.out.println("####################################### ");
                            System.out.println("Jogador encontrado ");
                            System.out.println("Nome : " + novoJogador[i].getNome());
                            System.out.println("Idade : " + novoJogador[i].getIdade());
                            System.out.println("Numero na Camisa : " + novoJogador[i].getNumeroCamisa());
                            System.out.println("Nivel de Habilidade : " + novoJogador[i].getNivelHabilidade());
                            System.out.println("Posicação Jogada : " + novoJogador[i].getPosicaoJogada());;
                            i = 5;
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Nome : " + novoJogador[i].getNome());
                        System.out.println("Idade : " + novoJogador[i].getIdade());
                        System.out.println("Numero na Camisa : " + novoJogador[i].getNumeroCamisa());
                        System.out.println("Nivel de Habilidade : " + novoJogador[i].getNivelHabilidade());
                        System.out.println("Posicação Jogada : " + novoJogador[i].getPosicaoJogada());

                        System.out.println("######################################");
                    }
                    break;
                case 6:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Nome : " + novotime[i].getNomeTime());
                        System.out.println("Id do time : " + novotime[i].getIdTime());
                        System.out.println("Quantos Jogadores: " + novotime[i].getQuantosJogadores());
                        System.out.println("Quantidade Vitorias : " + novotime[i].getQuantidadeVitorias());
                        System.out.println("Quantidade Derrotas " + novotime[i].getQuantidadeDerrotas());
                        System.out.println("JOGADORES");
                        for (int j = 0; j < 5; j++) {

                            System.out.println("JOGADOR : " + novotime[i].getNovoJogador());
                            
                        }
                        System.out.println("############ds#");
                    }
                    break;

            }

        }
    }
}
