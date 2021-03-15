
package Ativi5_1;

import java.util.Scanner;

public class Ativi5_1 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double num = 0,num2 = 0, soma = 0;
        double media = 0;
        int cont = 0;
        
        do{
            System.out.println("Digite o primeiro número: ");
            num = ler.nextDouble();
            System.out.println("Digite o segundo número: ");
            num2 = ler.nextDouble();   
            if(num>0 && num2>0){
                media = (num+num2)/2;
                soma = num+num2;
                System.out.println("Média: "+media);
                System.out.println("Soma: "+soma);
                cont++;
                System.out.println("Quantidade: "+cont);
                
            }else if(num<0 && num2<0){
                System.out.println("Somente Números Positivos Podem ser digitados, reinicie o sistema.");
            }else{
                System.exit(0);
            }
        }while(num>0 && num2>0);
           
    }
 }
