/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer2_3;

import java.util.Scanner;

/**
 *
 * @author Guilh
 */
public class Exer2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
      int valor;
      
        System.out.println("Informe um valor: ");
        valor = ler.nextInt();
        
        if (valor%2 == 0) {
            System.out.println("Par.");
        }else if(valor%2 == 1){
            System.out.println("Impar.");
        }else{
             System.out.println("Valor Inválido! ");
             }
    }
    
}
