/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bicicletas;

import java.util.Scanner;

/**
 *
 * @author Nathanelisabetinho
 */
public class LojaBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        Bicicleta novaBicicleta[] = new Bicicleta[4];

        for (int i = 0; i < novaBicicleta.length; i++) {
            novaBicicleta[i] = new Bicicleta("", 0);
        }
        int op = -1;
        while (op != 0) {

            System.out.println("[1]CADASTRAR BICICLETAS");
            System.out.println("[2]VERIFICAR BICICLETAS CADASTRADAS");
            op = Ler.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < novaBicicleta.length; i++) {
                        if (novaBicicleta[i].getCodigoBicileta() == 0) {
                            System.out.println("Informe o modelo : ");
                            novaBicicleta[i].setModelo(Ler.next());
                            
                            System.out.println("Informe a cor : ");
                            novaBicicleta[i].setCor(Ler.next());
                            
                            System.out.println("Informe o Codigo : ");
                            novaBicicleta[i].setCodigoBicileta(Ler.nextInt());
                            
                            System.out.println("Informe o Aro : ");
                            novaBicicleta[i].setAro(Ler.nextInt());
                            
                            System.out.println("Informe a Marca do Banco : ");
                            novaBicicleta[i].setBanco(Ler.next());
                            
                            System.out.println("Informe a Marca do Guidão : ");
                            novaBicicleta[i].setGuidao(Ler.next());
                            
                            System.out.println("Informe a Marca do Quadro : ");
                            novaBicicleta[i].setQuadro(Ler.next());
                            i = novaBicicleta.length;
                            

                        }
                    }

                    break;
                    
                case 2:
                    int informarQuantidadeVerificacao;
                    System.out.print("Informe quantas bicicletas você quer verificar");
                    informarQuantidadeVerificacao = Ler.nextInt();
                    
                    for (int i = 0; i < informarQuantidadeVerificacao; i++) {
                        if(novaBicicleta[i].getModelo() != null){
                    System.out.println("Modelo : " + novaBicicleta[i].getModelo() +"  "+ "Cor : " + novaBicicleta[i].getCor());
                    System.out.println("Codigo Bicileta : " + novaBicicleta[i].getCodigoBicileta() +"  "+ "Aro : " + novaBicicleta[i].getAro());
                    System.out.println("Banco : " + novaBicicleta[i].getBanco() +"  "+"Guidão : "+novaBicicleta[i].getGuidao());
                    System.out.println("Quadro : " + novaBicicleta[i].getQuadro());
                    System.out.println("#########################################################################");
                    
                        }
                        
                    }
            }

        }
    }
}
