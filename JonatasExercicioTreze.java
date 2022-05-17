import java.util.*;
public class JonatasExercicioTreze{
   public static void main(String [] args){
   
      Scanner in = new Scanner(System.in);
      
         int anoAtual, realizadas,quantidadeDeCopas;
      
      System.out.print("Qual ano atual? ");
      
         anoAtual = in.nextInt();
      
         realizadas = (anoAtual - 1930)/ 4;
         quantidadeDeCopas = realizadas - 2;
      
      System.out.print("O numero de copas ja realizadas e de : " +quantidadeDeCopas);
      
   
   }
}