
package exer2_app;

import java.util.Scanner;


public class Exer2_app {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int valorRaio;
        
        System.out.println("Digite o valor do raio: ");
        valorRaio = ler.nextInt();
        
        double diametro = valorRaio * 2;
        double quarto = diametro / 4;
        System.out.println("Valor do diamêtro: " + (diametro));
        System.out.println("1 Quarto: " + (quarto));
    }
    
}
