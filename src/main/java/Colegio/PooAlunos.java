//Criar um projeto para Cadastrar Alunos.
//Criar uma classe para definir Aluno com no mínimo 5 atributos com tipos de dados diferentes e privados. 
//A Classe também deverá ter um método construtor para atribuir 2 atributos principais no construtor e mais 3 métodos para definir os outros atributos;
//Criar uma classe para definir Turma com no mínimo 4 atributos e 1 desses atributos deverá ser referência da classe aluno;
//Na Classe principal solicitar o cadastro de 3 Alunos utilizando o método construtor e 
//solicitando o preenchimento através dos outros métodos que definem os atributos;
//Na Classe principal solicitar o cadastro de 2 turmas e cada turma deverá ter no mínimo 1 aluno cadastrado ao
//escolher o aluno deverá validar se o aluno está cadastrado;
package Colegio;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PooAlunos {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        int codCurso = 0;
        int numeroDaTurma = 0;
        int totalVagas = 0;
        String sala = "";
        String horario = "";
        
        
        String nome = "";
        int idade = 0;
        String email = "";
        String telefone = "";
        String cpf = "";
        
        
        Aluno novoAluno1 = new Aluno(nome, idade, email, telefone, cpf);
        System.out.println("Informe o nome do ALUNO1: ");
        nome = Ler.next();
        System.out.println("Informe A IDADE do ALUNO1: ");
        idade = Ler.nextInt();
        System.out.println("Informe O EMAIL do ALUNO1: ");
        email = Ler.next();
        System.out.println("Informe O TELEFONE do ALUNO1: ");
        telefone = Ler.next();
        System.out.println("Informe O CPF do ALUNO1: ");
        cpf = Ler.next();
        
        novoAluno1.setNome(nome);
        novoAluno1.setIdade(idade);
        novoAluno1.setEmail(email);
        novoAluno1.setTelefone(cpf);
        novoAluno1.setCpf(cpf);

        Turma turma1 = new Turma(novoAluno1);
        System.out.println("Informe o codigo do Curso: ");
        codCurso = Ler.nextInt();
        turma1.setCodCurso(codCurso);
        
        System.out.println("Informe o numero da turma: ");
        numeroDaTurma = Ler.nextInt();
        turma1.setNumeroDaTurma(numeroDaTurma);
        
        System.out.println("Informe o total de vagas: ");
        totalVagas = Ler.nextInt();
        turma1.setTotalVagas(totalVagas);
        
        System.out.println("Informe a sala: ");
        sala = Ler.next();
        turma1.setSala(sala);
        
        System.out.println("Informe o horario: ");
        horario = Ler.next();
        turma1.setHorario(sala);
        
        
        
        if(novoAluno1.getNome() != ""){
        System.out.println("Aluno encontrado");
        }
        else{
        System.out.println("Aluno não encontrado");
                }
        
    

        //------------------------------//
        
        
        Aluno novoAluno2 = new Aluno(nome, idade, email, telefone, cpf);
        System.out.println("Informe o nome do ALUNO1: ");
        nome = Ler.next();
        System.out.println("Informe A IDADE do ALUNO1: ");
        idade = Ler.nextInt();
        System.out.println("Informe O EMAIL do ALUNO1: ");
        email = Ler.next();
        System.out.println("Informe O TELEFONE do ALUNO1: ");
        telefone = Ler.next();
        System.out.println("Informe O CPF do ALUNO1: ");
        cpf = Ler.next();
        
        novoAluno2.setNome(nome);
        novoAluno2.setIdade(idade);
        novoAluno2.setEmail(email);
        novoAluno2.setTelefone(cpf);
        novoAluno2.setCpf(cpf);

        Turma turma2 = new Turma(novoAluno2);
        System.out.println("Informe o codigo do Curso: ");
        codCurso = Ler.nextInt();
        turma2.setCodCurso(codCurso);
        
        System.out.println("Informe o numero da turma: ");
        numeroDaTurma = Ler.nextInt();
        turma2.setNumeroDaTurma(numeroDaTurma);
        
        System.out.println("Informe o total de vagas: ");
        totalVagas = Ler.nextInt();
        turma2.setTotalVagas(totalVagas);
        
        System.out.println("Informe a sala: ");
        sala = Ler.next();
        turma2.setSala(sala);
        
        System.out.println("Informe o horario: ");
        horario = Ler.next();
        turma2.setHorario(sala);
        
        
        // -------------------- //
        
        Aluno novoAluno3 = new Aluno(nome, idade, email, telefone, cpf);
        System.out.println("Informe o nome do ALUNO1: ");
        nome = Ler.next();
        System.out.println("Informe A IDADE do ALUNO1: ");
        idade = Ler.nextInt();
        System.out.println("Informe O EMAIL do ALUNO1: ");
        email = Ler.next();
        System.out.println("Informe O TELEFONE do ALUNO1: ");
        telefone = Ler.next();
        System.out.println("Informe O CPF do ALUNO1: ");
        cpf = Ler.next();
        
        novoAluno3.setNome(nome);
        novoAluno3.setIdade(idade);
        novoAluno3.setEmail(email);
        novoAluno3.setTelefone(cpf);
        novoAluno3.setCpf(cpf);

        Turma turma3 = new Turma(novoAluno3);
        System.out.println("Informe o codigo do Curso: ");
        codCurso = Ler.nextInt();
        turma2.setCodCurso(codCurso);
        
        System.out.println("Informe o numero da turma: ");
        numeroDaTurma = Ler.nextInt();
        turma3.setNumeroDaTurma(numeroDaTurma);
        
        System.out.println("Informe o total de vagas: ");
        totalVagas = Ler.nextInt();
        turma3.setTotalVagas(totalVagas);
        
        System.out.println("Informe a sala: ");
        sala = Ler.next();
        turma3.setSala(sala);
        
        System.out.println("Informe o horario: ");
        horario = Ler.next();
        turma3.setHorario(sala);
    }
}
