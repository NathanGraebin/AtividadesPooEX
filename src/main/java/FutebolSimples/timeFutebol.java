/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FutebolSimples;

/**
 *
 * @author Nathanelisabetinho
 */
public class timeFutebol {
    public String nomeTime;
    private int idTime;
    private int quantosJogadores;
    private int quantidadeVitorias;
    private int quantidadeDerrotas;
    public Jogador novoJogador;

    public timeFutebol(String nomeTime, int idTime, int quantosJogadores, int quantidadeVitorias, int quantidadeDerrotas, Jogador novoJogador) {
        this.nomeTime = nomeTime;
        this.idTime = idTime;
        this.quantosJogadores = quantosJogadores;
        this.quantidadeVitorias = quantidadeVitorias;
        this.quantidadeDerrotas = quantidadeDerrotas;
        this.novoJogador = novoJogador;
    }
   

    public Jogador getNovoJogador(){
    return novoJogador;
    }

    
    
}
