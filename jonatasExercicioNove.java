import java.util.*;

public class jonatasExercicioNove{
   public static void main(String [] args){
   
    Scanner in = new Scanner(System.in);
    
      int N,diagonais;
      
       System.out.println("Digite o numero de lados do poligono: ");
         N = in.nextInt();
         
        diagonais = (N * (N-3)) / 2;
        
       System.out.print("Diagonais = " + diagonais);  
      
   }

}