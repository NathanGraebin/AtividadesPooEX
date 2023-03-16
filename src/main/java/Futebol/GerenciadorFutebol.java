/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Futebol;

import java.util.Scanner;

/**
 *
 * @author Nathanelisabetinho
 */
public class GerenciadorFutebol {
String nome;
int idade;
int numeroCamisa;
String cpf;
String posicaoJogada;

    Scanner Ler = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador novoJogador[] = new Jogador[5];

        for (int i = 0; i < 10; i++) {
            
            novoJogador[i] = new Jogador("",0,0,"","");
        }
    }

}
