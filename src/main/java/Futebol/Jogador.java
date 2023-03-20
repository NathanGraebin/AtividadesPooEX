/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Futebol;

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

    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public int getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void setNivelHabilidade(String cpf) {
        this.nivelHabilidade = nivelHabilidade;
    }

    public String getPosicaoJogada() {
        return posicaoJogada;
    }

    public void setPosicaoJogada(String posicaoJogada) {
        this.posicaoJogada = posicaoJogada;
    }
    
    
    
    
}
