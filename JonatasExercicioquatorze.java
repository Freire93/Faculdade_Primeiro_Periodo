import java.util.*;
public class JonatasExercicioquatorze{
   public static void main(String [] args){
   
      Scanner in = new Scanner(System.in);
      
      float altura, base, area, pot;
      
      System.out.print("Qual a largura do comodo ? ");
         
         base = in.nextFloat();
      
      System.out.print("Qual o tamanho do comodo ? ");
         
         altura = in.nextFloat();
         
         area = base * altura;
         pot = area * 18;
         
         
      System.out.println("A area do seu comodo e de " + area);
      System.out.print("Voce vai precisar de " +pot+" W de potencia para iluminar");
         
         
   }
}