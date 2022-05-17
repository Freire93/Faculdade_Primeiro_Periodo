import java.util.*;

public class Jonatasexercicioquatro {
    public static void main(String args[]) {
    
     Scanner in = new Scanner (System.in);
     float n1,n2,n3,p1,p2,p3,media;
     
     System.out.print("Digite a nota um: ");
         n1 = in.nextFloat(); 
     System.out.print("Digite a peso um: ");
          p1 = in.nextFloat();
     
     System.out.print("Digite a nota dois: ");
          n2 = in.nextFloat();
     System.out.print("Digite o peso dois: ");
         p2 = in.nextFloat();
     
     System.out.print("Digite a nota tres: ");
          n3 = in.nextFloat();
     System.out.print("Digite o peso tres: ");
         p3 = in.nextFloat();
     
     media = ((n1 + p1) + (n2 +p2) + (n3 + p3))/3;
     
     System.out.print("A media do aluno :"+media);
    }
}