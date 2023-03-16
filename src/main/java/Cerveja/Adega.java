//Criar um projeto para Cadastrar Cerveja.
//Criar uma Classe Cerveja com 4 Atributos Públicos e 2 Atributos Privados; 
//A Classe deverá conter um construtor preenchendo 1 atributo privado e o outro atributo privado deverá ser chamado de Código e 
//esse deverá ser incremental; 
//Deverá conter 1 Método para preencher cada atributo público;
//A Classe também deverá conter 1 método para retornar o valor do atributo Código;
//Na Classe Principal solicitar o Cadastro de 5 Cervejas preenchendo todos atributos;
//Na Classe Principal retornar todas as Cervejas cadastradas; 
package Cerveja;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Adega {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        
        
        System.out.println("Cadastre a Nova Cerveja 1 : ");
        Cerveja novaCerveja1 = new Cerveja("","");
        novaCerveja1.cadastrar();
        System.out.println("Marca :" + novaCerveja1.getMarca());
        System.out.println("Quantidade Estoque :" + novaCerveja1.getQuantidadeEstoque());
        System.out.println("Cor da cerveja :" + novaCerveja1.getCor());
        System.out.println("Cor da Garrafa :" + novaCerveja1.getCorGarrafa());
        System.out.println("Codigo :" + novaCerveja1.getCodigo());
        System.out.println("Tipo :" + novaCerveja1.getTipo());
        System.out.println("Quantidade de Ml's :" + novaCerveja1.getQuantidadeMl());
        System.out.println("==============================");
        
        System.out.println("Cadastre a Nova Cerveja 2 : ");
        Cerveja novaCerveja2 = new Cerveja("","");
        novaCerveja2.cadastrar();
        System.out.println("Marca :" + novaCerveja2.getMarca());
        System.out.println("Quantidade Estoque :" + novaCerveja2.getQuantidadeEstoque());
        System.out.println("Cor da cerveja :" + novaCerveja2.getCor());
        System.out.println("Cor da Garrafa :" + novaCerveja2.getCorGarrafa());
        System.out.println("Codigo :" + novaCerveja2.getCodigo());
        System.out.println("Tipo :" + novaCerveja2.getTipo());
        System.out.println("Quantidade de Ml's :" + novaCerveja2.getQuantidadeMl());
        System.out.println("==============================");
        
        System.out.println("Cadastre a Nova Cerveja 3 : ");
        Cerveja novaCerveja3 = new Cerveja("","");
        novaCerveja3.cadastrar();
        System.out.println("Marca :" + novaCerveja3.getMarca());
        System.out.println("Quantidade Estoque :" + novaCerveja3.getQuantidadeEstoque());
        System.out.println("Cor da cerveja :" + novaCerveja3.getCor());
        System.out.println("Cor da Garrafa :" + novaCerveja3.getCorGarrafa());
        System.out.println("Codigo :" + novaCerveja3.getCodigo());
        System.out.println("Tipo :" + novaCerveja3.getTipo());
        System.out.println("Quantidade de Ml's :" + novaCerveja3.getQuantidadeMl());
        System.out.println("==============================");
        
        System.out.println("Cadastre a Nova Cerveja 4 : ");
        Cerveja novaCerveja4 = new Cerveja("","");
        novaCerveja4.cadastrar();
        System.out.println("Marca :" + novaCerveja4.getMarca());
        System.out.println("Quantidade Estoque :" + novaCerveja4.getQuantidadeEstoque());
        System.out.println("Cor da cerveja :" + novaCerveja4.getCor());
        System.out.println("Cor da Garrafa :" + novaCerveja4.getCorGarrafa());
        System.out.println("Codigo :" + novaCerveja4.getCodigo());
        System.out.println("Tipo :" + novaCerveja4.getTipo());
        System.out.println("Quantidade de Ml's :" + novaCerveja4.getQuantidadeMl());
        System.out.println("==============================");
        
        System.out.println("Cadastre a Nova Cerveja 5 : ");
        Cerveja novaCerveja5 = new Cerveja("","");
        novaCerveja5.cadastrar();
        System.out.println("Marca :" + novaCerveja5.getMarca());
        System.out.println("Quantidade Estoque :" + novaCerveja5.getQuantidadeEstoque());
        System.out.println("Cor da cerveja :" + novaCerveja5.getCor());
        System.out.println("Cor da Garrafa :" + novaCerveja5.getCorGarrafa());
        System.out.println("Codigo :" + novaCerveja5.getCodigo());
        System.out.println("Tipo :" + novaCerveja5.getTipo());
        System.out.println("Quantidade de Ml's :" + novaCerveja5.getQuantidadeMl());
        System.out.println("==============================");
        
        
}
    
   
    
    
}

