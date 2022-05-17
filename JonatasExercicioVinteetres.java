import java.util.*;

public class JonatasExercicioVinteetres{
   public static void main(String [] args){
   
   Scanner in = new Scanner(System.in);
   
   int ABC, BC, AC, AB, C, B, A, totalPessoas, nenhumaNovela, assistemNovela;
   
   System.out.println("Quantas pessoas foram entrevistadas ? ");
      totalPessoas = in.nextInt();
      
   System.out.print("Quantas pessoas asistem a novela A ? ");
      A = in.nextInt();
   
   System.out.print("Quantas pessoas asistem a novela B ? ");
      B = in.nextInt();  
   
   System.out.print("Quantas pessoas asistem a novela C ? ");
      C = in.nextInt();  
   
   System.out.print("Quantas pessoas asistem a novela AB ? ");
      AB = in.nextInt();  
   
   System.out.print("Quantas pessoas asistem a novela AC ? ");
      AC = in.nextInt();  
   
   System.out.print("Quantas pessoas asistem a novela BC ? ");
      BC = in.nextInt();  
   
   System.out.print("Quantas pessoas asistem a novela ABC ? ");
      ABC = in.nextInt(); 
      
      
        assistemNovela =(A + B + C - (A - B) - (A - C) - (B - C) + (A - B- C)); 
        
        nenhumaNovela = totalPessoas - assistemNovela;
        
        System.out.print("O numero de pessoas que nao assitem nenhuma novela e : "+nenhumaNovela); 
   
  }  
}   