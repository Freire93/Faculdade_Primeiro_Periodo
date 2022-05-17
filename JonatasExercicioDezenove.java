import java.util.*;

public class JonatasExercicioDezenove{
   public static void main (String[]args){
   
   Scanner in = new Scanner(System.in);
   
      float numero,quadrado,raiz,cubico,raizcubico;
      
      System.out.print("Digite o numero desejado: ");
      
         numero = in.nextInt();
         
         quadrado = (float)Math.pow(numero,2);
         raiz = (float)Math.sqrt(numero);
         cubico = (float)Math.pow(numero,3);
         raizcubico =(float)Math.cbrt(numero);
         
      System.out.println("Quadrado : "+quadrado);
      System.out.printf( "Raiz : %.2f\n",raiz);
      System.out.println("Elevado ao cubo: "+cubico);
      System.out.printf("Raiz cubica: %.2f\n", raizcubico);    
         
         
   
   
   }
}