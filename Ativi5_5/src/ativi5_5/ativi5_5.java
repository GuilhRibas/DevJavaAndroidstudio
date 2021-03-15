/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativi5_5;

import java.util.ArrayList;
public class ativi5_5 {
    public static void main(String[] args) {
        
        //criação de um ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add ("Refrigerante 2 litros");
        lista.add("Mamão papaia");
        lista.add("Granola");
        lista.add("Maça");
        lista.add("suco");
        
        
        //impressão do ArrayList
        System.out.println("Imprimindo o ArrayList: " + lista);
        
        //consultando um índice específico
        System.out.println("Consultando um índice do ArrayList - índice 1: " +lista.get(1));
        
        //mudando um índice
        lista.set(2, "Uva");
        System.out.println("Mudando o valor do índice 02" + lista);
        
        //retornar o tamanho do ArrayList
        System.out.println("O Tamanho do Array List é: " + lista.size());
        
        //removendo um índice
        System.out.println("Os elementos atuais são: " + lista);
        //removendo o ínidcde
        lista.remove(1);
        System.out.println("Os elementos atuais são: " + lista);
        
        //remover o ArrayList
        lista.clear();
        System.out.println(lista);
    }
    
}