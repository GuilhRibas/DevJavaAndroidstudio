/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer1_app;

import java.util.Scanner;


public class Exer1_app {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int nota1;
         int nota2;
           int nota3;
       
        
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextInt();
        System.out.println("Digite a terceira nota: ");
        nota3 = ler.nextInt();
        
        int media = (nota1 + nota2 + nota3)/3;

        
        System.out.println("Resultado Da média: " + (media));
        
    }
    
}
