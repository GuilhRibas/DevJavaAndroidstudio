/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinhos {
   
    ArrayList<Produtos>itens = new ArrayList<>();

    Scanner ler = new Scanner(System.in);
    Produtos p1 = new Produtos();
            
    public double fecharCompras(){
       double TOTAL = p1.calcularValorFinal();
                System.out.println("Total À Pagar: ");
                return TOTAL;
    } 
    
    public double exibirCarrinho(){
        p1.ListarDados();
        return 0;
    }
 
     
}

