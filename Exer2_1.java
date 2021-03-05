
package exer2_1;

import java.util.Scanner;

/**
 *
 * @author Guilh
 */
public class Exer2_1 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um número: ");
        numero = ler.nextInt();
        
        if(numero>=0){
            System.out.println("Número Positivo!");
        }else if(numero<0){
            System.out.println("Número Negativo!");
        }else{
            System.out.println("Valor Inválido.");
        }
        
        
    }
    
}
