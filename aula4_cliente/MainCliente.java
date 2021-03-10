
package aula4_cliente;

import java.util.Scanner;

public class MainCliente {
 public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    Aula4_cliente a1 = new Aula4_cliente();
    
     System.out.println("Digite seu nome: ");
     a1.setNome(ler.nextLine());
     System.out.println("Digite sua idade: ");
     a1.setIdade(ler.nextInt());
     System.out.println("Digite sua renda: ");
     a1.setRenda(ler.nextDouble());
     System.out.println(a1);
     
 }   
}
