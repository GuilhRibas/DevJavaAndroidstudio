
package aula4_cliente;

/**
 *
 * @author Guilh
 */
public class Aula4_cliente {

   private String nome;
   private int idade;
   private double renda;
    
   public String getNome(){
       return nome;
   }
    
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public int getIdade(){
       return idade;
   }
   
   public void setIdade(int idade){
       this.idade = idade;
   }
   
   public double getRenda(){
       return renda;
   }
   
   public void setRenda(double renda){
       this.renda = renda;
   }
   
   public String verificarIdade(){
       if(idade>=18){
           return "maior de idade";
       }else{
           return "menor de idade";
       }
       
       
   }
   
   public String verificarRenda(){
       if(renda>15000){
           return "Rico";
       }else if(renda<15000){
          return "pobre;";
       }
       return null;
   }
   
   @Override
   public String toString(){
       return "\nNome: "+nome+
              "\nIdade: "+idade+
               "\nRenda: "+renda+
               "\nIdade verificada: "+verificarIdade()+
               "\nRenda verificada: "+verificarRenda();
   }
   
   
}
