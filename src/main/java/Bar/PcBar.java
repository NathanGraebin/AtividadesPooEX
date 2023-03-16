/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bar;

import java.util.Scanner;

/**
 *
 * @author Nathanelisabetinho
 */
public class PcBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        cadastrarPedido novoPedido[] = new cadastrarPedido[5];
        for (int i = 0; i < novoPedido.length; i++) {
            novoPedido[i] = new cadastrarPedido();
        }

        int op = -1;
        while (op != 0) {

            System.out.println("[1]CADASTRAR NOVO PEDIDO");
            System.out.println("[2]VERIFICAR PEDIDOS");
            op = Ler.nextInt();
            switch (op) {
                case 1:

                    for (int i = 0; i < novoPedido.length; i++) {
                        if (novoPedido[i].getNumeroPedido() == 0) {
                            System.out.println("Informe o numero do PEDIDO : ");

                            novoPedido[i].setNumeroPedido(Ler.nextInt());

                            System.out.println("Informe o numero da MESA : ");
                            novoPedido[i].setNumeroMesa(Ler.nextInt());

                            System.out.println("Informe o PRODUTO: ");
                            novoPedido[i].setProdutoPedido(Ler.next());

                            System.out.println("Informe a QUANTIDADE do produto : ");
                            novoPedido[i].setQuantidadeDoProduto(Ler.nextInt());

                            System.out.println("Informe o VALOR do produto : ");
                            novoPedido[i].setValorProduto(Ler.nextInt());
                            i = novoPedido.length;
                        } else {
                            System.out.println("VETOR " + i + " OCUPADO VA PARA O PROXIMO ");
                        }
                    }

                    break;

                case 2:
                    for (int i = 0; i < novoPedido.length; i++) {
                        System.out.println(novoPedido[i].getNumeroPedido());
                        System.out.println(novoPedido[i].getNumeroMesa());
                        System.out.println(novoPedido[i].getValorProduto());
                        System.out.println(novoPedido[i].getQuantidadeDoProduto());
                        System.out.println(novoPedido[i].getValorProduto());
                    }
                    break;
            }
        }

    }
}
