/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FutebolSimples;

/**
 *
 * @author Nathanelisabetinho
 */
public class Jogador {
    public String nome;
    private int idJogador;
    private int idade;
    private int numeroCamisa;
    private int nivelHabilidade;
    private String posicaoJogada;
    

    public Jogador(String nome, int idJogador, int idade, int numeroCamisa, int nivelHabilidade, String posicaoJogada) {
        this.nome = nome;
        this.idade = idade;
        this.numeroCamisa = numeroCamisa;
        this.nivelHabilidade = nivelHabilidade;
        this.posicaoJogada = posicaoJogada;
        this.idJogador = idJogador;
        
    }

    
    
}
