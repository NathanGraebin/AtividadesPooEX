/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Advogado;

import java.util.Scanner;

/**
 *
 * @author Nathanelisabetinho
 */
public class GerenciadorAdvogados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        Advogado[] advogados = new Advogado[1];

        for (int i = 0; i < 1; i++) {
            advogados[i] = new Advogado("", 0);
        }

        String nome;
        int idade;
        int oab;
        String telefone;
        String cpf;
        String email;

        for (int i = 0; i < 1; i++) {

            System.out.print("Nome: ");
            nome = Ler.next();

            System.out.print("Idade: ");
            idade = Ler.nextInt();

            advogados[i] = new Advogado(nome, idade);

            System.out.print("Telefone: ");
            telefone = Ler.next();
            advogados[i].setTelefone(telefone);


            System.out.print("Cpf: ");
            cpf = Ler.next();
            advogados[i].setCpf(cpf);

            System.out.print("Email: ");
            email = Ler.next();
            advogados[i].setEmail(email);
            
            System.out.print("OAB: ");
            oab = Ler.nextInt();
            advogados[i].setOab(oab);
            

        }

        for (int i = 0; i < 1; i++) {

            System.out.println(" " + advogados[i].mostrarInformacoes());

        }

    }
}
