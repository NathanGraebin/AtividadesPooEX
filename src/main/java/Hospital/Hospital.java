//Criar um projeto para Cadastrar Alunos.
//Criar uma classe para definir Aluno com no mínimo 5 atributos com tipos de dados diferentes e privados. 
//A Classe também deverá ter um método construtor para atribuir 2 atributos principais no construtor e mais 3 métodos para definir os outros atributos;
//Criar uma classe para definir Turma com no mínimo 4 atributos e 1 desses atributos deverá ser referência da classe aluno;
//Na Classe principal solicitar o cadastro de 3 Alunos utilizando o método construtor e 
//solicitando o preenchimento através dos outros métodos que definem os atributos;
//Na Classe principal solicitar o cadastro de 2 turmas e cada turma deverá ter no mínimo 1 aluno cadastrado ao
//escolher o aluno deverá validar se o aluno está cadastrado;
package Hospital;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Hospital {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        int codSintoma = 0;
        String descricaoSintoma = "";
        int quantosDiasSintoma = 0;
        int grauDaDor = 0;

        String nome = "";
        int idade = 0;
        String email = "";
        String telefone = "";
        String cpf = "";

        cadastroPaciente novoPaciente1 = new cadastroPaciente(nome, idade, email, telefone, cpf);
        System.out.println("Informe o nome do PACIENTE1: ");
        nome = Ler.next();
        System.out.println("Informe a IDADE do PACIENTE1: ");
        idade = Ler.nextInt();
        System.out.println("Informe o E-MAIL do PACIENTE1: ");
        email = Ler.next();
        System.out.println("Informe o TELEFONE do PACIENTE1: ");
        telefone = Ler.next();
        System.out.println("Informe o CPF do PACIENTE1: ");
        cpf = Ler.next();

        novoPaciente1.setNome(nome);
        novoPaciente1.setIdade(idade);
        novoPaciente1.setEmail(email);
        novoPaciente1.setTelefone(cpf);
        novoPaciente1.setCpf(cpf);

        cadastroSintomas novoSintoma1 = new cadastroSintomas(novoPaciente1);
        // cria uma novo sintoma referenciando o paciente
        
        
        
        System.out.println("Informe o codigo do Curso: ");
        codSintoma = Ler.nextInt();
        novoSintoma1.setCodSintoma(codSintoma);

        System.out.println("Informe o numero da turma: ");
        descricaoSintoma = Ler.next();
        novoSintoma1.setDescricaoSintoma(descricaoSintoma);

        System.out.println("Informe o total de vagas: ");
        quantosDiasSintoma = Ler.nextInt();
        novoSintoma1.setQuantosDiasSintoma(quantosDiasSintoma);

        System.out.println("Informe a sala: ");
        grauDaDor = Ler.nextInt();
        novoSintoma1.setGrauDaDor(grauDaDor);
        
        System.out.println(novoSintoma1.getNovoPaciente1());
       
        
        if (novoPaciente1.getNome() != "") {
            System.out.println("Aluno encontrado");
        } else {
            System.out.println("Aluno não encontrado");
        }

        //------------------------------//
        
    }
}
