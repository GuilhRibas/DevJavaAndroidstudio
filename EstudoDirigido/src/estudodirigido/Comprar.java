/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guilh
 */
public class Comprar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produtos p1 = new Produtos();
        ArrayList<Produtos>itens = new ArrayList<>();
        int i = 0;
        int laco = 0;

        
   while(laco==0){
         System.out.println("Digite 0 para iniciar.");
        laco = ler.nextInt();
        int detalhe = 0;
               System.out.println("Faça o cadastro.");
               System.out.println("Digite um número maior que zero para iniciar: ");
               detalhe = ler.nextInt();
              for(;detalhe>0;detalhe++){
               int o = 0;
               o++;
               p1.codigo = o;     

               System.out.println("_____________________________");
               System.out.println("Código : "+p1.codigo);
               ler.nextLine();
               System.out.println("Descrição do produto: ");
               p1.setDescProd(ler.nextLine());


               System.out.println("Quantidade: ");
               p1.setQuantidade(ler.nextInt());
               System.out.println("Preço: ");
               p1.setPreco(ler.nextFloat());
               System.out.println("_____________________________");

               System.out.println("Cadastro Realizado Com Sucesso.");
               itens.add(p1);
               System.out.println("_____________________________");



        
    
        System.out.println("1 - Exibir carrinho: ");
        System.out.println("2 - Fechar Compra: ");
        i = ler.nextInt();
    
        switch(i){
            case 1:
                                      p1.ListarDados();
                                      System.out.println("Valor à pagar: ");
                System.out.println(p1.calcularValorFinal());
                break;
                
            case 2:
                System.out.println("Valor à pagar: ");
                System.out.println(p1.calcularValorFinal());
                break;
                   default:
        System.exit(0);
            break;
                
            
        }

        
        
        
    }
    
}
}
}