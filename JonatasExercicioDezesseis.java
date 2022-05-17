import java.util.*;

public class JonatasExercicioDezesseis{
   public static void main (String [] args){
   
   Scanner in = new Scanner(System.in);
      
      float minutos,hora, resto;
      
   System.out.print("Digite os minutos a serem convertidos: ");
      
         minutos = in.nextFloat();
         
         hora = minutos / 60;
         
         resto = minutos % 60;
    
   System.out.print("Em hora e : " +hora+ " "+resto);  
     
   
   }
}
