/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastrarPaciente;

/**
 *
 * @author aluno
 */
public class cadastrarPaciente {
    public String nome = "";
    public int idade = 0;
    public String email = "";
    public String telefone = "";
    public String cpf = "";
    
    

    
    
    public cadastrarPaciente(String nome,int idade,String email,String telefone,String cpf ) {
        
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    
    
}
