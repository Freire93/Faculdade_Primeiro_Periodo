import java.util.*;

public class JonatasExercicioVinteeUm{
   public static void main(String [] args){
   
   Scanner in = new Scanner (System.in);
   
   double graus,tamanho, alturaParede;
   
   
   System.out.print("Digite quantos graus tem a escada: ");
      graus = in.nextFloat();
     
   System.out.print("O tamanho da parede: ");
      alturaParede = in.nextFloat();
      
     tamanho = alturaParede / Math.cos(graus);
     
     System.out.printf("o tamanho da escade e : %.2f ", tamanho);
     
     
      
   
   
   
   }
}