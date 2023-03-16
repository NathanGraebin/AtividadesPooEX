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
    private String nome;
    private int idade;
    private int numeroCamisa;
    private String cpf;
    private String posicaoJogada;

    public Jogador(String nome, int idade, int numeroCamisa, String cpf, String posicaoJogada) {
        this.nome = nome;
        this.idade = idade;
        this.numeroCamisa = numeroCamisa;
        this.cpf = cpf;
        this.posicaoJogada = posicaoJogada;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPosicaoJogada() {
        return posicaoJogada;
    }

    public void setPosicaoJogada(String posicaoJogada) {
        this.posicaoJogada = posicaoJogada;
    }
    
    
}
