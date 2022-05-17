import java.util.*;

public class JonatasExercicioDezoito{
   public static void main(String [] args){
   
   Scanner in = new Scanner(System.in);
   
      float salarioMinimo, Watt,valorWatts, valorConsumo,desconto;
   
   System.out.print("Digite o valor do salario minimo: ");
      
      salarioMinimo = in.nextFloat();
   
   System.out.print("Digite quanto quilowatt foram consumidos: ");
   
      Watt = in.nextFloat();
      
         valorWatts = salarioMinimo / 5;
         valorConsumo = Watt * valorWatts;
         desconto =(float) valorConsumo * (float)0.85;
         
   System.out.println("Valor pago por cada quilowatt: "+ valorWatts);
   
   System.out.println("Valor total de consumo: "+valorConsumo);
   
   System.out.println("valor com desconto de 15%: "+desconto);      
         
   
   }
}