/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido;

import java.util.Scanner;

/**
 *
 * @author Guilh
 */
public class Ativi_1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        main_1 m1 = new main_1();
        
        System.out.println("Digite seu nome: ");
        m1.nome = ler.nextLine();
        System.out.println("Digite o valor: ");
        m1.valor = ler.nextDouble();
        System.out.println("Resultado: "+m1.calcularDesconto());
    
}
}