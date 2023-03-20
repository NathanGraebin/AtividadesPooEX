/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futebolVetor;

/**
 *
 * @author Nathanelisabetinho
 */
public class timeFutebol {
    private String nomeTime;
    private int idTime;
    private int quantosJogadores;
    private int quantidadeVitorias;
    private int quantidadeDerrotas;
    public Jogador novoJogador[];

    public timeFutebol(String nomeTime, int idTime, int quantosJogadores, int quantidadeVitorias, int quantidadeDerrotas) {
        this.nomeTime = nomeTime;
        this.idTime = idTime;
        this.quantosJogadores = quantosJogadores;
        this.quantidadeVitorias = quantidadeVitorias;
        this.quantidadeDerrotas = quantidadeDerrotas;
        
        
    }

    timeFutebol(Jogador[] novoJogador) {
        novoJogador = novoJogador;
    }

    

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public int getQuantosJogadores() {
        return quantosJogadores;
    }

    public void setQuantosJogadores(int quantosJogadores) {
        this.quantosJogadores = quantosJogadores;
    }

    public int getQuantidadeVitorias() {
        return quantidadeVitorias;
    }

    public void setQuantidadeVitorias(int quantidadeVitorias) {
        this.quantidadeVitorias = quantidadeVitorias;
    }

    public int getQuantidadeDerrotas() {
        return quantidadeDerrotas;
    }

    public void setQuantidadeDerrotas(int quantidadeDerrotas) {
        this.quantidadeDerrotas = quantidadeDerrotas;
    }

    public Jogador[] getNovoJogador() {
        for (int i = 0; i < 5 ; i++) {
            
        
        novoJogador[i].getNome();
        }
        return novoJogador = novoJogador;
        
    }

    public void setNovoJogador(String novoJogador1) {
        
        this.novoJogador = novoJogador;
    }

   
    
    
    
    
}
