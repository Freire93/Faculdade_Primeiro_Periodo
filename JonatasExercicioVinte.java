import java.util.*;

public class JonatasExercicioVinte{
   public static void main(String [] args){
   
   Scanner in = new Scanner(System.in);
   
   double horasTrab, salarioMinimo, horasExtras,salarioBruto, salarioReceber, valorPorHora,salarioExtra,valorHoraExtra;
   
   System.out.println("Qual o valor do salario minimo ? ");
      salarioMinimo = in.nextDouble();
      
   System.out.println("Digite as horas trabalhadas: ");
      horasTrab = in.nextDouble();
      
   System.out.println("Quantas horas extras foram feitas ? ");
      horasExtras= in.nextDouble();   
      
         valorPorHora = salarioMinimo * 0.125;
         valorHoraExtra = salarioMinimo * 0.25;
      
         salarioBruto = horasTrab * valorPorHora;
         salarioExtra = horasExtras * valorHoraExtra;
      
         salarioReceber = salarioBruto + salarioExtra;
      
      
    System.out.printf("O salario do funcionario e de %.2f", salarioReceber);  
      
      
      
   
   }
}