/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advogado;

/**
 *
 * @author Nathanelisabetinho
 */
public class Advogado {
    public String nome;
    public int idade;
    private int oab;
    private String telefone;
    private String cpf;
    private String email;

    public Advogado(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
     
     public  String  mostrarInformacoes () {
        return  "\n Nome: " + getNome() + "\n Idade: " + this.idade + "\n Oab: " + getOab() + "\n Telefone: " + getTelefone() + "\n Cpf: " + cpf + "\n E-mail:" + email;
                
                
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

    public int getOab() {
        return oab;
    }

    public void setOab(int oab) {
        this.oab = oab;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
