import java.util.*;
public class jonatasExercicioDez {
   public static void main(String [] args){
   
         Scanner in = new Scanner(System.in);
         
         double  montante, capital, taxaJuros, tempoAplicado;
   
      System.out.print("Qual o valor aplicado : ");
         capital = in.nextDouble();
      
      System.out.print("Qual a taxa de juros ao mes ? ");
         taxaJuros = in.nextDouble();
         
         taxaJuros = taxaJuros / 100;
         
      System.out.print("Quanto tempo sera aplicado em meses ? ");
        
         tempoAplicado = in.nextDouble();
         montante = capital * Math.pow(1 + taxaJuros, tempoAplicado);
      
      System.out.printf("Voce recebera %.2f apos o final de "+tempoAplicado+ " meses", montante);      
         
   
   }
}