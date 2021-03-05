/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer2_4;
import java.util.Scanner;
/**
 *
 * @author Guilh
 */
public class Exer2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero1,numero2;
        
        System.out.println("Números Inteiros!!!!");
        System.out.println("_________________________");
        System.out.println("Informe o primeiro valor: ");
        numero1 = ler.nextInt();
        System.out.println("Informe o segundo valor: ");
        numero2 = ler.nextInt();
        System.out.println("_________________________");

            if(numero1 > numero2){
                System.out.println("O primeiro valor "+numero1+" é o maior número.");
            }else if(numero2 > numero1){
                System.out.println("O segundo valor "+numero2+" é o maior número.");
            }else if(numero1 == numero2){
                System.out.println("Valores iguais!");
            }else if(numero2 == numero1){
                System.out.println("Valores iguais!");
            }else{
                System.out.println("Valor Invalido!");
            }
        
        
    }
    
}
