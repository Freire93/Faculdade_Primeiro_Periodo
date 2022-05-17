import java.util.*;
public class JonatasExercicioQuinze{
   public static void main(String [] args){
   
      Scanner in = new Scanner(System.in);
      
      float PI, raio, areaCir;
      
      
      System.out.print("Digite o tamanho do raio: ");
         
         raio = in.nextFloat();
         
         PI = (float)3.1416;
      
         areaCir = 2 * ( PI * raio);
         
      System.out.print("valor da circunferencia e: " + areaCir);
      
   
   }
}