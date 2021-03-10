
package biblioteca;

import java.util.Scanner;
import biblioteca.Cliente;
import biblioteca.Livro;

public class Biblioteca {
    
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
     Cliente c1 = new Cliente();
     Livro l1 = new Livro();
     
     
     System.out.println("=====Cadastrar cliente=====");
     
     System.out.println("Digite seu nome: ");
     c1.setNome(ler.next());
     
        System.out.println("Digite Sua idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite seu email: ");
        c1.setEmail(ler.next());
        
        
        System.out.println("=====Livro=====");
        
        System.out.println("Digite o autor do livro: ");
        l1.setAutor(ler.next());
        
        System.out.println("Digite a editora: ");
        l1.setEditora(ler.next());
        
        System.out.println("Digite o idioma do livro: ");
        l1.setIdioma(ler.next());
        
        System.out.println("Digite o ano de lançamento: ");
        l1.setAnoLanc(ler.nextInt());
        
        System.out.println("Digite o valor do livro: ");
        l1.setValor(ler.nextDouble());
        
        System.out.println("Digite o numero de paginas: ");
        l1.setPaginas(ler.nextInt());
        
        
        System.out.println("=====Cadastro=====");
        
        System.out.println("Cliente: \n");
        System.out.println(c1.toString());
        System.out.println("\n"+c1.verificarIdade()+"\n");
        
        System.out.println("Livro: \n");
        System.out.println(l1.toString());
        System.out.println("\n"+l1.verificarPaginas());
    }
}
