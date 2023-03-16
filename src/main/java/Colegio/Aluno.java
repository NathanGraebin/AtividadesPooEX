//Criar um projeto para Cadastrar Alunos.

//Criar uma classe para definir Aluno com no mínimo 5 atributos com tipos de dados diferentes e privados. 
//A Classe também deverá ter um método construtor para atribuir 2 atributos principais no construtor e mais 3 métodos para definir os outros atributos;

//Criar uma classe para definir Turma com no mínimo 4 atributos e 1 desses atributos deverá ser referência da classe aluno;

//Na Classe principal solicitar o cadastro de 3 Alunos utilizando o método construtor e 
//solicitando o preenchimento através dos outros métodos que definem os atributos;

//Na Classe principal solicitar o cadastro de 2 turmas e cada turma deverá ter no mínimo 1 aluno cadastrado ao
//escolher o aluno deverá validar se o aluno está cadastrado;


package Colegio;

/**
 *
 * @author aluno
 */
public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private String telefone;
    private String cpf;

    public Aluno(String nome, int idade, String email, String telefone, String cpf) {
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


