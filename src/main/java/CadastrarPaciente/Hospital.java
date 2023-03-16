/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CadastrarPaciente;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Hospital {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        String nomeSintoma = "";
        String descricaoSintoma = "";
        int quantosDiasSintoma = 0;
        int grauDaDor = 0;
        
        
        String nome = "";
        int idade = 0;
        String email = "";
        String telefone = "";
        String cpf = "";
        
        cadastrarPaciente novoPaciente1 = new cadastrarPaciente(nome,idade,email,telefone,cpf);
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
        
        novoPaciente1.setNome(nome);
        novoPaciente1.setIdade(idade);
        novoPaciente1.setEmail(email);
        novoPaciente1.setTelefone(cpf);
        novoPaciente1.setCpf(cpf);
        
        
        
        cadastrarSintomas novoSintomas1 = new cadastrarSintomas(nomeSintoma, descricaoSintoma, quantosDiasSintoma, grauDaDor);
        System.out.println("Informe o nome Sintoma: ");
        nomeSintoma = Ler.next();
        System.out.println("Informe descrição sintoma: ");
        descricaoSintoma = Ler.next();
        System.out.println("Informe quantos dias sintomas: ");
        quantosDiasSintoma = Ler.nextInt();
        System.out.println("Informe o grau da dor: ");
        grauDaDor = Ler.nextInt();

        novoSintomas1.setNomeSintoma(nomeSintoma);
        novoSintomas1.setDescricaoSintoma(descricaoSintoma);
        novoSintomas1.setQuantosDiasSintoma(quantosDiasSintoma);
        novoSintomas1.setGrauDaDor(grauDaDor);
        
        cadastrarSintomas novoSintomas1 = new cadastrarSintomas(novoPaciente1);
        
        
        
        
        
        
        
    }

}
