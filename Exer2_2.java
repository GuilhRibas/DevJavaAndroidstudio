/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer2_2;

import java.util.Scanner;

/**
 *
 * @author Guilh
 */
public class Exer2_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero,num;
        
        System.out.println("Digite um número A: ");
        numero = ler.nextInt();
        System.out.println("Digite um número B: ");
        num = ler.nextInt();
        
        if(numero == num){
            System.out.println("Números Iguais!");
        }else if(numero != num){
            System.out.println("Números Diferentes!");
        }else{
            System.out.println("Valor Inválido.");
        }
        
        
    }
    
}

