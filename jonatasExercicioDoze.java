import java.util.*;

public class jonatasExercicioDoze{
   public static void main(String [] args){
   
   Scanner in = new Scanner(System.in);
   
   float km, TA, TB, TC,distancia, voltas;
   
   System.out.print("Qual a distancia precisa percorrer em KM: ");
      km = in.nextFloat();
      
   System.out.print("O tamanho da rua A em metros: ");
      TA = in.nextFloat();
    
   System.out.print("O tamanho da rua B em metros: ");
      TB = in.nextFloat();
      
   System.out.print("O tamnho da rua C em metros: ");
      TC = in.nextFloat();
      
         distancia = TA + TB + TC;
      
         km = km * 1000;
         
         voltas = km / distancia;
    
    System.out.print("Devera dar " + voltas+ " no quarteirao");        
      
      
              
   }
}