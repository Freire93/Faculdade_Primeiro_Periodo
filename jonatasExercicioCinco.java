import java.util.*;

public class jonatasExercicioCinco{
   public static void main(String [] args){
      
      Scanner in = new Scanner(System.in);
      
      float salarioBase, salarioAReceber, gratificacao;
      
      System.out.print("Digite o salario base do funcionario: ");
      
         salarioBase = in.nextFloat();
        
       System.out.print("Digite a porcentagem de bonus: " );  
                 
            gratificacao = in.nextFloat();
         
            gratificacao = (gratificacao)/100;
         
         salarioAReceber =  (salarioBase * (1 + gratificacao)) * (float)0.95;
         
       System.out.print("O salario a receber depois do desconto do imposto e de : " + salarioAReceber);  
         
   
   
   
   
   }
}