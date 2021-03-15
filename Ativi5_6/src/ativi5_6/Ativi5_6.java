/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativi5_6;

import java.util.Arrays;

public class Ativi5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        double soma = 0;
        
        System.out.println("Números:");
        for(int i = 0; i < 50; i++)  {          
        soma+=numeros[i];
        System.out.println("\nNúmero:"+numeros[i]);
         
        }
        //usando o método toString para exibir os valores do Array
        System.out.println(Arrays.toString(numeros));
        System.out.println("Soma: "+soma);
        
        //usando o atributo length = comprimento do array
        System.out.println("O array contém " + numeros.length+" Números");
    }
    
}