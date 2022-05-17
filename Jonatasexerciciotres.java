import java.util.*;

public class Jonatasexerciciotres{
 public static void main (String []args){
    
    Scanner in = new Scanner(System.in);
   
   float n1,n2,n3,resultado;
   
   System.out.println("Digite os 3 numeros desejados, porem o terceiro nao pode ser zero.");
     n1 = in.nextFloat();
     n2 = in.nextFloat();
     n3 = in.nextFloat();
 
 
 if(n3==0){
   while(n3 == 0){
     System.out.println("Divisor igual a zero, tente outro numero:");
     n3 = in.nextFloat();
 }
  };
            resultado = (n1 + n2) / n3;
            
    System.out.print("O resulado vale: "+resultado);        
   
   
   
   
   }
 }