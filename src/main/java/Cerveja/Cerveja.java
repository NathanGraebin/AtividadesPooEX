/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cerveja;

import java.util.Scanner;


public class Cerveja {
    public Scanner Ler = new Scanner(System.in);
    
    
    public String marca;
    public int quantidadeEstoque;
    public String cor;
    public String corGarrafa;
    
    private String codigo;
    private String tipo;
    private String quantidadeMl;

    public Cerveja(String tipo, String codigo) {
        this.tipo = tipo;
        this.codigo = codigo;
    }

       
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCorGarrafa() {
        return corGarrafa;
    }

    public void setCorGarrafa(String corGarrafa) {
        this.corGarrafa = corGarrafa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQuantidadeMl() {
        return quantidadeMl;
    }

    public void setQuantidadeMl(String quantidadeMl) {
        this.quantidadeMl = quantidadeMl;
    }

    public void cadastrar(){
    System.out.println("Informe a marca : ");
    this.marca = Ler.next();
    
    System.out.println("Informe o estoque : ");
    this.quantidadeEstoque = Ler.nextInt();
       
    System.out.println("Informe a cor : ");
    this.cor = Ler.next();
    
    System.out.println("Informe a cor da Garrafa : ");
    this.corGarrafa = Ler.next();
    
    System.out.println("Informe o codigo : ");
    this.codigo = Ler.next();
    
    System.out.println("Informe o tipo : ");
    this.tipo = Ler.next();
    
     System.out.println("Informe a quantidade de Ml's : ");
    this.quantidadeMl = Ler.next();
    
    }
    
}
