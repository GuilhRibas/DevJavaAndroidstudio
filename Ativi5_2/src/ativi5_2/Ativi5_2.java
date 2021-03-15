
package ativi5_2;

import java.util.Arrays;
import java.util.Scanner;


public class Ativi5_2 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero = 0,soma = 0;
        
        do{
            System.out.println("Digite um número: ");
            numero = ler.nextDouble();
            soma += numero;
            
        }while(numero>=1);
            System.out.println("Soma: "+soma);
              
        
        
        
    }
   
}
