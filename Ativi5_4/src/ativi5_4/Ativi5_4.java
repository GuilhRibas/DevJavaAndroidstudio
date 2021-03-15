
package ativi5_4;

import java.util.Scanner;
class Ativi5_4 {

    
public static void main(String[] args) {

        double MassaInicial = 0;
        double MassaFinal       = 0;
        int       Segundos     = 0;

        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Informe a massa inicial em gramas.");

 

        MassaInicial    = Double.parseDouble(Entrada.nextLine());

        MassaFinal  = MassaInicial;

 

        // Calcula a massa final do proutod usado...

        while(MassaFinal > 0.5){

            // System.out.println("Massa: " + MassaFinal);

            MassaFinal /= 2;

            Segundos += 50;

        }

 

        System.out.printf("Massa Inicial: %.2f\n", MassaInicial);

        System.out.printf("Massa Final..: %.4f\n", MassaFinal);

        System.out.println("Tempo Total.: " + FormataSegundos(Segundos));

    }

 

    // Este método faz o cálculo para transformar segundos em hora:minutos:segundos...

    private static String FormataSegundos(int Seg){

        int Hora, Minuto, Segundos;

 

        Hora     = (int)(Seg / (60 * 60));

        Minuto   = (int)((Seg - (Hora * 60 * 60)) / 60);

        Segundos = (int)(Seg - (Hora * 60 * 60) - (Minuto * 60));

 

        return  String.format("%02d:%02d:%02d", Hora, Minuto, Segundos);

    }

}