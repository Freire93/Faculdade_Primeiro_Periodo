import java.util.*;

public class jonatasExercicioOnze{
   public static void main(String [] args){
   
   Scanner in = new Scanner(System.in);
   
   float salario, sobrou, conta1, conta2;
   
   System.out.print("Digite o salario: ");
      salario = in.nextFloat();
      
   System.out.print("valor da primeira conta: ");
      conta1 = in.nextFloat();
      
   System.out.print(" valor da segunda conta: ");
      conta2 = in.nextFloat();   
   
   conta1 =(float) conta1 *(float) 1.02;
   conta2 =(float) conta2 *(float) 1.02;
   
   sobrou = salario - (conta1 + conta2);
   
   System.out.printf("vai receber %.2f", sobrou);
   
         
   
   }
}