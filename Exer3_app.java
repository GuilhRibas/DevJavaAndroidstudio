
package exer3_app;

import java.util.Scanner;


public class Exer3_app {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double a;
        
        System.out.println("Digite um valor: ");
        a = ler.nextDouble();
        
        double dobro = a * 2;
        double triplo = a * 3;
        double confuso = (dobro * 3)/2;
        double quadrado = a * a;
        double quinta = dobro /5;
        
        System.out.println("Dobro: " +(dobro));
        System.out.println("Triplo: " + (triplo));
        System.out.println("A metade do triplo do dobro: "+(confuso));
        System.out.println("Qadrado do número: "+(quadrado));
        System.out.println("A quinta parte: "+(quinta));
        
    }
    
}
