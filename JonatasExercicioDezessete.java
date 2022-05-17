import java.util.*;

public class JonatasExercicioDezessete{
   public static void main(String [] args){
   
      Scanner in = new Scanner(System.in);
      
      
      double numero,parteInteira, resultado2;
      
      System.out.print("Digite o numero desejado: ");
      
         numero = in.nextDouble();
         
         parteInteira = (int)numero;
         resultado2 = numero - parteInteira;
       
       
       
                
      System.out.println("A parte real vale: "+parteInteira);
      System.out.print("A parte fracionaria vle: "+resultado2); 
       
      
   }
}