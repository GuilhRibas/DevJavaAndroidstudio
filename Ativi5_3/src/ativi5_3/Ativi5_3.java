
package ativi5_3;

import java.util.Scanner;


public class Ativi5_3 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
       //  Maricota tem 1,10m e cresce 3 centímetros por ano. Construir um programa que calcule e imprima quantos 
              //   anos serão necessários para que Maricota seja maior que Mariazinha. MARIAZINHA = 1,50
           double mariazinha = 150;
           double maricota = 110;
           double anos = 0;   
      while(mariazinha>=maricota){
          mariazinha = mariazinha+2;
          maricota = maricota + 3;
          anos = anos + 1;
          System.out.println("Mariazinha: "+mariazinha);
          System.out.println("Maricota: "+maricota);
          System.out.println("Anos: "+anos);
      }
              
              
              
    }
    
}
